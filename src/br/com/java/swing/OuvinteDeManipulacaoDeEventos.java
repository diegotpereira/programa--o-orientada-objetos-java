package br.com.java.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class OuvinteDeManipulacaoDeEventos extends JFrame{
    
private static final long serialVersionUID	= 6381888569965913982L;
private JPanel conteudoPainel;
private JLabel lblNome;
private JTextField txtNome;
private JButton btn_ok;
private JLabel txtStatus;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            try {
                OuvinteDeManipulacaoDeEventos frame = new OuvinteDeManipulacaoDeEventos();
                frame.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
                
            }
        });
    }
    public OuvinteDeManipulacaoDeEventos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        conteudoPainel = new JPanel();
        setContentPane(conteudoPainel);
        conteudoPainel.setLayout(null);
        conteudoPainel.add(getLabelNome());
        conteudoPainel.add(getTextoNome());
        // conteudoPainel.add(getBotaoOk());
        // conteudoPainel.add(getTextoStatus());
    }
    private JLabel getLabelNome() {
        if (lblNome == null) {
            lblNome = new JLabel("Escreva seu nome:");
            lblNome.setForeground(Color.blue);
            lblNome.setBounds(32, 81, 105, 25);
        }
        return lblNome;
    }
    private JTextField getTextoNome() {
        if (txtNome == null) {
            txtNome = new JTextField();
            txtNome.setBounds(136, 83, 129, 25);

            txtNome.addFocusListener(new FocusListener() {
                @Override
                public void focusLost(FocusEvent e) {
                    txtStatus.setText("Foco perdido: " + txtNome.getText());
                }
                @Override
                public void focusGained(FocusEvent e) {
                    txtStatus.setText("Foco perdido: " + txtNome.getText());
                }
            });
        }
        return txtNome;
    }
}
