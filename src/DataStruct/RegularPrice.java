package DataStruct;

public class RegularPrice implements IPrice {

	@Override
	public double getCharge(int rentDays) {
		return 3000 + (rentDays - 2) * 1000;
	}

	@Override
	public String toString() {
		return "regular";
	}
	
}
