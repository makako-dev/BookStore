import java.math.BigDecimal;
import java.util.ArrayList;

public class Shop {
	
	//collection of all BookStoreItem objects
	private ArrayList<BookStoreItem> shopItems = new ArrayList<>();  
	
	
	Shop(){
		
	}
	
	//adds BookStoreItem object 
	public void addShopitem(BookStoreItem item) {
		
		this.shopItems.add(item);
	}
	
	//removes BookStoreItem object 
	public void removeShopItem(int shopItemIndex) {
		this.shopItems.remove(shopItemIndex);
	}
	
	
	//sum of all BookStoreItem objects
	public BigDecimal shopItemsTotalPrice() {
		BigDecimal price = new BigDecimal("0.00");
		
		for (BookStoreItem items: shopItems) {
			price = price.add(items.calculatePrice());			
		}
		
		return price;
	}
	
	//Displays information for each BookStoreItem object using
	//overriden toString method
	public void displayInfoforEachItem() {
		
		for (BookStoreItem item: shopItems) {
			System.out.printf("%s\n", item);
		}
	}
}
