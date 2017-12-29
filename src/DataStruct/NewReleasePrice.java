package DataStruct;

public class NewReleasePrice implements IPrice {

	@Override
	public double getCharge(int rentDays) {
		return rentDays * 4000;
	}

	@Override
	public double getFrequentRenterPoints(int rentDays) {
		return rentDays > 1 ? 2 : 1;
	}

	@Override
	public String toString() {
		return "new release";
	}
	
}
