
package model;

import java.util.ArrayList;
import java.util.List;


public class Departament implements java.io.Serializable {

    private String serie;
    private int nrMaxAngajati;
    private ArrayList<Angajat> angajati;

    public Departament() {
        angajati = new ArrayList<>();
    }
    
    public Departament(ArrayList<Angajat> listaAngajati) throws Exception
    {
    	if(listaAngajati != null)
    		{
    		listaAngajati = new ArrayList<Angajat>();
    	for(int i=0;i<listaAngajati.size();i++)
			listaAngajati.add(listaAngajati.get(i));
    		}
		else throw new Exception("Lista este goala!");
    } 		
    
    public int nrAngajatiLista() {	
    	int rezultat = 0;
    		for (int i = 0; i < angajati.size(); i++) {
    			  if(angajati.get(i)!=null)
    				  rezultat ++ ;
    		  }
    		  return rezultat;
    }	
    
    public Departament(String serie, int nrMaxAngajati) {
        this.serie = serie;
        this.nrMaxAngajati = nrMaxAngajati;
        angajati = new ArrayList<>();
    }
    
    public Departament getDepartament(Departament d, String serie, int nrMax)
    {
    	d.serie = serie;
    	d.nrMaxAngajati = nrMax;
    	return d;
    	
    	
    }
    public String getSerie() 
    {
    	String index = serie.charAt(0)+""+serie.charAt(1)+""+serie.charAt(2);
    	if (index.contains("DEP"))
        return serie;
    	else
    		return "Seria trebuie sa inceapa cu DEP";
    } 

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNrMaxAngajati() {
    	if(nrMaxAngajati < 10)
        return nrMaxAngajati;
    	else 
    		return -1;
    }

    public void setNrMaxAngajati(int nrMaxAngajati) {
        this.nrMaxAngajati = nrMaxAngajati;
    }

    public ArrayList<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(ArrayList<Angajat> angajati) {
        this.angajati = angajati;
    }

    public void adaugaAngajat(Angajat angajat) throws PreaMultiAngajatiException {
        if (angajati.size() < nrMaxAngajati) {
            angajati.add(angajat);
        } else {
            throw new PreaMultiAngajatiException("Sunt prea multi angajati in departamentul " + serie);
        }
    }
    
    public String toString(){
        return serie+" "+nrMaxAngajati;
    }

    public static class PreaMultiAngajatiException extends Exception {

        public PreaMultiAngajatiException(String message) {
            super(message);
        }

    }

	
    
}

