
package controllers;

import java.util.ArrayList;
import model.Angajat;
import model.Departament;
import obspattern.DepartmentListener;
import obspattern.DepartmentSubject;


public class MainController implements DepartmentSubject{
    private static MainController singleton;
    
    private ListaAngajati listaAngajati;
    private ListaDepartmente listaDepartamente;
    
    private ArrayList<DepartmentListener> departmentListeners =
            new ArrayList<DepartmentListener>();
    
    private MainController(){
        listaAngajati = new ListaAngajati(null);
        listaDepartamente = new ListaDepartmente();
    }
    
    public static MainController getInstance(){
        if(singleton == null){
            singleton = new MainController();
        }
        
        return singleton;
    }
    
    public void adaugaDepartament(String seria, int nrMax){
        listaDepartamente.adaugaDepartament(new Departament(seria, nrMax));
        notifyDepartmentListeners();
    }
    
    public ArrayList<Departament> getDepartamente(){
        return listaDepartamente.getDepartamente();
    }
    
    public void adaugaAngajat(String nume, String cnp){
        listaAngajati.adaugaAngajat(new Angajat(nume, cnp));
    }
    
    public ArrayList<Angajat> getAngajati(){
        return listaAngajati.getAngajati();
    }
    
    public ArrayList<Angajat> getAngajatiFaraDepartament(){
        ArrayList<Angajat> angajati = new ArrayList<>();
        
        ArrayList<Angajat> totiAngajatii = getAngajati();
        ArrayList<Departament> toateDepartamentele = getDepartamente();
        
        for(Angajat a: totiAngajatii){
            boolean exista = false;
            
            for(Departament d: toateDepartamentele){
                if(d.getAngajati().contains(a)){
                    exista = true;
                    break;
                }
            }
            
            if(!exista){
                angajati.add(a);
            }
        }
        
        return angajati;
    }

    @Override
    public void addDepartmentListener(DepartmentListener dl) {
        departmentListeners.add(dl);
    }

    @Override
    public void notifyDepartmentListeners() {
        for(DepartmentListener dl: departmentListeners){
            dl.listaDepartamenteModificata();
        }
    }
}
