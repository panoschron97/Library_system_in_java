
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Searchwindowformagazine extends JFrame //κλάση στην οποία αφού καταχωρήσαμε τα στοιχεία περιοδικού σε txt με βάση το όνομα του περιοδικού ή του χρόνου έκδοσης που θέλουμε να τα βρούμε.

{
	
	private ObjectInputStream searchhh;
	private ArrayList <Library> listt;
	private boolean typee=false;
	
	public Searchwindowformagazine(String Searchwindowformagazine) // ψάχνουμε μέσα στο txt.
	
	{
		
		listt = new ArrayList();
		
		
		try {
			
			FileInputStream fiss = new FileInputStream("Magazine.txt");
			
			searchhh = new ObjectInputStream(fiss);
			
			Library lm = new Library(){};
			
			while(fiss.available()>0) {
				
				try {
					lm =(Librarymagazine) searchhh.readObject();
					searchhh.close();
					if(lm!=null) {
						listt.add(lm);
					}
				}catch(ClassNotFoundException ex) {
					
				}
				
			}
			
		}catch(FileNotFoundException ex) {
			
		}
			catch(IOException ex) {
			
		}

			
		
		for(int i=0; i<listt.size(); i++) //for όπου με βάση το όνομα του περιοδικού ή με Βάση το χρόνο έκδοσης του περιοδικού πηγαίνουμε στην κλάση showresultswindowformagazine και εμφανίζονται αυτά που καταχωρήσαμε μέσα στο Magazine.txt.
		
		{
			
			if(listt.get(i).titleofmagazine.equalsIgnoreCase(Searchwindowformagazine) || listt.get(i).yearofmagazine.equalsIgnoreCase(Searchwindowformagazine)) {
				Showresultswindowformagazine swm = new Showresultswindowformagazine("Title",listt.get(i));
				typee=true;}
				
			}
		
		
		//αλλιώς αν type==false τότε βλέπουμε το μήνυμα Not Found.
	
	if(typee==false) {
		JOptionPane.showMessageDialog(this, " The Title of the magazine OR the Year of the magazine you enter is not exist. ","Message",JOptionPane.WARNING_MESSAGE);
		Librarywindow lχ = new Librarywindow();
	}
}
}
