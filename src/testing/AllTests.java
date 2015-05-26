package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAngajat.class, TestDepartament.class, TesteRandom.class })
public class AllTests {

}
