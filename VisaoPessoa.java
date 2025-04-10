package Apresentação;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Negócio.Uf;

public class VisaoPessoa extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;

	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();

	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup btgSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");

	private JLabel lblEndereco = new JLabel("Endereço");
	private JTextField txtEndereco = new JTextField();

	private JLabel lblUf = new JLabel("Uf");
	private JComboBox<String> cboUf = new JComboBox<String>();

	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");

	// método principal de execução da classe
	public static void main(String[] args) {
		new VisaoPessoa().setVisible(true);
	}

	// método construotr da classe
	public VisaoPessoa() {
		// configurações da janela
		setTitle("Cadastro de Pessoas");
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		// Configuração do Nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 365, 20);
		add(txtNome);

		// Configuração do Sexo
		lblSexo.setBounds(10, 60, 200, 20);
		add(lblSexo);
		optMasculino.setBounds(10, 80, 100, 20);
		add(optMasculino);
		optFeminino.setBounds(120, 80, 100, 20);
		add(optFeminino);
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		optMasculino.setSelected(true);

		// configuração endereço
		lblEndereco.setBounds(10, 110, 200, 20);
		add(lblEndereco);
		txtEndereco.setBounds(10, 130, 365, 50);
		add(txtEndereco);

		// configuração UF
		lblUf.setBounds(10, 190, 200, 20);
		add(lblUf);
		cboUf.setBounds(10, 210, 70, 20);
		add(cboUf);
		cboUf.addItem("---");
		try {
			for (Uf objUf : Uf.getTodos()) {
				cboUf.addItem(objUf.getSigla());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);

		}
		// configuração botão
		btnGravar.setBounds(20,250, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, optMasculino, txtEndereco, cboUf));
		
        btnLimpar.setBounds(140, 250, 100, 30);
        add(btnLimpar);
        btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, cboUf));
        
        btnSair.setBounds(260, 250, 100, 30);
        add(btnSair);
        btnSair.addActionListener(new ControladorSair());
	}
}