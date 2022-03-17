package br.com.java.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploDeJanelaSwing {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Clique");

		button.setBounds(130, 100, 100, 40);
		frame.add(button);
		frame.setSize(400, 450);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
