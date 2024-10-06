import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Searchwindowforbook extends JFrame //����� ���� ����� ���� ������������ �� �������� ������� �� txt �� ���� �� ����� ��� ������� � ��� isbn ������� �� �� ������.

{
	
	private ObjectInputStream searchh;
	private ArrayList <Library> list;
	private boolean type=false;
	
	public Searchwindowforbook(String Searchwindow) // �������� ���� ��� txt.
	
	{
		
		list = new ArrayList();
		
		
		try {
			
			FileInputStream fis = new FileInputStream("Book.txt");
			
			searchh = new ObjectInputStream(fis);
			
			Library lb = new Library(){};
			
			while(fis.available()>0) {
				
				try {
					lb =(Librarybook) searchh.readObject();
					searchh.close();
					if(lb!=null) {
						list.add(lb);
					}
				}catch(ClassNotFoundException ex) {
					
				}
				
			}
			
		}catch(FileNotFoundException ex) {
			
		}
			catch(IOException ex) {
			
		}

			
		
		for(int i=0; i<list.size(); i++) //for ���� �� ���� �� ����� ��� ������� � �� ���� �� isbn ��� ������� ���������� ���� ����� showresultswindowforbook ��� ������������ ���� ��� ������������ ���� ��� Book.txt. 
		
		{
			
			if(list.get(i).titleofbook.equalsIgnoreCase(Searchwindow) || list.get(i).isbnofbook.equalsIgnoreCase(Searchwindow)) {
				Showresultswindowforbook sw = new Showresultswindowforbook("Title",list.get(i));
				type=true;}
				
			}
		//������ �� type==false ���� �������� �� ������ Not Found.
		
	
	
	if(type==false) {
		JOptionPane.showMessageDialog(this, " The Title of the book OR the ISBN of the book you enter is not exist. ","Message",JOptionPane.WARNING_MESSAGE);
		Librarywindow lz = new Librarywindow();
	}
}
}


	


