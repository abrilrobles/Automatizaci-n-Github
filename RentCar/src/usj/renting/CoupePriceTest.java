package usj.renting;

import static org.junit.Assert.*;

import org.junit.Test;



public class CoupePriceTest {
	//Clase a testear
	CoupePrice tester = new CoupePrice();
	
	// Valores a testear
	int negativo = -1;
	int neutro = 0;
	int menorDias = 1;
	int dias = 2;
	int mayorDias = 3;
	
	
	@Test
	public void testGetCharge(){
		
		// Varios valores de d�as para los que cambia el alquiler del coche	
		assertEquals("Test Coupe: valor negativo", 0.0, tester.getCharge(negativo),0 );
		assertEquals("Test Coupe: valor 0", 0.0, tester.getCharge(neutro), 0 );
		// Varios valores de d�as para los que cambia el alquiler del coche	
		assertEquals("Test Coupe: valor menor l�imite d�as", 2.0, tester.getCharge(menorDias),0 );
		assertEquals("Test Coupe: valor l�imite d�as", 2.0, tester.getCharge(dias),0 );
		assertEquals("Test Coupe: valor mayor l�imite d�as", 3.5, tester.getCharge(mayorDias),0 );
		
	}
	
	@Test
	public void testGetLoyaltyPoints(){
	
		// Varios valores de d�as para los que cambia el alquiler del coche	
		assertEquals("Test Coupe: valor negativo", 0, tester.getLoyaltyPoints(negativo),0 );
		assertEquals("Test Coupe: valor 0", 0, tester.getLoyaltyPoints(neutro),0 );
		// Varios valores de d�as para los que cambia el alquiler del coche	
		assertEquals("Test Coupe: valor menor l�imite d�as", 1, tester.getLoyaltyPoints(menorDias),0 );
		assertEquals("Test Coupe: valor l�imite d�as", 1, tester.getLoyaltyPoints(dias),0 );
		assertEquals("Test Coupe: valor mayor l�imite d�as", 1, tester.getLoyaltyPoints(mayorDias),0 );
		
	}
	
}
