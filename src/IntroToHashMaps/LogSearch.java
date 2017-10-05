package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	HashMap<Integer, String> Logs = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	JButton entry = new JButton("Enter a name");
	JButton search = new JButton("Search the log");
	JButton list = new JButton("List Name");
	JButton remove = new JButton("Remove Entry");
	String name;
	int idd;

	public static void main(String[] args) {
		LogSearch logz = new LogSearch();
		logz.GUI();
		logz.addlog();
	}

	void addlog() {
		Logs.put(idd, name);
	}

	void GUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(pan);
		frame.setVisible(true);
		pan.add(entry);
		pan.add(search);
		pan.add(list);
		pan.add(remove);
		frame.pack();
		entry.addActionListener(this);
		search.addActionListener(this);
		list.addActionListener(this);
		remove.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == entry) {
			name = JOptionPane.showInputDialog("Please Enter a name");
			String idz = JOptionPane.showInputDialog("Link with an id");
			idd = Integer.parseInt(idz);
			addlog();
		}
		if (arg0.getSource() == search) {
			String idname = JOptionPane.showInputDialog("Type in the id");
			int idnameint = Integer.parseInt(idname);
			System.out.println("The id at " + idnameint + " is " + Logs.get(idnameint));
		}
		if (arg0.getSource() == list) {
			for (Integer i : Logs.keySet()) {
				System.out.println("Id: " + i + " Name: " + Logs.get(i));
			}
		}
		if (arg0.getSource() == remove) {
			String idremove = JOptionPane.showInputDialog("Type the ID you want to remove");
			int idremoveint = Integer.parseInt(idremove);

			if (Logs.containsKey(idremoveint) == Logs.isEmpty()) {
				System.out.println("ID at " + idremove + " does not exists");
			} else {
				System.out.println("The ID: " + idremoveint + " Name: " + Logs.get(idremoveint) + " Has been removed");
				Logs.remove(idremoveint);
			}
		}
	}
}
/*
 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
 * an input dialog to ask the user to enter an ID number. After an ID is
 * entered, use another input dialog to ask the user to enter a name. Add this
 * information as a new entry to your HashMap.
 * 
 * Button 2: Search by ID When this button is clicked, use an input dialog to
 * ask the user to enter an ID number. If that ID exists, display that name to
 * the user. Otherwise, tell the user that that entry does not exist.
 * 
 * Button 3: View List When this button is clicked, display the entire list in a
 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
 * 
 * When this is complete, add a fourth button to your window. Button 4: Remove
 * Entry When this button is clicked, prompt the user to enter an ID using an
 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
 * the user that the ID is not in the list.
 *
 */