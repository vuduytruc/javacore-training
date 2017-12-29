package DataStruct;

public class Movie {
	
	public String title;
	public IPrice price;
	
	public Movie(String title, IPrice price) {
		this.title = title;
		this.price = price;
	}
	
	public double getCharge(int rentDays) {
		return price.getCharge(rentDays);
	}
	
	public double getFrequentRenterPoints(int rentDays) {
		return price.getFrequentRenterPoints(rentDays);
	}	

}
