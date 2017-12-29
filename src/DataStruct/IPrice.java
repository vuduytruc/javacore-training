package DataStruct;

public interface IPrice {
	
	public double getCharge(int rentDays);

	default public double getFrequentRenterPoints(int rentDays) {
		return 1;
	}
	
	public String toString();

}
