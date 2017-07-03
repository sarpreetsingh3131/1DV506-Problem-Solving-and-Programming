package sb223ce_assign4.newsagency;

public class News {

	/*Fields*/
	
	private String title = "";
	private String news = "";
	private static int ID = 0;
	private int newsID = 0;

	/*Constructor*/
	public News(String title, String news) {
		this.title = title;
		this.news = news;
		ID++;
		newsID = ID;
		
	}

	/*Getters and Setters and toString method*/
	public String toString() {
		return "News TITLE: " + title + "\nNEWS: " + news;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public int getNewsID() {
		return newsID;
	}	
}