import java.math.BigDecimal;
import java.util.Date;

public class ElectronicBook extends Book {
	
	private Date dataSent;

	ElectronicBook(Author author, String title, Date date) {
		super(author, title);
		this.setDataSent(date);
	}
	
	public Date getDataSent() {
		return dataSent;
	}

	public void setDataSent(Date dataSent) {
		this.dataSent = dataSent;
	}


	@Override
	public BigDecimal calculatePrice(){
		BigDecimal totalPrice = new BigDecimal("1.0");
		return totalPrice;		
	}
	
	@Override
	public String toString() {
		
		return String.format("The E-Book's title is \"%s,\" the author is %s %s, the date sent is %s and the price is $%.2f%n",
				getTitle(), this.author.getFirstName(), this.author.getLastName(), getDataSent().toString(), calculatePrice());
		
	}


}
