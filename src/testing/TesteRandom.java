package testing;

import static org.junit.Assert.*;

import gui.MainFrame;

import java.util.ArrayList;

import model.Angajat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controllers.ListaAngajati;
import controllers.MainController;

public class TesteRandom {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSingletonNotNull() {
		MainController m1 = MainController.getInstance();
		assertNotNull(m1);
	}
	
	@Test
	public void testSameSingleton() {
		MainController mc1 = MainController.getInstance();
		MainController mc2 = MainController.getInstance();
		assertSame(mc1, mc2);
	}
	
	@Test
	public void testTransmitereParam()
	{
		ArrayList<Angajat> angajati = new ArrayList<Angajat>();
		Angajat a1 = new Angajat("Cosmin", "1901022396214");
		Angajat a2 = new Angajat("Alex", "1890505123654");
		
		angajati.add(a1);
		angajati.add(a1);
		
		ListaAngajati lst = new ListaAngajati(angajati);
		assertEquals(angajati, lst.getAngajati());
	}

}
