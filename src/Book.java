import java.math.BigDecimal;

public class Book implements BookStoreItem {
		
	protected final Author author;
	protected final String bookTitle;
	
	
	Book(Author author, String title){
		this.author = author;
		this.bookTitle = title;
	}
	

	public Author getAuthor() {
		
		return author;
	}

	public String getTitle() {
		
		return bookTitle;
	}

	@Override
	public BigDecimal calculatePrice(){
		String first = this.author.getFirstName();
		String last = this.author.getLastName();
		BigDecimal firstNameLength = new BigDecimal(first.length());
		BigDecimal lastNameLength = new BigDecimal(last.length());
		BigDecimal totalPrice = firstNameLength.add(lastNameLength);	
		return totalPrice;
	}

	@Override
	public void transmited() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		
		return String.format("The book's title is \"%s,\" the author is %s %s and the price is $%.2f%n",
				getTitle(), this.author.getFirstName(), this.author.getLastName(), calculatePrice());
		
	}

}
