import java.math.BigDecimal;
import java.util.ArrayList;

public class Shop {
	
	private ArrayList<BookStoreItem> shopItems = new ArrayList<>();
	
	Shop(){
		
	}
	
	public void addShopitem(BookStoreItem item) {
		
		this.shopItems.add(item);
	}
	
	public void removeShopItem(int shopItemIndex) {
		this.shopItems.remove(shopItemIndex);
	}
	
	public BigDecimal shopItemsTotalPrice() {
		BigDecimal price = new BigDecimal("0.00");
		
		for (BookStoreItem items: shopItems) {
			price = price.add(items.calculatePrice());			
		}
		
		return price;
	}
}
