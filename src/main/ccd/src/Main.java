package main.ccd.src;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
Read read = new Read();
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel main = new JPanel(new BorderLayout());
		JPanel south = new JPanel();
		JPanel north = new JPanel();
		JPanel center = new JPanel();
		main.add(center, BorderLayout.CENTER);
		main.add(south, BorderLayout.SOUTH);
		main.add(north, BorderLayout.NORTH);
		frame.add(main);
		JButton create = new JButton("Create a new Card");
		JButton readBack = new JButton("Read back a card");
		JLabel label = new JLabel("Welcome to the Christmas Card Creator!");
		label.setFont(new Font("Serif", Font.PLAIN, 30));
		JLabel label1 = new JLabel("Made by Evan Carter");
		label1.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		center.add(label);
		center.add(label1);
		south.add(readBack);
		south.add(create);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setVisible(true);
		frame.setTitle("Christmas Card Deployer");
		frame.setLocationRelativeTo(null);
readBack.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e1) {
		Read read = new Read();
		read.readFrame1();
	}
});
create.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e1) {
		Create create = new Create();
		create.createCard();
	}
});

}
}
