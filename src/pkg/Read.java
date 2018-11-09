package pkg;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Read {
	public void readFrame1() {
		JFrame readFrame = new JFrame();
		JPanel mpanel = new JPanel(new BorderLayout());
		JPanel south = new JPanel();
		JPanel center = new JPanel();
		JPanel north = new JPanel();
		readFrame.add(mpanel);
		mpanel.add(south, BorderLayout.SOUTH);
		mpanel.add(center, BorderLayout.CENTER);
		mpanel.add(north, BorderLayout.NORTH);
		JButton read = new JButton("Read the Card");
		JTextArea area = new JTextArea();
		center.add(area);
		south.add(read);	
		readFrame.setVisible(true);
		readFrame.setSize(800, 390);
		readFrame.setLocationRelativeTo(null);
		readFrame.setTitle("Read");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				File file = new File("Card.txt");
				try {
					Scanner out = new Scanner(file);
						if (out.hasNextLine()) {
						area.setText(out.nextLine());
						}
						else {
							area.setText("Nothing in text file!");
						}
						out.close();
				} catch (FileNotFoundException e) {
					System.out.println("File not Found!");
					e.printStackTrace();
				}
				
			}
		});
		
	}
}