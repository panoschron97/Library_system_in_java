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
import javax.swing.JTextField;

public class Authorswindow extends JFrame implements ActionListener //κλάση έτσι ώστε αν υπάρχουν παραπάνω απο 1 συγγραφέας σε ένα βιβλίο. 

{
	
	
	private JTextField[] Authors0;
	private JLabel[] Authors1;
	private JPanel pan;
	private JButton addbutton;
	private ArrayList<String> Authors;
	
	public Authorswindow(int num) {
		
		super("Add authors.");
		
		Authors0 =  new JTextField[num];
		Authors1 = new JLabel[num];
		Authors = new <String> ArrayList();
		
		pan = new JPanel();
		
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout box = new BoxLayout(pan,BoxLayout.LINE_AXIS);
		
		pan.add(Box.createRigidArea(new Dimension(700,10)));
		
		for(int i=0; i<num; i++) {
			
			Authors1[i] = new JLabel("Author" + (i+1) + ":");
			Authors0[i] = new JTextField(10);
			pan.add(Authors1[i]);
			pan.add(Authors0[i]);
			pan.add(Box.createRigidArea(new Dimension(700,10)));
		}
			
			addbutton = new JButton("Add");
			addbutton.addActionListener(this);
			
			pan.add(addbutton);
			
			this.add(pan);
			this.setVisible(true);
		
	}
	
	public void Authorsinarraylist(String Author) {
		Authors.add(Author);
		
		
	}
	
	public ArrayList<String>getauthors(){
		return Authors;
	}
		
	
	
	

	@Override
	public void actionPerformed(ActionEvent choose) {
		// TODO Auto-generated method stub
		
		if(choose.getSource()==addbutton) {
			for(int i=0; i<Authors0.length; i++) {
				Authorsinarraylist(Authors0[i].getText());
				dispose();
			}
		}
		
	}
	
	

}
