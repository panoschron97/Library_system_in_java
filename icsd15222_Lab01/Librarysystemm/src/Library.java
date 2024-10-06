import java.io.Serializable;
import java.util.ArrayList;

public abstract class Library implements Serializable // abstract κλάση που ορίσαμε όλα τα στοιχεία της βιβλιοθήκης με το τι περιέχει ένα βιβλίο και ένα περιοδικό.  

{

	
	String titleofbook;
	String isbnofbook;
	ArrayList <String > Authors;
	int yearofbook;
	String descriptionofbook;
	String typeofbook;
	int numberofpagesfromthebook;
	String positionofbook;
	String titleofmagazine;
	String yearofmagazine;
	int volumenumber;
	String issuenumber;
	String subjectcategory;
	int numberofpagesfromthemagazine;
	String positionofmagazine;
	
	
	
}
