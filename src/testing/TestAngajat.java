package testing;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import model.Angajat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAngajat {

	Angajat angF;
	Angajat angM;
	Angajat angajat;
	

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}


	
	@Before
	public void setUp() throws Exception {
		angF = new Angajat("Ionela", "2931021394066"); 
	    angM = new Angajat("Adrian", "1900101394462");
	    angajat = new Angajat("Claudia", "29310236523652");
	}

	@After
	public void tearDown() throws Exception {
	}		
	
	@Test
	public void testEquals()
	{
		assertFalse(angF.equals(angM));
	}
	
	@Test
	public void testUpperCaseNume()
	{
		boolean ok;
		if(Character.isUpperCase(angF.getNume().charAt(0)))
			ok = true;
		else
			ok = false;
		assertEquals(true, ok);
	}
	

	
	@Test
	public void testEquals2()
	{
		Angajat a = null;
		assertFalse(angM.equals(a));
	}
	
	@Test
	public void testSex()
	{
		//assertEquals("F", angF.getSex());
		assertEquals("M", angM.getSex());
	}
	
	@Test
	public void testGetSex() {
		String sex = null;

		if ((Integer.parseInt("" + angF.getCnp().charAt(0))) % 2 == 0) {
			sex = "F";
		} else {
			sex = "M";
		}
		assertEquals(sex, angF.getSex());
	}
	
/*	@Test 
	public void testGetSex2()
	{
		Angajat a = new Angajat(null, "false");
		assertEquals("F", a.getSex());
	} */
	
	@Test
	public void testNationalitate() {
		int primaCifra= Integer.parseInt("" + angM.getCnp().charAt(0));
		String nationalitate =null;
		if(primaCifra>=1&&primaCifra<=6){
			nationalitate="roman";
		}
		else{
			nationalitate="strain";
		}
		assertEquals("roman", nationalitate);
	}
	
	@Test
	public void testFirstNumberCNP()
	{
		Angajat ang = new Angajat("Maria", "0741258963214");
		assertTrue(ang.checkFirstNumberCNP());
	}
	
	@Test
	public void testValiditateCNP()
	{
		assertTrue(angF.checkCNP());
	}


	
	@Test
	public void testValiditateCNP2()
	{
		assertFalse(angajat.checkCNP());
	}
	
	
	
	@Test
	public void testNume()
	{
		Angajat c = new Angajat("Maria", "2891025394065");
		Angajat f = new Angajat("1Claudia", "2700506332045");
		assertEquals("Maria", c.getNume());
		//assertEquals("1Claudia", f.getNume());
	}
	
	@Test 
	public void testLenghtNume()
	{
		Angajat a = new Angajat("Ion", null);
		assertTrue(a.checkLenghtNume());
	}
	
	@Test
	public void testVarsta()
	{
		assertEquals(21, angF.getVarsta());
	}
	
	@Test 
	public void testValiditateZi()
	{
		int zi = Integer.parseInt(angF.getCnp().charAt(5)+""+angF.getCnp().charAt(6));
		String ziOk;
		if (zi > 31)
			ziOk = "Eroare! Zi mai mare de 31.";
			else
				ziOk = "Ziua este valida.";
		assertEquals("Ziua este valida.", ziOk);
		
	}
	
	@Test 
	public void testValiditateLuna()
	{
		int luna = Integer.parseInt(angF.getCnp().charAt(3)+""+angF.getCnp().charAt(4));
		String lunaOK;
		if (luna > 12)
			lunaOK = "Eroare! Luna mai mare decat 12.";
			else
				lunaOK = "Luna este valida.";
		assertEquals("Luna este valida.", lunaOK);
	}
	
	@Test
	public void testIsAdult()
	{
		int varsta = angF.getVarsta();
		String validitate;
		if (varsta > 18)
		{		validitate = "Este adult";}
		else
		{	validitate = "Nu este adult";}
		assertEquals("Este adult", validitate);

	}

	
	
}

