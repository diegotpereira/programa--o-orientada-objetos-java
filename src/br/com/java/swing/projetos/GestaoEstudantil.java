package br.com.java.swing.projetos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;

public class GestaoEstudantil extends JFrame{
    
    private static final long serialVersionUID = -8360585084201808315L;
    private JPanel conteudoPainel;
    private JPanel principalPainel;
    private JPanel painel;

    private JLabel lblNome;
    private JTextField txtNome;

    private JLabel lblChamadaNo;
	private JTextField txtChamadaNo;

	private JLabel lblSemestre;
	private JTextField txtSemestre;

	private JLabel lblFaculdade;
	private JTextField txtFaculdade;

	private JLabel lblDataNascimento;
	private JTextField txtDataNascimento;

	private JLabel lblFaculdadeNome;
	private JTextField txtFaculdadeNome;

	private JRadioButton rdbMasculino;
	private JRadioButton rdbFeminino;

	private JPanel sexoPainel;

	private JButton btnSalvar;

	private JTable tabelaEstudante;

	private JLabel lblUsuario;
	private JLabel ativoUsuario;

	private JButton btnSair;
	private JButton btnExit;

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
	public GestaoEstudantil(String ativoUsuario) {
		this();
		this.getAtivoUsuario().setText(ativoUsuario);
	}
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
		if(principalPainel == null ){
			principalPainel = new JPanel();
			principalPainel.setBounds(0, 0, 753, 487);
			principalPainel.setLayout(null);
			principalPainel.add((getPainel()));
			principalPainel.add(getTabelaEstudante());
			principalPainel.add(getLabelUsuario());
			principalPainel.add(getAtivoUsuario());
			principalPainel.add(getBotaoSair());
			principalPainel.add(getBotaoExitar());
			
		}
		return principalPainel;
	}
	private JPanel getPainel() {
		if (painel == null) {
			painel = new JPanel();
			painel.setBorder(new TitledBorder(
				UIManager.getBorder("TitledBorder.border"), 
				"Formulário de Estudante", 
				TitledBorder.LEADING, 
				TitledBorder.TOP,
				null,
				new Color(0, 0, 0)));
				painel.setBounds(10, 43, 723, 128);
				painel.setLayout(null);
				painel.add(getLabelNome());
				painel.add(getTextoNome());
				painel.add(getLabelChamadaNo());
				painel.add(getTextoChamadaNo());
				painel.add(getLabelSemestre());
				painel.add(getTextoSemestre());
				painel.add(getLabelFaculdadeNome());
				painel.add(getTextoFaculdadeNome());
				painel.add(getLabelFaculdade());
				painel.add(getTextoFaculdade());
				painel.add(getLabelDataNascimento());
				painel.add(getTextoDataNascimento());
				painel.add(getPainelSexo());
				painel.add(getBotaoSalvar());
				
		}
		return painel;
	}
	private JLabel getLabelNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setBounds(21, 22, 48, 14);
		}
		return lblNome;
	}
	private JTextField getTextoNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(65, 22, 121, 20);
			txtNome.setColumns(10);
		}
		return txtNome;
	}
	private JLabel getLabelChamadaNo() {
		if (lblChamadaNo == null) {
			lblChamadaNo = new JLabel("Matricula Nº:");
			lblChamadaNo.setBounds(452, 22, 76, 14);
		}
		return lblChamadaNo;
	}
	private JTextField getTextoChamadaNo() {
		if(txtChamadaNo == null) {
			txtChamadaNo = new JTextField();
			txtChamadaNo.setBounds(528, 19, 121, 20);
			txtChamadaNo.setColumns(10);
		}
		return txtChamadaNo;
	}
	private JLabel getLabelSemestre() {
		if (lblSemestre == null) {
			lblSemestre = new JLabel("Semestre:");
			lblSemestre.setBounds(196, 51, 72, 14);
		}
		return lblSemestre;
	}
	private JTextField getTextoSemestre() {
		if (txtSemestre == null) {
			txtSemestre = new JTextField();
			txtSemestre.setColumns(10);
			txtSemestre.setBounds(65, 48, 121, 20);
		}
		return txtSemestre;
	}
	private JLabel getLabelFaculdade() {
		if (lblFaculdade == null) {
			lblFaculdade = new JLabel( "Faculdade" );
			lblFaculdade.setBounds(21, 47, 46, 14);
		}
		return lblFaculdade;
	}
	private JTextField getTextoFaculdade() {
		if (txtFaculdade == null) {
			txtFaculdade = new JTextField();
			txtFaculdade.setColumns(10);
			txtFaculdade.setBounds(528, 45, 121, 20);
		}
		return txtFaculdade;
	}
	private JLabel getLabelDataNascimento() {
		if (lblDataNascimento == null) {
			lblDataNascimento = new JLabel( "Data de Nascimento:" );
			lblDataNascimento.setBounds(196, 22, 72, 14);
		}
		return lblDataNascimento;
	}
	private JTextField getTextoDataNascimento() {
		if (txtDataNascimento == null) {
			txtDataNascimento = new JTextField();
			txtDataNascimento.setColumns(10);
			txtDataNascimento.setBounds(278, 22, 121, 20);
		}
		return txtDataNascimento;
	}
	private JLabel getLabelFaculdadeNome() {
		if (lblFaculdadeNome == null) {
			lblFaculdadeNome = new JLabel("Faculdade Nome:");
			lblFaculdadeNome.setBounds(419, 48, 109, 14);
		}
		return lblFaculdadeNome;
	}
	private JTextField getTextoFaculdadeNome() {
		if (txtFaculdadeNome == null) {
			txtFaculdadeNome = new JTextField();
			txtFaculdadeNome.setColumns(10);
			txtFaculdadeNome.setBounds(278, 48, 121, 20);
		}
		return txtFaculdadeNome;
	}
	private JRadioButton getBotaoSexoMasculino() {
		if (rdbMasculino == null) {
			rdbMasculino = new JRadioButton("Masculino");
			rdbMasculino.setBounds(6, 18, 54, 23);
		}
		return rdbMasculino;
	}
	private JRadioButton getBotaoSexoFeminino() {
		if (rdbFeminino == null) {
			rdbFeminino = new JRadioButton("Masculino");
			rdbFeminino.setBounds(6, 18, 54, 23);
		}
		return rdbFeminino;
	}
	private JPanel getPainelSexo() {
		if (sexoPainel == null) {
			sexoPainel = new JPanel();
			sexoPainel.setBorder(new TitledBorder(
				null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));

			sexoPainel.setBounds(21, 72, 169, 48);
			sexoPainel.setLayout(null);
			sexoPainel.add(getBotaoSexoMasculino());
			sexoPainel.add(getBotaoSexoFeminino());
		}
		return sexoPainel;
	}
	private JButton getBotaoSalvar() {
		if (btnSalvar == null) {
			btnSalvar = new JButton("Salvar");
			btnSalvar.setBounds(560, 79, 89, 23);
		}
		return btnSalvar;
	}
	private JTable getTabelaEstudante() {
		if (tabelaEstudante == null) {
			tabelaEstudante = new JTable();
			tabelaEstudante.setBounds(10, 214, 678, 195);
		}
		return tabelaEstudante;
	}
	private JLabel getLabelUsuario() {
		if (lblUsuario == null) {
			lblUsuario = new JLabel( "Usuário Ativo" );
			lblUsuario.setForeground(new Color(0,0, 128));
			lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblUsuario.setBounds(430, 13, 76, 23);
		}
		return lblUsuario;
	}
	private JLabel getAtivoUsuario() {
		if (ativoUsuario == null) {
			ativoUsuario = new JLabel();
			ativoUsuario.setBackground(new Color(245, 245, 245));
			ativoUsuario.setBackground(new Color(95, 158, 160));
			ativoUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
			ativoUsuario.setBounds(511, 14, 111, 12);
		}
		return ativoUsuario;
	}
	private JButton getBotaoSair() {
		if (btnSair == null) {
			btnSair = new JButton("");
			btnSair.setIcon(new ImageIcon("resource/logout.png"));
			btnSair.setBounds(626, 5, 54, 37);
			btnSair.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mudarParaTelaDeLogin();
				}
			});
		}
		return btnSair;
	}
	private JButton getBotaoExitar() {
		if (btnExit == null) {
			btnExit = new JButton("Sair");
			btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnExit.setForeground(new Color(255, 0, 0));
			btnExit.setBounds(599, 446, 89, 30);
			btnExit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					GerenciadorDeJanelas.ui.clear();
					System.exit(0);
				}
			});
		}
		return btnExit;
	}
	private void mudarParaTelaDeLogin() {
		LayoutDaTelaDeLogin entrarJanela = (LayoutDaTelaDeLogin) GerenciadorDeJanelas.ui.get("LayoutDaTelaDeLogin");
		entrarJanela.setVisible(true);

		GestaoEstudantil gestaoEstudantil = (GestaoEstudantil) GerenciadorDeJanelas.ui.get("GestaoEstudantil");
		gestaoEstudantil.dispose();
	}
}
