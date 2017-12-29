package DataStruct;

import java.util.*;

public class Customer {
	
	public String name;
	public List<Rental> rentals = new ArrayList<Rental>();
	private int rentalCount = 0;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void rent(Movie movie, int days) {
		if (rentalCount < 5) {
			Rental rental = new Rental(movie, days);
			rentals.add(rental);
			++rentalCount;
			System.out.println("\"" + name + "\" da thue phim \"" + movie.title + "\" trong " + days + " ngay.");
		} else {
			System.out.println("\"" + name + "\" khong the thue phim, do qua so phim toi da cho phep!!");
		}
	}
	
	public void printBuild() {
		System.out.println("\nHOA DON");
		System.out.println("Ten khach hang: " + name);
		System.out.println("So phim da thue: " + rentalCount);
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print(String.format("%-5s", "STT"));
		System.out.print(String.format("%-30s", "Ten phim"));
		System.out.print(String.format("%-7s", "Days"));
		System.out.print(String.format("%-15s", "Type"));
		System.out.print(String.format("%-15s", "Charge"));
		System.out.println(String.format("%-5s", "Point"));

		int no = 1;
		for	(Rental rental : rentals) {
			System.out.print(String.format("%-5s", no++));
			System.out.print(String.format("%-30s", rental.movie.title));
			System.out.print(String.format("%-7s", rental.rentDays));
			System.out.print(String.format("%-15s", rental.movie.price.toString()));
			System.out.print(String.format("%-15s", rental.getCharge()));
			System.out.println(String.format("%-5s", rental.getFrequentRenterPoints()));
		}
	}
	
}
