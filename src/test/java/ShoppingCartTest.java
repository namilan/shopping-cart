import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingCartTest {
	
	@Test
	public void shouldReturnTotalPairs2() {
		ShoppingCart underTest = new ShoppingCart(); 
		underTest.addOrder(new TotalItems("Shoes", 2));
		int check = underTest.getTotalItems();
		assertEquals(2, check);
	}
	
	@Test
	public void shouldReturn25Price() {
		ShoppingCart underTest = new ShoppingCart();
		underTest.addOrder(new TotalItems("Shoes", 25));
		int check = underTest.getTotalPrice();
		assertEquals(25, check);
	}

}
