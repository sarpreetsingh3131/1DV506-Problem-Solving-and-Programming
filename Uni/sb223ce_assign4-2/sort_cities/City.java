package sb223ce_assign4.sort_cities;

public class City implements Comparable<City>{

	/*Fields*/
	private String cityName;
	private int zipCode;

	/*Constructor*/
	public City() {
		cityName = "";
		zipCode = 0;
	}

	/*Constructor with parameters*/
	public City(String name, int code) {
		cityName = name;
		zipCode = code;
	}

	/*Getters and Setters and toString method*/
	public int getZipCode() {
		return zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
		;
	}

	public void setCityName(String name) {
		cityName = name;
	}

	public String toString() {
		return "" + zipCode + " " +  cityName;
	}


	/*Comparable*/
	@Override
	public int compareTo(City a) {
		return zipCode - a.getZipCode();
		
	}

}
