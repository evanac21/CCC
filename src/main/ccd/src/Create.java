package main.ccd.src;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Create {

	public void createCard() {
		JFrame frame1 = new JFrame();
		JPanel main = new JPanel(new BorderLayout());
		JPanel south = new JPanel();
		JPanel north = new JPanel();
		JPanel center = new JPanel();
		frame1.add(main);
		main.add(center, BorderLayout.CENTER);
		main.add(south, BorderLayout.SOUTH);
		main.add(north, BorderLayout.NORTH);
		JLabel labelForName = new JLabel("Please enter recipents name here: ");
		JTextField name = new JTextField(20);
		JLabel labelForGift = new JLabel("Please enter gift recieved here: ");
		JTextField gift = new JTextField(20);
		JLabel labelForSender = new JLabel("Please enter your name here: ");
		JTextField sender = new JTextField(20);
		JLabel done = new JLabel();
		JButton submit = new JButton("Submit");
		south.add(done);
		south.add(submit);
		north.add(labelForSender);
		north.add(sender);
		center.add(labelForGift);
		center.add(gift);
		center.add(labelForName);
		center.add(name);
		frame1.setVisible(true);
		frame1.setSize(600, 400);
		frame1.setTitle("Create");
	submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e1) {
			String name1 = sender.getText();
			String recpient = name.getText();
			String gift1 = gift.getText();
			try {
				FileWriter fw = new FileWriter("Card.txt");
				fw.write("Thank you " + recpient + "! for the " + gift1 + ". I really like the gift and appreciate that you thought of me this Christmas. From: " + name1);
				fw.close();
				done.setText("Write done!");
			} catch (IOException e) {
				System.out.println("IOException");
				e.printStackTrace();
			}
		}
	});
		
	
	}
}
