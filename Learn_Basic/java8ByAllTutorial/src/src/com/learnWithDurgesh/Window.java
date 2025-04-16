package src.com.learnWithDurgesh;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		//

		// create button
		JButton button = new JButton("Click me");

		/*
		 * button.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println("Button get Clicked..");
		 * JOptionPane.showMessageDialog(null,"Hey ...Button Clicked.");
		 * 
		 * } });
		 */

		// Now Instead of using traditional code like above we can also use lambda here.

		button.addActionListener((ActionEvent e) -> {
			System.out.println("Button get Clicked..");
			JOptionPane.showMessageDialog(null, "Hey ...Button Clicked.");
		});

		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
