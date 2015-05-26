package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import model.Angajat;
import model.Departament;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDepartament {
	
	Departament departamentHR;
	Departament departamentIT;
	Departament departamentIT2;
	Departament departamentInvalid;
	Departament lista;
	Angajat a1;
	Angajat a2;
	Departament departament;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		departamentHR = new Departament("DEP0024", 5);
		departamentIT = new Departament("DEP0123", 9);
		departamentIT2 = departamentIT.getDepartament(departamentIT, "DEP0012", 7);
		departamentInvalid = new Departament("DE12545", 3);
		a1 = new Angajat("Ionela", "293102134066");
		a2 = new Angajat("Gabriel", "1901022396524");
	
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSerie()
	{
		assertEquals("Seria trebuie sa inceapa cu DEP", departamentInvalid.getSerie());
	} 
	
	@Test
	public void testLimitInt()
	{
		int nrAngajati = departamentIT.getNrMaxAngajati();
		boolean ok;
		if (nrAngajati < Integer.MAX_VALUE)
			ok = true;
		else
			ok = false;
		assertEquals(true, ok);
	}
	
	// Testam sa vedem daca se poate crea o noua instanta de Departament vector
	@Test
	public void constructorTest() {			
		boolean correct = true;
		try{
			ArrayList<Angajat> list = new ArrayList<Angajat>();
			list.add(a1);
			list.add(a1);
				new Departament(list);
			}catch(Exception e){
				correct = false;
			}
			assertTrue(correct);
		}
	

	
	@Test
	public void testConstructorParamNull() {
			try {
				lista = new Departament(null);
			} catch (Exception e) {
			assertEquals("Lista este goala!", e.getMessage());
		}
	}
	
	@Test
	public void testSame()
	{
		assertSame(departamentIT, departamentIT2);
	}
	

	@Test
	public void testNrMaxAng()
	{
		assertEquals(5, departamentHR.getNrMaxAngajati());
	}

	@Test
	public void testIsEmpty()
	{
		ArrayList<Angajat> listaaa  = new ArrayList<Angajat>();
		assertTrue(listaaa.isEmpty());
	}
	
	
}
