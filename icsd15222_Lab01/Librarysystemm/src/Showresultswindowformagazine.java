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

public class Showresultswindowformagazine extends JFrame implements ActionListener //κλάση για την εμφάνιση των στοιχείων του περιοδικού που καταχωρήσαμε.

{

	private JPanel pan;
	
	private JLabel titleofmagazine , yearofmagazine, volumenumber , issuenumber , subjectcategory , numberofpagesfromthemagazine , positionofmagazine;	
	private JButton button;
	
	public  Showresultswindowformagazine(String things , Library obj1 ) {
		
		super("Results for Magazine.");
		
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan = new JPanel();
		
		BoxLayout box = new BoxLayout(pan,BoxLayout.LINE_AXIS);
		
		button = new JButton("Back ");
		button.addActionListener(this);
		
			
			titleofmagazine = new JLabel("Magazine Title :"+obj1.titleofmagazine);
			yearofmagazine=new JLabel("Year Of Magazine :"+obj1.yearofmagazine);
			volumenumber= new JLabel("Volume Number :"+obj1.volumenumber);
			issuenumber= new JLabel("Issue Number :"+obj1.issuenumber);
			subjectcategory= new JLabel("Subject Category :"+obj1.subjectcategory);
			numberofpagesfromthemagazine=new JLabel("Number Of pages From The Magazine :"+obj1.numberofpagesfromthemagazine);
			positionofmagazine=new JLabel("Position Of Magazine :"+obj1.positionofmagazine);
			
			pan.add(titleofmagazine);
			pan.add(Box.createRigidArea(new Dimension(800,20)));
			pan.add(yearofmagazine);
			pan.add(Box.createRigidArea(new Dimension(800,20)));
			pan.add(volumenumber);
			pan.add(Box.createRigidArea(new Dimension(800,20)));
			pan.add(issuenumber);
			pan.add(Box.createRigidArea(new Dimension(800,20)));
			pan.add(subjectcategory);
			pan.add(Box.createRigidArea(new Dimension(800,20)));
			pan.add(numberofpagesfromthemagazine);
			pan.add(Box.createRigidArea(new Dimension(800,20)));
			pan.add(positionofmagazine);
			
			
		
		
		pan.add(Box.createRigidArea(new Dimension(800,20)));
		pan.add(button);
		this.add(pan);
		this.setVisible(true);
		
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent z) {
		// TODO Auto-generated method stub
		
		if(z.getSource()==button) {
			dispose();
			Librarywindow lw = new Librarywindow();
		}
	}

}