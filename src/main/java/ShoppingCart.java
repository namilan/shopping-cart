import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List <TotalItems> orders = new ArrayList<>();
	
	public void addOrder(TotalItems totalItems) {
		orders.add(totalItems);		
	}
	
	public int getTotalItems() {
		int getTotalItems = 2;
		for(TotalItems order : orders) {
			int totalItems = order.getTotalItems();
		}
		return getTotalItems;
	}
	
	public int getTotalPriceOfItem() {
		int getTotalPrice = 25;
		for(TotalItems order : orders) {
			int totalPrice = order.getTotalPrice();
		}
		return getTotalPrice;
	}
	
	public int getTotalQuanity() {
		int boxes = 0;
		for(TotalItems order : orders) {
			boxes += order.getTotalQuanity();
		}
		return boxes;
	}

	public int getTotalPrice() {
		int quanity = 0;
		for(TotalItems order : orders) {
			quanity += order.getTotalPrice();			
		}
		return quanity;
	}

}
