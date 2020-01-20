import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeposito {

	@Test
	public void testgetDepositoNivel() {
		DepositoCombustible depcomb = new DepositoCombustible (40,25);
		double depNivel = depcomb.getDepositoNivel();
				assertNotSame(depNivel,25);
		
	}

	@Test
	public void testgetDepositoMax() {
		DepositoCombustible depcomb = new DepositoCombustible (40,40);
		double depMax = depcomb.getDepositoMax();
		       assertEquals(40,depMax, 0.1);
		
	}

	@Test
	public void testestaVacio() {
		DepositoCombustible depcomb = new DepositoCombustible (0,0);
		boolean depNivel = depcomb.estaVacio();
		        assertSame(depNivel,0);
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible depcomb = new DepositoCombustible (40,40);
		boolean depNivel = depcomb.estaLleno();
				assertSame(depNivel,40);
		
	}

}
