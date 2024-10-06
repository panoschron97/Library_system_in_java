import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Librarywindow extends JFrame implements ActionListener // η librarywindow κλάση στην οποία διαλέγουμε βιβλίο ή περιοδικό για καταχώρηση στοιχείων.

{
	
	
	private JButton Create , Searchforbook , Searchformagazine ;
	private JPanel Buttons;
	private JComboBox Choice;
	private String[]  Choices = {"Empty" , "Book" , "Magazine"};
	private JTextField Searchwindowforbook , Searchwindowformagazine;
	
	
	public Librarywindow() {
		
		super("Library Systemm");
		
		setSize(400,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		BoxLayout box = new BoxLayout(Buttons,BoxLayout.LINE_AXIS);
		
		Create = new JButton("Add");
		Create.addActionListener(this);
		Searchforbook = new JButton("Search Title OR ISBN For Book");
		Searchformagazine = new JButton("Search Title OR Year For Magazine");
		Searchforbook.addActionListener(this);
		Searchformagazine.addActionListener(this);

		
		Choice = new JComboBox(Choices);
		
		Searchwindowforbook = new JTextField(10);
		Searchwindowformagazine = new JTextField(10);
		
		
		Buttons = new JPanel();
		Buttons.add(Box.createRigidArea(new Dimension(400,50)));
		Buttons.add(Choice);
		Buttons.add(Box.createRigidArea(new Dimension(400,50)));
		Buttons.add(Create);
		Buttons.add(Box.createRigidArea(new Dimension(400,50)));
		Buttons.add(Searchwindowforbook);
		Buttons.add(Box.createRigidArea(new Dimension(400,50)));
		Buttons.add(Searchforbook);
		Buttons.add(Box.createRigidArea(new Dimension(400,50)));
		Buttons.add(Searchwindowformagazine);
		Buttons.add(Box.createRigidArea(new Dimension(400,50)));
		Buttons.add(Searchformagazine);
		
		this.add(Buttons);
		this.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent choose) // τα actions που γίνονται όταν διαλέγουμε με το αριστερό click ή το empty και πέρνουμε σαν μήνυμα  το να διαλέξουμε ένα βιβλίο ή ένα περιοδικό και φυσικά το Book και το Magazine που μας παραπέμπει στο αντίστοιχο παράθυρο αναλόγως με την επιλογή μας πατώντας έπειτα το κουμπί Add.
	
	{
		// TODO Auto-generated method stub
		
		
		if(choose.getSource() == Create) {
			
			if(Choice.getSelectedItem().toString().equalsIgnoreCase("Empty"))
			{
			JOptionPane.showMessageDialog(this, "Choose Book OR Magazine please.","Message",JOptionPane.WARNING_MESSAGE);	
			
		}
		else if(Choice.getSelectedItem().toString().equalsIgnoreCase("Book"))
		{
		dispose();
		Addwindow window = new Addwindow("Book");
		
	}
		else if(Choice.getSelectedItem().toString().equalsIgnoreCase("Magazine")) {
			
			dispose();
			Addwindow window = new Addwindow("Magazine"); 
		}
			
		}
		
	if(choose.getSource() == Searchforbook) {
		
		if(Searchwindowforbook.getText().equalsIgnoreCase("")) {
			
			JOptionPane.showMessageDialog(this, "Please give Title OR ISBN to search for book.","Message",JOptionPane.WARNING_MESSAGE);
		}
		
			else {
				
				Searchwindowforbook A = new Searchwindowforbook(Searchwindowforbook.getText());
				dispose();
			}
			
		}
if(choose.getSource() == Searchformagazine) {
		
		if(Searchwindowformagazine.getText().equalsIgnoreCase("")) {
			
			JOptionPane.showMessageDialog(this, "Please give Title OR Year to search for magazine.","Message",JOptionPane.WARNING_MESSAGE);
		}
		
			else {
				
				Searchwindowformagazine B = new Searchwindowformagazine(Searchwindowformagazine.getText());
				dispose();
			}
			
		}
	
	
	
		
		
		
	}

	}
