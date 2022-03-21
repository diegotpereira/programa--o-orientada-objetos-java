package br.com.java.swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class PrimeiraJanelaConstrutora extends JFrame{

    private JPanel conteudoPainel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    PrimeiraJanelaConstrutora frame = new PrimeiraJanelaConstrutora();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public PrimeiraJanelaConstrutora() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 150, 450, 300);
        conteudoPainel = new JPanel();
        conteudoPainel.setBorder(new EmptyBorder(5, 5, 5, 5));
        conteudoPainel.setLayout(new BorderLayout(0, 0));
        setContentPane(conteudoPainel);
    }
}