package br.com.java.swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class SwingComponentes extends JFrame {

	private JPanel conteudoPainel;
	private JPanel principalPainel;
	private JPanel painel;

	private JLabel lblNome;
	private JTextField txtNome;

	private JLabel lblMatriculaNo;
	private JTextField txtMatricula;

	private JLabel lblSujeito;
	private JTextField txtSujeito;

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
	private JTable estudanteTabela;
	private JScrollPane scrollPainel;
	private JSeparator separador;
	
	//Inicie o aplicativo
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					SwingComponentes frame = new SwingComponentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//criar o frame
	public SwingComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 461);

		conteudoPainel = new JPanel();
		conteudoPainel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(conteudoPainel);
		conteudoPainel.setLayout(null);
		conteudoPainel.add(getPrincipalPainel());
	}
	private JPanel getPrincipalPainel() {

		if(principalPainel == null) {
			principalPainel = new JPanel();
			principalPainel.setBounds(0, 0, 698, 487);
			principalPainel.setLayout(null);
			principalPainel.add(getPainel());
			principalPainel.add(getScrollPainel());
			principalPainel.add(getSeparador());
		}

		return principalPainel;
	}
	private JPanel getPainel() {
		if (painel == null) {
			painel = new JPanel();
			painel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
			"Formulário Estudante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			painel.setBounds(10, 11, 678, 128);
			painel.setLayout(null);
			painel.add(getLabelNome());
			painel.add(getTextoNome());
			painel.add(getLabelMatriculaNo());
			painel.add(getTextoMatricula());
			painel.add(getLabelSujeito());
			painel.add(getTextoSujeito());
			painel.add(getLabelFaculdade());
			painel.add(getTextoFaculdade());
			painel.add(getLabelDataNascimento());
			painel.add(getTextoDataNascimento());
			painel.add(getFaculdadeNome());
			painel.add(getTextoFaculdadeNome());
			painel.add(getSexoPainel());
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
	private JTextField getTextoNome(){
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(65, 22, 121, 20);
			txtNome.setColumns(10);
		}
		return txtNome;
	}
	private JLabel getLabelMatriculaNo() {
		if (lblMatriculaNo == null) {
			lblMatriculaNo = new JLabel("Matrícula:");
			lblMatriculaNo.setBounds(430, 22, 46, 14);
		}
		return lblMatriculaNo;
	}
	private JTextField getTextoMatricula() {
		if (txtMatricula == null) {
			txtMatricula = new JTextField();
			txtMatricula.setBounds(486, 22, 121, 20);
			txtMatricula.setColumns(10);
		}
		return txtMatricula;
	}
	private JLabel getLabelSujeito(){
		if (lblSujeito == null) {
			lblSujeito = new JLabel("Semestre:");
			lblSujeito.setBounds(208, 51, 48, 14);
		}
		return lblSujeito;
	}
	private JTextField getTextoSujeito() {
		if (txtSujeito == null) {
			txtSujeito = new JTextField();
			txtSujeito.setColumns(10);
			txtSujeito.setBounds(65, 48, 121, 20);
		}
		return txtSujeito;
	}
	private JLabel getLabelFaculdade(){
		if(lblFaculdade == null) {
			lblFaculdade = new JLabel("Curso:");
			lblFaculdade.setBounds(21, 47, 46, 14);
		}
		return lblFaculdade;
	}
	private JTextField getTextoFaculdade() {
		if (txtFaculdade == null) {
			txtFaculdade = new JTextField();
			txtFaculdade.setColumns(10);
			txtFaculdade.setBounds(486, 48, 121, 20);
		}
		return txtFaculdade;
	}
	private JLabel getLabelDataNascimento() {
		if (lblDataNascimento == null) {
			lblDataNascimento = new JLabel("Data Nascimento:");
			lblDataNascimento.setBounds(208, 22, 48, 14);
		}
		return lblDataNascimento;
	}
	private JTextField getTextoDataNascimento() {
		if (txtDataNascimento == null) {
			txtDataNascimento = new JTextField();
			txtDataNascimento.setColumns(10);
			txtDataNascimento.setBounds(266, 22, 121, 20);
		}
		return txtDataNascimento;
	}
	private JLabel getFaculdadeNome() {
		if (lblFaculdadeNome == null) {
			lblFaculdadeNome = new JLabel("Nome Faculdade:");
			lblFaculdadeNome.setBounds(397, 48, 74, 14);
		}
		return lblFaculdadeNome;
	}
	private JTextField getTextoFaculdadeNome() {
		if (txtFaculdadeNome == null) {
			txtFaculdadeNome = new JTextField();
			txtFaculdadeNome.setColumns(10);
			txtFaculdadeNome.setBounds(266, 48, 121, 20);
		}
		return txtFaculdadeNome;
	}
	private JRadioButton getRadioButtonMasculino() {
		if (rdbMasculino == null) {
			rdbMasculino = new JRadioButton("Masculino");
			rdbMasculino.setBounds(6, 18, 54, 23);
		}
		return rdbMasculino;
	}
	private JRadioButton getRadioButtonFeminino() {
		if (rdbFeminino == null) {
			rdbFeminino = new JRadioButton("Masculino");
			rdbFeminino.setBounds(62, 18, 64, 23);
		}
		return rdbFeminino;
	}
	private JPanel getSexoPainel() {
		if (sexoPainel == null) {
			sexoPainel = new JPanel();

			sexoPainel.setBorder(new TitledBorder(null, "Sexo", 
			TitledBorder.LEADING, TitledBorder.TOP, null, null));
			sexoPainel.setBounds(21, 72, 164, 48);
			sexoPainel.setLayout(null);
			sexoPainel.add(getRadioButtonMasculino());
			sexoPainel.add(getRadioButtonFeminino());
		}
		return sexoPainel;
	}
	private JButton getBotaoSalvar() {
		if (btnSalvar == null) {
			btnSalvar = new JButton("Salvar");
			btnSalvar.setBounds(496, 79, 89, 23);
		}
		return btnSalvar;
	}
	private JScrollPane getScrollPainel() {
		if (scrollPainel == null) {
			scrollPainel = new JScrollPane();
			scrollPainel.setBounds(10, 189, 678, 195);
			scrollPainel.setViewportView(getEstudanteTabela());
		}

		return scrollPainel;
	}
	private JTable getEstudanteTabela() {
		if (estudanteTabela == null) {
			estudanteTabela = new JTable();
			estudanteTabela.setModel(new DefaultTableModel(new Object[][] {

			}, new String[] {
				"ID",
				"Nome",
				"MatriculaNo",
				"Curso",
				"Sexo",
				"Faculdade Nome"
			}));
		}
		return estudanteTabela;
	}
	private JSeparator getSeparador() {
		if (separador == null) {
			separador = new JSeparator();
			separador.setBounds(10, 164, 678, 3);
		}
		return separador;
	}
}
