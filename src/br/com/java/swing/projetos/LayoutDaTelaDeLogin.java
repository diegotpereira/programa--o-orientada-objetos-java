package br.com.java.swing.projetos;

import javax.swing.*;
import javax.swing.border.*;

import com.jgoodies.forms.layout.*;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.*;

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

	private JPanel loginPainel;
	private JLabel lblStatus;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					LayoutDaTelaDeLogin layoutDaTelaDeLogin = new LayoutDaTelaDeLogin();
					WindowManager.ui.put("LayoutDaTelaDeLogin", layoutDaTelaDeLogin);
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
			painelTopo.setBackground(UIManager.getColor("activeCaption"));
			painelTopo.setForeground(Color.BLACK);
		}
		return painelInferior;
	}
	private JPanel getPainelEsquerdo() {
		if (painelEsquerdo == null) {
			painelEsquerdo = new JPanel();

			FlowLayout flowLayout = (FlowLayout) painelEsquerdo.getLayout();
			flowLayout.setVgap(10);
			flowLayout.setHgap(10);
			painelTopo.setBackground(UIManager.getColor("activeCaption"));
			painelTopo.setForeground(Color.BLACK);
		}
		return painelEsquerdo;
	}
	private JPanel getPainelDireito() {
		if (painelDireito == null) {
			painelDireito = new JPanel();

			FlowLayout flowLayout = (FlowLayout) painelDireito.getLayout();
			flowLayout.setVgap(10);
			flowLayout.setHgap(10);
			painelTopo.setBackground(UIManager.getColor("activeCaption"));
			painelTopo.setForeground(Color.BLACK);
		}
		return painelDireito;
	}
	private JPanel getPainelCentro() {
		if (painelCentro == null) {
			
			painelCentro = new JPanel();
			painelCentro.setBackground(new Color(204, 255, 204));
			painelCentro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			painelCentro.setForeground(Color.black);
			painelCentro.setLayout( new FormLayout( new ColumnSpec[] { 
				FormFactory.RELATED_GAP_COLSPEC, 
				ColumnSpec.decode( "default:grow" ), 
				ColumnSpec.decode( "6dlu" ), 
				FormFactory.DEFAULT_COLSPEC, 
				FormFactory.RELATED_GAP_COLSPEC, 
				FormFactory.DEFAULT_COLSPEC,
				 FormFactory.RELATED_GAP_COLSPEC, 
				 FormFactory.DEFAULT_COLSPEC, 
				 FormFactory.RELATED_GAP_COLSPEC, 
				 ColumnSpec.decode( "default:grow" ), }, 
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
			
		}
	}
}
