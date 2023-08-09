//Dylan Power Zoo GUI August 9, 2023

package zoodb;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/* FrameDemo.java requires no other files. */
public class CustomGui extends QueryCreator{
	/**
	 * Create the GUI and show it. For thread safety, this method should be invoked
	 * from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Zoo GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JLabel lblOne = new JLabel("Welcome to Philadelphia Zoo Database where you can view and edit animals in the zoo.");
		JButton btnOne = new JButton("Show all animals.");
		JButton btnTwo = new JButton("Add an animal.");
		
		//emptyLabel.setPreferredSize(new Dimension(200, 100));
		btnOne.setPreferredSize(new Dimension(200,200));
		btnTwo.setPreferredSize(new Dimension(200,200));
		
		panel.add(lblOne);
		panel.add(btnOne);
		panel.add(btnTwo);
		panel.setSize(1500,1500);
		
		btnOne.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectAll();
			}
			});
		
		btnTwo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.removeAll();
				panel.updateUI();
				
				JLabel lblTwo = new JLabel("What species is being adopted by the zoo?");
				TextField tfOne = new TextField(" ");
				
				panel.add(lblTwo);
				panel.add(tfOne);
			}
			});
		
		// Display the window.
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	CustomGui(){
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}