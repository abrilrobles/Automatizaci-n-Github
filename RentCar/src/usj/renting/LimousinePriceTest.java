package usj.renting;

import static org.junit.Assert.*;

import org.junit.Test;

public class LimousinePriceTest {
	
	//Clase a testear
	LimousinePrice tester = new LimousinePrice();
	
	// Valores a testear
	int negativo = -1;
	int neutro = 0;
	int dias = 1;
	int mayorDias = 2;
	
	@Test
	public void testGetCharge() {
		
		//Valores inválidos
		assertEquals("Test Limusine: valor negativo", 0.0, tester.getCharge(negativo),0 );
		assertEquals("Test Limusine: valor 0", 0.0, tester.getCharge(neutro), 0 );
		// Varios valores de días para los que cambia el alquiler del coche	
		assertEquals("Test Limusine: valor mayor líimite días", 3.0, tester.getCharge(dias),0 );
		assertEquals("Test Limusine: valor mayor líimite días", 6.0, tester.getCharge(mayorDias),0 );
	}

	@Test
	public void testGetLoyaltyPoints() {
		// Valores inválidos
		assertEquals("Test Limusine: valor negativo", 0, tester.getLoyaltyPoints(negativo),0 );
		assertEquals("Test Limusine: valor 0", 0, tester.getLoyaltyPoints(neutro), 0 );
		// Varios valores de días para los que cambia el alquiler del coche	
		assertEquals("Test Limusine: valor mayor líimite días", 1, tester.getLoyaltyPoints(dias),0 );
		assertEquals("Test Limusine: valor mayor líimite días", 2, tester.getLoyaltyPoints(mayorDias),0 );
	}

}
