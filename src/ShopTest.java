import java.util.Date;

public class ShopTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		Shop shop = new Shop();
		
		Author stephan = new Author("Stephen","King","Portland");
		BookStoreItem firstBook = new Book(stephan, "The Shining");		
		System.out.println(firstBook);
		shop.addShopitem(firstBook);
		
		Author dan = new Author("Dan","Brown","Exeter");
		BookStoreItem secondBook = new Book(dan, "Angels and Demons");		
		System.out.println(secondBook);
		shop.addShopitem(secondBook);
		
		Author nicholas = new Author("Nicholas","Thompson","New York City");
		Publisher condeNast = new Publisher("Conde Nast","1645 E 6th St #250, Austin, TX 78702");
		BookStoreItem firstMagazine = new Magazine(nicholas,condeNast,"Wired");
		System.out.println(firstMagazine);
		shop.addShopitem(firstMagazine);
		
		Author ken = new Author("Ken","Mingis","Framingham");
		Publisher idg = new Publisher("IDG Communications","PO Box 9208 Framingham, MA 01701");
		BookStoreItem secondMagazine = new Magazine(ken,idg,"Computer World");
		System.out.println(secondMagazine);
		shop.addShopitem(secondMagazine);
		
		Author bruce = new Author("Bruce","Schneier","New York City");
		BookStoreItem firstEbook = new ElectronicBook(bruce, "Applied Cryptography", date );
		System.out.println(firstEbook);
		shop.addShopitem(firstEbook);
		
		Author peter = new Author("Peter","Hamilton","Rutland");
		BookStoreItem secondEbook = new ElectronicBook(peter, "Pandora's Star", date );
		System.out.println(secondEbook);
		shop.addShopitem(secondEbook);
		System.out.println("\n");
		
		System.out.println("The price for all items is $" + shop.shopItemsTotalPrice());
		
		
		
		
						

	} 

}
