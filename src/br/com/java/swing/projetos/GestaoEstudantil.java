package br.com.java.swing.projetos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

public class GestaoEstudantil extends JFrame{
    
    private static final long serialVersionUID = -8360585084201808315L;
    private JPanel conteudoPainel;
    private JPanel principalPainel;
    //private JPanel painel;

    //private JLabel lblNome;
    //private JTextField txtNome;

    //private JLabel lblChamadaNo;

	private JLabel ativoUsuario;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
				try {
					GestaoEstudantil frame = new GestaoEstudantil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
        });
    }
	//public GestaoEstudantil(String ativoUsuario) {
	//	this();
	//	this.getAtivoUsuario().setText(ativoUsuario);
	//}
	public GestaoEstudantil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 538);
		conteudoPainel = new JPanel();
		conteudoPainel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(conteudoPainel);
		conteudoPainel.setLayout(null);
		conteudoPainel.add(getPrincipalPainel());
	}
	private JPanel getPrincipalPainel() {
		return principalPainel;	
	}
	private JLabel getAtivoUsuario() {
		return ativoUsuario;
	}
}
