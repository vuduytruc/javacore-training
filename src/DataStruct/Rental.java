package DataStruct;

public class Rental {
	
	int rentDays;
	Movie movie;
	
	public Rental(Movie movie, int days) {
		this.movie = movie;
		this.rentDays = days;
	}
	
	public double getCharge() {
		return movie.getCharge(rentDays);
	}
	
	public double getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(rentDays);
	}

}
