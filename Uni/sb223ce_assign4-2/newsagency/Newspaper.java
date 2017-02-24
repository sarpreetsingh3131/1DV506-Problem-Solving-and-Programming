package sb223ce_assign4.newsagency;

import java.util.ArrayList;

public class Newspaper {

	/* Fields */
	private String name = "";
	private static int ID = 0;
	private int newspaperID = 0;
	private ArrayList<News> createdNews = new ArrayList<News>();
	private ArrayList<News> newsFromAgency = new ArrayList<News>();
	private ArrayList<NewsAgency> agencyList = new ArrayList<NewsAgency>();

	/* Constructor */
	public Newspaper(String name) {
		this.name = name;
		ID++;
		newspaperID = ID;

	}

	/* Getters and Setters */
	public ArrayList<News> getNews() {
		return createdNews;
	}

	public int getNumberOfNews() {
		return createdNews.size();

	}

	public String getName() {
		return name;
	}

	public void createNews(News a) {
		createdNews.add(a);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNewspaperID() {
		return newspaperID;
	}

	@Override
	public String toString() {
		return "Newspaper name: " + name;
	}

	/*
	 * When newspaper register with the agency, save the name of the agency in
	 * agencyList
	 */
	public void setAgency(NewsAgency a) {
		if (a.isRegister(this) == true && !agencyList.contains(a)) { // check
																		// this
																		// condition
																		// first
			agencyList.add(a); // then add the agency
		}
		/* Else throw errors */
		else if (a.isRegister(this) == false) {
			System.err.println("Please, first register the {" + this.name + "} newspaper with {" + a.getAgencyName()
					+ "} agency.");
		} else
			System.err.println("Cannot set the agency name because {" + this.name + "} is already registerd with {"
					+ a.getAgencyName() + "} agency.");
	}

	/* To see, with how many agencies the newspaper has been registered */
	public void showAgencyList() {
		System.out.println(name + " newspaper is register with " + agencyList.size() + " agency/ies.");
		for (int i = 0; i < agencyList.size(); i++) {
			System.out.println(i + 1 + ":  " + agencyList.get(i).getAgencyName());
		}
	}

	/*
	 * This method I call in agency class to send the news to newspaper after
	 * broadcasting
	 */
	public void deliverNews(News a, NewsAgency b) {
		if (b.check(a) == false) { // first check the conditions, the save the
									// news (Encapsulation)

			System.err.println("Only newsagency can deliver news to the newspaper.");
		} else if (agencyList.contains(b)) {
			newsFromAgency.add(a);
		} else
			System.err.println("Cannot add news because {" + this.name + "} is not registerd with {" + b.getAgencyName()
					+ "} agency.");

	}

	/* Show how many news the newspaper have including new news from agency */
	public void show() {
		System.out.println("Newspaper Name: " + name);
		for (int i = 0; i < createdNews.size(); i++) {
			System.out.println(createdNews.get(i) + "\n");

		}
		for (int i = 0; i < newsFromAgency.size(); i++) {
			System.out.println(newsFromAgency.get(i) + "\n");

		}

	}

}
