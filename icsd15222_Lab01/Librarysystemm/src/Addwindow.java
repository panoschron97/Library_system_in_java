import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Addwindow extends JFrame implements ActionListener // κλάση για καταχώρηση στοιχείων αναλόγως με την επιλογή μας βιβλίο η περιοδικό στο αντίστοιχο παράθυρο.

{
	
	private JTextField titleofbook , isbnofbook , yearofbook , descriptionofbook , typeofbook , numberofpagesfromthebook , positionofbook ;
	private JComboBox numberofauthors;
	private JTextField titleofmagazine , yearofmagazine , volumenumber , issuenumber , subjectcategory , numberofpagesfromthemagazine , positionofmagazine;
    private JTextField[] Authors;
    
	private JLabel titleofbook1 , isbnofbook1 , authorsnumber1 , yearofbook1 , descriptionofbook1 , typeofbook1 , numberofpagesfromthebook1 , positionofbook1 ;
	private JLabel titleofmagazine1 , yearofmagazine1 , volumenumber1 , issuenumber1 , subjectcategory1 , numberofpagesfromthemagazine1 , positionofmagazine1;
	private String[] Combobox = {"1" , "2" , "3"};
	private JPanel Book , Magazine;
	
	private JButton addbutton , authorsbutton;
	
	private String typee;
	
	private Authorswindow window;
	
	
	
	private ObjectOutputStream out;
	
	public Addwindow(String type) {
		
		super("Input information about Book/Magazine.");
		
		setSize(700 , 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		titleofbook = new JTextField(10);
		numberofauthors = new JComboBox(Combobox);
		authorsbutton = new JButton("Authors");
		authorsbutton.addActionListener(this);
		addbutton = new JButton("Add");
		addbutton.addActionListener(this);
		authorsnumber1 = new JLabel("Please give the number of author/s:");
		
		BoxLayout box1 = new BoxLayout(Book,BoxLayout.LINE_AXIS);
		BoxLayout box2 = new BoxLayout(Magazine,BoxLayout.LINE_AXIS);
		
		if(type.equalsIgnoreCase("Book")) {
			
			Book = new JPanel();
			typee = "Book";
			
			titleofbook1 = new JLabel("Give Title Of Book Please:");
			isbnofbook1 = new JLabel("Give ISBN Of Book Please:");
			yearofbook1 = new JLabel("Give Year Of Book Please:");
			descriptionofbook1 = new JLabel("Give Dscription Of Book Please:");
			typeofbook1 = new JLabel("Give Type Of Book Please:");
			numberofpagesfromthebook1 = new JLabel("Give Number Of Pages From The Book Please:");
			positionofbook1 = new JLabel("Give Position Of Book Please:");
			
			titleofbook = new JTextField(10);
			isbnofbook = new JTextField(10);
			yearofbook = new JTextField(10);
			descriptionofbook = new JTextField(10);
			typeofbook = new JTextField(10);
			numberofpagesfromthebook = new JTextField(10);
			positionofbook = new JTextField(10);
			
			
			
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(titleofbook1);
			Book.add(titleofbook);
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(authorsnumber1);
			Book.add(numberofauthors);
			Book.add(authorsbutton);
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(isbnofbook1);
			Book.add(isbnofbook);
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(yearofbook1);
			Book.add(yearofbook);
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(descriptionofbook1);
			Book.add(descriptionofbook);
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(typeofbook1);
			Book.add(typeofbook);
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(numberofpagesfromthebook1);
			Book.add(numberofpagesfromthebook);
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(positionofbook1);
			Book.add(positionofbook);				
			Book.add(Box.createRigidArea(new Dimension(700,10)));
			Book.add(addbutton);
			
			this.add(Book);
			
		}
		else if(type.equalsIgnoreCase("Magazine")) {
			
			Magazine = new JPanel();
			typee = "Magazine";
			
			titleofmagazine1 = new JLabel("Give Title Of Magazine Please:"); 
			yearofmagazine1 =new JLabel("Give Year Of Magazine Please:"); 
			volumenumber1 =new JLabel("Give Volume Of Magazine Please:"); 
			issuenumber1 = new JLabel("Give issue of magazine Please:"); 
			subjectcategory1 =new JLabel("Give Subject Of Magazine Please:"); 
			numberofpagesfromthemagazine1 =new JLabel("Give Number Of Pages From Magazine Please:");
			positionofmagazine1 = new JLabel("Give Position Of Magazine Please:");
			
			
			titleofmagazine = new JTextField(10);
			yearofmagazine = new JTextField(10);
			volumenumber = new JTextField(10);
			issuenumber = new JTextField(10);
			subjectcategory = new JTextField(10);
			numberofpagesfromthemagazine = new JTextField(10);
			positionofmagazine = new JTextField(10);
			
			
			
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(titleofmagazine1);
			Magazine.add(titleofmagazine);
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(yearofmagazine1);
			Magazine.add(yearofmagazine);
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(volumenumber1);
			Magazine.add(volumenumber);
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(issuenumber1);
			Magazine.add(issuenumber);
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(subjectcategory1);
			Magazine.add(subjectcategory);
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(numberofpagesfromthemagazine1);
			Magazine.add(numberofpagesfromthemagazine);
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(positionofmagazine1);
			Magazine.add(positionofmagazine);
			Magazine.add(Box.createRigidArea(new Dimension(700,10)));
			Magazine.add(addbutton);
			
			this.add(Magazine);
			
		}
		
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent choose) // actions όπου απο την στιγμή που πατάμε καταχώρηση βιβλίου ή περιοδικού δημιουργούνται τα txt.
	
	{
		// TODO Auto-generated method stub
		
		if(choose.getSource() == authorsbutton) {
			
			window = new Authorswindow(Integer.parseInt(numberofauthors.getSelectedItem().toString()));
			
		}
		if(choose.getSource() == addbutton) {
			
			if(typee.equalsIgnoreCase("Book")) {
				
				Librarybook lb = new Librarybook(titleofbook.getText(),window.getauthors(),isbnofbook.getText(),Integer.parseInt(yearofbook.getText()),descriptionofbook.getText(),typeofbook.getText(),Integer.parseInt(numberofpagesfromthebook.getText()),positionofbook.getText());
				
				
				try {
					
					out = new ObjectOutputStream(new FileOutputStream("Book.txt"));
					out.writeObject(lb);
					out.flush();
					out.close();
					JOptionPane.showMessageDialog(this, "The book has been added to your Library Systemm.","OK!",JOptionPane.PLAIN_MESSAGE );
					dispose();
					Librarywindow lw = new Librarywindow();
				
				}catch(FileNotFoundException ex) {
				Logger.getLogger(Addwindow.class.getName()).log(Level.SEVERE,null,ex);	
				}catch (IOException ex) {
					Logger.getLogger(Addwindow.class.getName()).log(Level.SEVERE,null,ex);
				}
				
				
				
			}
			
			
				
			
			
			
			else if(typee.equalsIgnoreCase("Magazine")) {
				
				Librarymagazine lm = new Librarymagazine(titleofmagazine.getText(),yearofmagazine.getText(),Integer.parseInt(volumenumber.getText()),issuenumber.getText(),subjectcategory.getText(),Integer.parseInt(numberofpagesfromthemagazine.getText()),positionofmagazine.getText());
				
				
				try {
					
					out = new ObjectOutputStream(new FileOutputStream("Magazine.txt"));
					out.writeObject(lm);
					out.flush();
					out.close();
					JOptionPane.showMessageDialog(this, "The magazine has been added to your Library Systemm.","OK!",JOptionPane.PLAIN_MESSAGE );
					dispose();
					Librarywindow lw = new Librarywindow();
					
				}catch(FileNotFoundException ex) {
					Logger.getLogger(Addwindow.class.getName()).log(Level.SEVERE,null,ex);	
					}catch (IOException ex) {
						Logger.getLogger(Addwindow.class.getName()).log(Level.SEVERE,null,ex);
					}
				
				
			}
			
			
		}
		
		
		
	}

	
}
