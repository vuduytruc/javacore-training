package App;

import java.util.*;

import DataStruct.*;

public class Main {
	public Map<String, Customer> customers = new HashMap<String, Customer>();
	public Map<String, Movie> movies = new HashMap<String, Movie>();
	
	public static void main(String [] args) {
		Main app = new Main();
		Map<String, Customer> customers = app.customers;
		Map<String, Movie> movies = app.movies;
		
		customers.get("truc").rent(movies.get("caribe1"), 2);
		customers.get("truc").rent(movies.get("caribe2"), 3);
		customers.get("truc").rent(movies.get("caribe3"), 4);
		customers.get("truc").rent(movies.get("caribe4"), 5);
		customers.get("truc").rent(movies.get("minion1"), 6);
		customers.get("truc").rent(movies.get("minion2"), 7);
		
		customers.get("truc").printBuild();
	}
	
	public Main() {
		createCustomers();
		createMovies();
	}
	private void createCustomers() {
		customers.put("truc", new Customer("Truc"));
		customers.put("hao", new Customer("Hao"));
		customers.put("thinh", new Customer("Thinh"));
	}
	private void createMovies() {
		IPrice regularPrice = new RegularPrice();
		IPrice childrenPrice = new ChildrenPrice();
		IPrice newReleasePrice = new NewReleasePrice();
		
		movies.put("caribe1", new Movie("Cuop bien caribe 1", regularPrice));
		movies.put("caribe2", new Movie("Cuop bien caribe 2", regularPrice));
		movies.put("caribe3", new Movie("Cuop bien caribe 3", regularPrice));
		movies.put("caribe4", new Movie("Cuop bien caribe 4", newReleasePrice));
		movies.put("minion1", new Movie("Minion 1", childrenPrice));
		movies.put("minion2", new Movie("Minion 2", newReleasePrice));
	}
}
