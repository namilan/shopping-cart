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
		int check = underTest.getTotalPriceOfItem();
		assertEquals(25, check);
	}
	
	@Test
	public void shouldReturnQuanity() {
		ShoppingCart underTest = new ShoppingCart();
		underTest.addOrder(new TotalItems("Shoes", 1));
		int check = underTest.getTotalQuanity();
		assertEquals(1, check);
	}
	
	@Test
	public void shouldReturnTotalPrice() {
		ShoppingCart underTest = new ShoppingCart();
		underTest.addOrder(new TotalItems("Shoes", 50));
		int check = underTest.getTotalPrice();
		assertEquals(50, check);
	}

}
