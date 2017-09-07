package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton an = new JButton();
	JButton vn = new JButton();
	String pn = "";
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.GUI();

	}

	void addname() {
		names.add(pn);
	}

	void GUI() {
		an.setText("Add Name");
		vn.setText("View Names");
		frame.add(panel);
		frame.setVisible(true);
		panel.add(an);
		panel.add(vn);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		an.addActionListener(this);
		vn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == an) {
			pn = JOptionPane.showInputDialog("Please Enter a Name");
			addname(); 
		}
		if (e.getSource() == vn) {
			for (int i = 0; i < names.size(); i++) {
				String s = names.get(i);
				System.out.println("Guest #" + i + ": " + s);
			}
		}
	}

	// When the add name button is clicked, display an input dialog that asks
	// the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked,
	// display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
