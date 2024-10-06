
public class Librarymagazine extends Library {
	
	public Librarymagazine(String titleofmagazine,String yearofmagazine,int volumenumber,String issuenumber,String subjectcategory,int numberofpagesfromthemagazine,String positionofmagazine) {
		
		//κλάση που κληρονομούμε τα στοιχεία του κάθε περιοδικού της βιβλιοθήκης από την κλάση library.
		
		this.titleofmagazine=titleofmagazine;
		this.yearofmagazine=yearofmagazine;
		this.volumenumber=volumenumber;
		this.issuenumber=issuenumber;
		this.subjectcategory=subjectcategory;
		this.numberofpagesfromthemagazine=numberofpagesfromthemagazine;
		this.positionofmagazine=positionofmagazine;
		
	}

}
