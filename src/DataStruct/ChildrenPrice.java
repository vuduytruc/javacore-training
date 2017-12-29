package DataStruct;

public class ChildrenPrice implements IPrice {

	@Override
	public double getCharge(int rentDays) {
		return 2500 + (rentDays - 3) * 1500;
	}

	@Override
	public String toString() {
		return "children";
	}
	
}
