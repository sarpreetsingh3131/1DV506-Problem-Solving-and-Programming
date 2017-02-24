package sb223ce_assign4.sort_cities;



public class SortCities {
	public static void main(String[] args) {

		City a = new City();
		a.readFile("/Users/SarpreetSingh/Documents/city.txt");
        a.sort();
		a.print();
		


	}

}
