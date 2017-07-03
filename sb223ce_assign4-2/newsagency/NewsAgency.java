package sb223ce_assign4.newsagency;

import java.util.ArrayList;

public class NewsAgency {

	/* Fields */
	private String name = "";
	private ArrayList<Newspaper> registerdNewspaper = new ArrayList<Newspaper>();
	private ArrayList<News> news = new ArrayList<News>();
	private ArrayList<Integer> newspaperId = new ArrayList<Integer>();
	private static int ID = 0;
	private int agencyID = 0;
	private News broadCastNews;

	/* Constructor */
	public NewsAgency(String name) {
		this.name = name;
		ID++;
		agencyID = ID;
	}

	/* Getters and Setters */
	public String getAgencyName() {
		return name;
	}

	public ArrayList<Newspaper> getNewspaperList() {
		return registerdNewspaper;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgencyID() {
		return agencyID;
	}

	/* Methods for preventing unwanted errors */
	public boolean isRegister(Newspaper a) {

		return registerdNewspaper.contains(a);
	}

	public boolean check(News a) {
		return news.contains(a);
	}

	/* first check the condition, then register the newspaper */
	public void registerNewspaper(Newspaper a) {
		if (isRegister(a) == false) {
			registerdNewspaper.add(a);
			a.setAgency(this); // for newspaper to know in which agency it is
								// registered
		} else
			System.err.println(a.getName() + " is already registerd with " + name
					+ " agency. You are trying to register it twice in" + " same agency.");

	}

	/* first check conditions and then get news from newspaper */
	public void collectNews(Newspaper a) {
		if (isRegister(a) == true) {
			for (int i = 0; i < a.getNumberOfNews(); i++) { // get all news
															// inside the
															// newspaper

				/*
				 * Optional, I thought if same news is registered more than one
				 * time, then this method will prevent it
				 */

				News n = a.getNews().get(i);
				if (!news.contains(n)) {
					// System.err.println("This news has already been registered
					// by other newspaper.");
					news.add(a.getNews().get(i)); // save the news
					newspaperId.add(a.getNewspaperID()); // also save the id of
															// newspaper, for
															// broadcasting
															// later on
				}
			}
		} else
			System.err.println("Cannot collect news from " + a.getName() + " newspaper because it "
					+ "is not register with " + name + " agency.");
	}

	public void broadCast() {
		if (news.size() != 0) { // first check if agency got any news
			for (int i = 0; i < news.size(); i++) { // run the loop
				int a = newspaperId.get(i); // get id of the newspaper
				for (int j = 0; j < registerdNewspaper.size(); j++) { // run
																		// inside
																		// loop
																		// to
																		// compare
																		// the
																		// id
					if (a != registerdNewspaper.get(j).getNewspaperID()) { // if
																			// id
																			// does
																			// not
																			// match
						broadCastNews = news.get(i); // get the news
						registerdNewspaper.get(j).deliverNews(broadCastNews, this); // send
																				// to
																				// the
																				// newspaper(call
																				// method)
					} else
						continue;
				}
			}

		}
	}

}
