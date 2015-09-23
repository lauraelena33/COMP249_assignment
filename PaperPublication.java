
public class PaperPublication {

	double price;
	int number_of_pages;
	
	public PaperPublication(){
		this.price = 0;
		this.number_of_pages = 0;
	}
	
	public PaperPublication(double price){
		this.price = price;
	}
	
	public PaperPublication(double price, int number_of_pages){
		this.price = price;
		this.number_of_pages = number_of_pages;
	}

}
