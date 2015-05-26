
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Objects;


public class Angajat implements java.io.Serializable{
    private String nume;
    private String cnp;

    public Angajat() {
    }

	public String getSex(){
		switch(cnp.charAt(0)){
			case '1': return "M";
			case '2': return "F";
			case '3': return "M";
			case '4': return "F";
			case '5': return "M";
			case '6': return "F";
		}
		return "N/A";
	}
	
	
	
	public int getVarsta() {
		if (cnp.charAt(1) == '0') {
			if (Calendar.getInstance().get(8) > Integer.parseInt(""
					+ cnp.charAt(3) + cnp.charAt(4))) {
				if (Calendar.getInstance().get(5) > Integer.parseInt(""
						+ cnp.charAt(5) + cnp.charAt(6))) {
					return Calendar.getInstance().get(1)
							- (2000 + Integer.parseInt("" + cnp.charAt(1)
									+ cnp.charAt(2)));
				} else {
					return Calendar.getInstance().get(1)
							- (2000 + Integer.parseInt("" + cnp.charAt(1)
									+ cnp.charAt(2))) - 1;
				}
			} else {
				return Calendar.getInstance().get(1)
						- (2000 + Integer.parseInt("" + cnp.charAt(1)
								+ cnp.charAt(2))) - 1;
			}
		} else {
			if (Calendar.getInstance().get(8) > Integer.parseInt(""
					+ cnp.charAt(3) + cnp.charAt(4))) {

				if (Calendar.getInstance().get(5) > Integer.parseInt(""
						+ cnp.charAt(5) + cnp.charAt(6))) {
					return Calendar.getInstance().get(1)
							- (1900 + Integer.parseInt("" + cnp.charAt(1)
									+ cnp.charAt(2)));
				} else {
					return Calendar.getInstance().get(1)
							- (1900 + Integer.parseInt("" + cnp.charAt(1)
									+ cnp.charAt(2))) - 1;
				}
			} else {
				return Calendar.getInstance().get(1)
						- (1900 + Integer.parseInt("" + cnp.charAt(1)
								+ cnp.charAt(2))) - 1;
			}
			}
		}
	
	
	
	
	public boolean checkLenghtNume()
	{
		int i=0;
		while(i<nume.length())
			i++;
		if(i>2)
			return true;
		else
			return false;
		
	}
	
	public boolean checkFirstNumberCNP()
	{
		if (cnp.charAt(0)!=0)
			return true;
			else
				return false;
	}
	
	public boolean checkCNP(){
		int s=0;
		 String number="279146358279";
		for(int i=0;i<12;i++){
			s+=Integer.parseInt(""+number.charAt(i))*Integer.parseInt(""+cnp.charAt(i));			
		}
		int cifra=s%11;
		if(cifra==10)
			cifra=1;
		return cifra==Integer.parseInt(""+cnp.charAt(12));
	}
	    
    public Angajat(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
    	if(Character.isDigit(nume.charAt(0)) == false)
        return nume;
    	else
    		return "Numele incepe cu o cifra!";
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    
    public String toString(){
        return nume;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cnp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Angajat other = (Angajat) obj;
        if (!Objects.equals(this.cnp, other.cnp)) {
            return false;
        }
        return true;
    }
    
    
}
