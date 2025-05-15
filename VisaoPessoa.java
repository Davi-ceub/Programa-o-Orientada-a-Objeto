package Apresentação;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VisaoPessoa extends JFrame {
	// propriedades da classe
	private static final long serialVersionUID = 1L;

	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();

	private JLabel lblEndereco = new JLabel("Endereco");
	private JTextField txtEndereco = new JTextField();

	private JLabel lblTelefone = new JLabel("Telefone");
	private JTextField txtTelefone = new JTextField();

	private JButton btnGravar = new JButton("Gravar");
	
// método principal de execução
	public static void main(String[] args) {
	new VisaoPessoa().setVisible(true);
}
	// método construtor da classe
	public VisaoPessoa() {
		// configuração da pessoa
		setTitle("Cadastro de Pessoas");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// configuração do nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 265, 20);
		add(txtNome);
		
		// configuração Endereço
		lblEndereco.setBounds(10, 60, 200, 20);
		add(lblEndereco);
		txtEndereco.setBounds(10, 80, 265, 20);
		add(txtEndereco);
		
		// configuração Telefone
		lblTelefone.setBounds(10, 110, 200, 20);
		add(lblTelefone);
		txtTelefone.setBounds(10, 130, 150, 20);
		add(txtTelefone);
		
		// configuração botão
		btnGravar.setBounds(90,180 , 95, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome,txtEndereco,txtTelefone));
	}
}