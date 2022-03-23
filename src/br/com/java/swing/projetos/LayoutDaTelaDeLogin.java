package br.com.java.swing.projetos;

// import javax.swing.*;
// import javax.swing.border.*;

// import com.jgoodies.forms.layout.*;

// import br.com.java.jdbc.ConexaoSql;

// import com.jgoodies.forms.factories.FormFactory;

// import java.awt.*;
// import java.sql.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import br.com.java.jdbc.ConexaoSql;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPasswordField;

public class LayoutDaTelaDeLogin extends JFrame{

	private static final long	serialVersionUID	= 988172114635610780L;
	private JPanel conteudoPainel;
	private JPanel painelTopo;
	private JPanel painelInferior;
	private JPanel painelEsquerdo;
	private JPanel painelDireito;
	private JPanel painelCentro;

	private JLabel lblUsuarioNome;
	private JTextField txtUsuarioNome;

	private JLabel lblSenha;
	private JPasswordField txtSenha;

	private JButton btnEntrar;
	private JButton btnCancelar;

	private JPanel entrarPainel;
	private JLabel lblStatus;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					LayoutDaTelaDeLogin layoutDaTelaDeLogin = new LayoutDaTelaDeLogin();
					GerenciadorDeJanelas.ui.put("LayoutDaTelaDeLogin", layoutDaTelaDeLogin);
					layoutDaTelaDeLogin.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public LayoutDaTelaDeLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 261);

		conteudoPainel = new JPanel();
		conteudoPainel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(conteudoPainel);
		conteudoPainel.setLayout(new BorderLayout(-2, -2));
		conteudoPainel.add(getPainelTopo(), BorderLayout.NORTH);
		conteudoPainel.add(getPainelInferior(), BorderLayout.SOUTH);
		conteudoPainel.add(getPainelEsquerdo(), BorderLayout.WEST);
		conteudoPainel.add(getPainelDireito(), BorderLayout.EAST);
		conteudoPainel.add(getPainelCentro(), BorderLayout.CENTER);
	}
	private JPanel getPainelTopo() {
		if (painelTopo == null) {
			painelTopo = new JPanel();

			FlowLayout flowLayout = (FlowLayout) painelTopo.getLayout();
			flowLayout.setVgap(10);
			flowLayout.setHgap(10);
			painelTopo.setBackground(UIManager.getColor("activeCaption"));
			painelTopo.setForeground(Color.BLACK);
			painelTopo.setBorder(null);
		}
		return painelTopo;
	}
	private JPanel getPainelInferior() {
		if (painelInferior == null) {
			painelInferior = new JPanel();

			FlowLayout flowLayout = (FlowLayout) painelInferior.getLayout();
			flowLayout.setVgap(10);
			flowLayout.setHgap(10);
			painelInferior.setBackground(UIManager.getColor("activeCaption"));
			painelInferior.setForeground(Color.BLACK);
		}
		return painelInferior;
	}
	private JPanel getPainelEsquerdo() {
		if (painelEsquerdo == null) {
			painelEsquerdo = new JPanel();

			FlowLayout flowLayout = (FlowLayout) painelEsquerdo.getLayout();
			flowLayout.setVgap(10);
			flowLayout.setHgap(10);
			painelEsquerdo.setBackground(UIManager.getColor("activeCaption"));
			painelEsquerdo.setForeground(Color.BLACK);
		}
		return painelEsquerdo;
	}
	private JPanel getPainelDireito() {
		if (painelDireito == null) {
			painelDireito = new JPanel();

			FlowLayout flowLayout = (FlowLayout) painelDireito.getLayout();
			flowLayout.setVgap(10);
			flowLayout.setHgap(10);
			painelDireito.setBackground(UIManager.getColor("activeCaption"));
			painelDireito.setForeground(Color.BLACK);
		}
		return painelDireito;
	}
	private JPanel getPainelCentro() {
		if (painelCentro == null) {
			
			painelCentro = new JPanel();
			painelCentro.setBackground(new Color(204, 255, 204));
			painelCentro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			painelCentro.setForeground(Color.BLACK);
			painelCentro.setLayout( new FormLayout( new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode( "default:grow" ), ColumnSpec.decode( "6dlu" ), FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode( "default:grow" ), }, 
				 new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, 
					RowSpec.decode( "default:grow" ), 
					FormFactory.RELATED_GAP_ROWSPEC, 
					FormFactory.DEFAULT_ROWSPEC, 
					FormFactory.RELATED_GAP_ROWSPEC, 
					FormFactory.DEFAULT_ROWSPEC, 
					FormFactory.RELATED_GAP_ROWSPEC, 
					FormFactory.DEFAULT_ROWSPEC, 
					FormFactory.RELATED_GAP_ROWSPEC, 
					FormFactory.DEFAULT_ROWSPEC, 
					FormFactory.RELATED_GAP_ROWSPEC, 
					FormFactory.DEFAULT_ROWSPEC, 
					FormFactory.RELATED_GAP_ROWSPEC, 
					FormFactory.DEFAULT_ROWSPEC, 
					FormFactory.RELATED_GAP_ROWSPEC, 
					FormFactory.DEFAULT_ROWSPEC, }));
					painelCentro.add(getPainelEntrar(), "2, 2, 9, 8, fill, fill" );
					painelCentro.add(getStatus(), "8, 10, 3, 1");
					painelCentro.add(getBotaoEntrar(), "4, 14");
					painelCentro.add(getBotaoCancelar(), "10, 14");
			
		}
		return painelCentro;
	}
	private JLabel getLabelUsuarioNome() {
		if (lblUsuarioNome == null) {
			lblUsuarioNome = new JLabel("Usuário Nome: ");
			lblUsuarioNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblUsuarioNome;
	}
	private JTextField getTextoUsuarioNome() {
		if (txtUsuarioNome == null) {
			txtUsuarioNome =  new JTextField();
			txtUsuarioNome.setSize(250, 30);
		}
		return txtUsuarioNome;
	}
	private JLabel getLabelSenha() {
		if (lblSenha == null) {
			lblSenha = new JLabel("Senha: ");
			lblSenha.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblSenha;
	}
	private JPasswordField getTextoSenha() {
		if (txtSenha == null) {
			txtSenha =  new JPasswordField();
			txtSenha.setEchoChar( '*' );
		}
		return txtSenha;
	}
	private JButton getBotaoEntrar() {
		if (btnEntrar == null) {
			btnEntrar = new JButton("Entrar");
			btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnEntrar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						Connection connection = ConexaoSql.getConnection();
						Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery("SELECT * FROM estudante");
	
						while(resultSet.next()) {
							System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
						}
						connection.close();
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}
					alternarParaTelaGestaoEstudantil();
				}
			});
		}
		return btnEntrar;
	}
	private JButton getBotaoCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					GerenciadorDeJanelas.ui.clear();
					System.exit(0);
				}
			});
		}
		return btnCancelar;
	}
	private JPanel getPainelEntrar() {
		if (entrarPainel == null) {
			entrarPainel = new JPanel();
			entrarPainel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Entrar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			entrarPainel.setLayout(new GridLayout(2, 3, 2, 2));
			entrarPainel.add(getLabelUsuarioNome());
			entrarPainel.add(getTextoUsuarioNome());
			entrarPainel.add(getLabelSenha());
			entrarPainel.add(getTextoSenha());
		}
		return entrarPainel;
	}
	private JLabel getStatus() {
		if (lblStatus == null) {
			lblStatus = new JLabel("Status:");
			lblStatus.setForeground(new Color(204, 0, 102));
			lblStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblStatus;
	}
	private void alternarParaTelaGestaoEstudantil() {
		GestaoEstudantil gestaoEstudantil = new GestaoEstudantil(txtUsuarioNome.getText());
		GerenciadorDeJanelas.ui.put("GestãoEstudantil", gestaoEstudantil);
		gestaoEstudantil.setVisible(true);

		LayoutDaTelaDeLogin layoutDaTelaDeLogin = (LayoutDaTelaDeLogin) GerenciadorDeJanelas.ui.get("LayoutDaTelaDeLogin");
		layoutDaTelaDeLogin.limparDados();
		layoutDaTelaDeLogin.setVisible(false);
		
	}
	private void limparDados() {
		txtUsuarioNome.setText("");
		txtSenha.setText("");
	}
}
