package sb223ce_assign4.newsagency;

public class NewsagencyMain {

	public static void main(String[] args) {
	
	/*Create newspaper*/
	Newspaper newspaper1 = new Newspaper("Times of India");
	Newspaper newspaper2 = new Newspaper("Times of Pakistan");
	Newspaper newspaper3 = new Newspaper("Times of Sweden");
	Newspaper newspaper4 = new Newspaper("Times of USA");
	Newspaper newspaper5 = new Newspaper("Times of Canada");
	Newspaper newspaper6 = new Newspaper("Times of England");
	
	/*Create news*/
	News news1 = new News("Independance", "India is free from British rule.");
	
	News news2 = new News("Partition", "India has been divided in three parts after independence. Millions of "
			             + " people are migrating from Pakistan to India and vice versa.");
	
	News news3 = new News("Technology", "Sweden's new invention Skype has changed the way of communication.");
	
	News news4 = new News("Crime", "USA crime rate is growing rapidly.");
	
	News news5 = new News("Weather", "Canada weather is getting worst day by day since last week.");
	
	News news6 = new News("No more colony", "After the World war 2, British lost control over India.");
	
	/*Add news in the newspaper*/
	newspaper1.createNews(news1);
	newspaper2.createNews(news2);
	newspaper3.createNews(news3);
	newspaper4.createNews(news4);
	newspaper5.createNews(news5);
	newspaper6.createNews(news6);
	
	/*Create news agency*/
	NewsAgency agency1 = new NewsAgency("Agency 1");
	NewsAgency agency2 = new NewsAgency("Agency 2");

	
	/*Register the newspaper*/
	agency1.registerNewspaper(newspaper1);
	agency2.registerNewspaper(newspaper1);
	agency2.registerNewspaper(newspaper2);
	agency1.registerNewspaper(newspaper2);
	agency1.registerNewspaper(newspaper3);
	agency1.registerNewspaper(newspaper4);
	agency1.registerNewspaper(newspaper5);
	agency1.registerNewspaper(newspaper6);	
	
	
	/*Show with how many agencies, newspaper1 is registered*/
	newspaper3.showAgencyList();
	

	
	//newspaper1.deliverNews(news1, agency1);  // This method will throw error because only news agency can deliver news to newspaper
	
	/*Collect news and broadcast them*/
	agency1.collectNews(newspaper1);
	agency1.collectNews(newspaper2);
	agency2.collectNews(newspaper2);
	agency1.broadCast();
	//agency2.broadCast();

	System.out.println();
	
	/*Finally show the news*/
	newspaper1.show();
	newspaper2.show();
	newspaper3.show();
	newspaper4.show();
	newspaper5.show();
	newspaper6.show();
	}
}