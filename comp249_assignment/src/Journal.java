
public class Journal extends PaperPublication{
	int issue_number;
	String specialty_field;
	
	//Default constructor
	public Journal(){
		issue_number = 0;
		specialty_field = "None";
	}

	//Overloaded constructor takes issue_number as parameter
	public Journal(int issue_number){
		this.issue_number = issue_number;
	}

	//Overloaded constructor takes issue_number and specialty_field as parameters
	public Journal(int issue_number, String specialty_field){
		this.issue_number = issue_number;
		this.specialty_field = specialty_field;
	}
	
	//toString method returns values of attributes
	public String toString(){
		return "This is issue No. " + issue_number + " of the Journal of " + specialty_field + ". " +
				"It has a price of $" + price + " and " +
				"the total number of pages is " + number_of_pages +".";
	}
	
	//equals method returns true iff all attributes between compared objects are the same
	public boolean equals(Journal publication){
		if(this.price == publication.price && 
				this.number_of_pages == publication.number_of_pages &&
				this.issue_number == publication.issue_number &&
				this.specialty_field == publication.specialty_field){
			return true;
		}
		return false;
	}
	//accessors and mutators return or set new values for attributes
	public int getIssue(){
		return this.issue_number;
	}
	
	public void setIssue(int issue_number){
		this.issue_number = issue_number;
	}
	
	public String getSpecialty(){
		return this.specialty_field;
	}
	
	public void setSpecialty(String specialty_field){
		this.specialty_field = specialty_field;
	}
}