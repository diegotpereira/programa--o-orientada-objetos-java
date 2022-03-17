package br.com.java.swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton {
	
	public ImageButton() {
		JFrame frame = new JFrame();
		JButton button = new JButton(new ImageIcon("resource/pressit.jpg"));
		button.setBounds(120, 100, 200, 80);

		frame.add(button);
		frame.setSize(450, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ImageButton();
	}
}
