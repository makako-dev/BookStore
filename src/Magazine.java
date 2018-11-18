import java.math.BigDecimal;

public class Magazine extends Book  {
	
	private final Publisher publisher;
	

	Magazine(Author author, Publisher publisher, String title) {
		super(author, title);
		this.publisher = publisher;
	}

		
	public Publisher getPublisher() {
		return publisher; 
	}


	@Override
	public BigDecimal calculatePrice(){
		BigDecimal twelve = new BigDecimal("12.0");			
		String first = this.author.getFirstName();
		String last = this.author.getLastName();
		BigDecimal firstNameLength = new BigDecimal(first.length());
		BigDecimal lastNameLength = new BigDecimal(last.length());
		BigDecimal totalPrice = firstNameLength.add(lastNameLength);
		totalPrice = totalPrice.multiply(twelve);	
		return totalPrice;
	}
	
	@Override
	public String toString() {
		
		return String.format("The magazine's title is \"%s,\" the author is %s %s, the publisher is %s and the price is $%.2f%n",
				getTitle(), this.author.getFirstName(), this.author.getLastName(), publisher.getName(), calculatePrice());
		
	}
}
