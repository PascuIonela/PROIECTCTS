

package controllers;

import java.util.ArrayList;
import model.Angajat;


public class ListaAngajati {
    private ArrayList<Angajat> angajati = new ArrayList<Angajat>();

    
    
    public ListaAngajati(ArrayList<Angajat> angajati) {
		super();
		this.angajati = angajati;
	}

	public ArrayList<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(ArrayList<Angajat> angajati) {
        this.angajati = angajati;
    }
    
    public void adaugaAngajat(Angajat a){
    	if(a != null)
        this.angajati.add(a);
    	else
    		throw new IllegalArgumentException("Nu s-a transmis nimic ca parametru.");
    }
}
