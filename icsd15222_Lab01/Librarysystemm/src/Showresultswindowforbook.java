import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Showresultswindowforbook extends JFrame implements ActionListener //κλάση για την εμφάνιση των στοιχείων του βιβλίου που καταχωρήσαμε.

{

	private JPanel pan;
	
	private JLabel titleofbook , isbnofbook, yearofbook, descriptionofbook, typeofbook, numberofpagesfromthebook, positionofbook;	
	private JButton button;
	private JLabel Authors[];
	
	public  Showresultswindowforbook(String things , Library obj ) {
		
		super("Results for Book.");
		
		Authors = new JLabel[obj.Authors.size()];
		
		
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan = new JPanel();
		
		BoxLayout box = new BoxLayout(pan,BoxLayout.LINE_AXIS);
		
		button = new JButton("Back ");
		button.addActionListener(this);
			
		
		titleofbook = new JLabel("Book Title :"+obj.titleofbook);
		pan.add(Box.createRigidArea(new Dimension(700,20)));
		pan.add(titleofbook);
		pan.add(Box.createRigidArea(new Dimension(700,20)));
		for(int z=0; z<obj.Authors.size(); z++) {
			
			Authors[z] = new JLabel("Author : " + (z+1) + " : " + obj.Authors.get(z));
			pan.add(Authors[z]);
			pan.add(Box.createRigidArea(new Dimension(700,20)));
			
		}
		
		isbnofbook = new JLabel("ISBN Of Book : "+obj.isbnofbook);
		yearofbook = new JLabel("Year Of Book : "+obj.yearofbook);
		descriptionofbook = new JLabel("Description Of Book :"+obj.descriptionofbook);
		typeofbook = new JLabel("Type Of Book : "+obj.typeofbook);
		numberofpagesfromthebook = new JLabel("Number Of Pages From The Book :"+obj.numberofpagesfromthebook);
		positionofbook = new JLabel("Position Of The Book : "+obj.positionofbook);
		
		
		
		pan.add(isbnofbook);
		pan.add(Box.createRigidArea(new Dimension(800,20)));
		pan.add(yearofbook);
		pan.add(Box.createRigidArea(new Dimension(800,20)));
		pan.add(descriptionofbook);
		pan.add(Box.createRigidArea(new Dimension(800,20)));
		pan.add(typeofbook);
		pan.add(Box.createRigidArea(new Dimension(800,20)));
		pan.add(numberofpagesfromthebook);
		pan.add(Box.createRigidArea(new Dimension(800,20)));
		pan.add(positionofbook);
		
		
		pan.add(Box.createRigidArea(new Dimension(800,20)));
		pan.add(button);
		this.add(pan);
		this.setVisible(true);
		
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent choose) 
	
	{
		// TODO Auto-generated method stub
		
		if(choose.getSource()==button) {
			dispose();
			Librarywindow lw = new Librarywindow();
		}
	}

}
