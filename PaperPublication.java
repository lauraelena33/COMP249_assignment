
public class PaperPublication {

	double price;
	int number_of_pages;
	
	//Default constructor with not parameters initialises attributes to 0
	public PaperPublication(){
		this.price = 0;
		this.number_of_pages = 0;
	}
	
	//Overloaded constructor takes price
	public PaperPublication(double price){
		this.price = price;
	}
	
	//Overloaded constructor takes price and number_of_pages
	public PaperPublication(double price, int number_of_pages){
		this.price = price;
		this.number_of_pages = number_of_pages;
	}

}
