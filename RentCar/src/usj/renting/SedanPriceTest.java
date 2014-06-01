package usj.renting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SedanPriceTest {
	//Clase a testear
	SedanPrice tester = new SedanPrice();
	
	// Valores a testear
	int negativo = -1;
	int neutro = 0;
	int menorDias = 2;
	int dias = 3;
	int mayorDias = 4;
	
	
	@Test
	public void testGetCharge(){
		
		// Varios valores de días para los que cambia el alquiler del coche	
		assertEquals("Test Sedan: valor negativo", 0.0, tester.getCharge(negativo),0 );
		assertEquals("Test Sedan: valor 0", 0.0, tester.getCharge(neutro), 0 );
		// Varios valores de días para los que cambia el alquiler del coche	
		assertEquals("Test Sedan: valor menor líimite días", 1.5, tester.getCharge(menorDias),0 );
		assertEquals("Test Sedan: valor líimite días", 1.5, tester.getCharge(dias),0 );
		assertEquals("Test Sedan: valor mayor líimite días", 3.0, tester.getCharge(mayorDias),0 );
		
	}
	
	@Test
	public void testGetLoyaltyPoints(){
	
		// Varios valores de días para los que cambia el alquiler del coche	
		assertEquals("Test Sedan: valor negativo", 0, tester.getLoyaltyPoints(negativo),0 );
		assertEquals("Test Sedan: valor 0", 0, tester.getLoyaltyPoints(neutro),0 );
		// Varios valores de días para los que cambia el alquiler del coche	
		assertEquals("Test Sedan: valor menor líimite días", 1, tester.getLoyaltyPoints(menorDias),0 );
		assertEquals("Test Sedan: valor líimite días", 1, tester.getLoyaltyPoints(dias),0 );
		assertEquals("Test Sedan: valor mayor líimite días", 1, tester.getLoyaltyPoints(mayorDias),0 );
		
	}

}
