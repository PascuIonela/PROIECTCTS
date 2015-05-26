

package controllers;

import java.util.ArrayList;
import model.Departament;


public class ListaDepartmente {
    private ArrayList<Departament> departamente = new ArrayList<>();

    public ArrayList<Departament> getDepartamente() {
        return departamente;
    }

    public void setDepartamente(ArrayList<Departament> departamente) {
        this.departamente = departamente;
    }
    
    public void adaugaDepartament(Departament d){
        this.departamente.add(d);
    }
}
