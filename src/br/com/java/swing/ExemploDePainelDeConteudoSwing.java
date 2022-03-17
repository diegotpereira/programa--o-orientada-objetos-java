package br.com.java.swing;

import javax.swing.*;

public class ExemploDePainelDeConteudoSwing {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Primeiro Programa Swing: JavaEstudante");

		JPanel conteudoPainel = new JPanel();
		conteudoPainel.setLayout(null);
		conteudoPainel.setSize(400, 450);

		JLabel label = new JLabel("Primeiro Programa Java Swing!");
		label.setLocation(10, 100);
		label.setSize(150, 25);

		JButton button = new JButton("Clicar");
		button.setBounds(165, 100, 100, 40);

		conteudoPainel.add(label);
		conteudoPainel.add(button);

		frame.getContentPane().add(conteudoPainel);

		frame.setSize(400, 450);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
