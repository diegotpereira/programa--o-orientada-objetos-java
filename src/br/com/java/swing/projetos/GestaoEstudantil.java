package br.com.java.swing.projetos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoEstudantil extends JFrame{
    
    private static final long serialVersionUID = -8360585084201808315L;
    private JPanel conteudoPainel;
    private JPanel principalPainel;
    private JPanel painel;

    private JLabel lblNome;
    private JTextField txtNome;

    private JLabel lblChamadaNo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            run
        });
    }
}
