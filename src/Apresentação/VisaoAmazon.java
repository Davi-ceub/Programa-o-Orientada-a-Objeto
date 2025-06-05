package Apresentação;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negócio.Cliente;
import Negócio.Produto;

public class VisaoAmazon extends JFrame {
// propriedades da classe
	private static final long serialVersionUID = 1L;

	private JLabel lblidProduto = new JLabel("idProduto");
	private JComboBox<String> cboidProduto = new JComboBox<String>();

	private JLabel lblidCliente = new JLabel("idCliente");
	private JComboBox<String> cboidCliente = new JComboBox<String>();

	private JLabel lblData = new JLabel("Data");
	private JTextField txtData = new JTextField();

	private JLabel lblQuantidade = new JLabel("Quantidade");
	private JTextField txtQuantidade = new JTextField();

	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");

	// método principal de execucao da classe
	public static void main(String[] args) {
		new VisaoAmazon().setVisible(true);
	}

	// método construtor da classe
	public VisaoAmazon() {
		// configuração da janela
		setTitle("Compra Amazon");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		// configuração do idProduto
		lblidProduto.setBounds(10, 10, 200, 20);
		add(lblidProduto);
		cboidProduto.setBounds(10, 30, 175, 20);
		add(cboidProduto);
		cboidProduto.addItem("---Selecione o Produto---");
		try {
			for (Produto objProduto : Produto.getTodos()) {
				cboidProduto.addItem(objProduto.getNome() + "(R$ " + objProduto.getPreco() + ")");
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}

		// configuração do idCliente
		lblidCliente.setBounds(10, 60, 200, 20);
		add(lblidCliente);
		cboidCliente.setBounds(10, 80, 175, 20);
		add(cboidCliente);
		cboidCliente.addItem("---Selecione o Cliente---");
		try {
			for (Cliente objCliente : Cliente.getTodos()) {
				cboidCliente.addItem(objCliente.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		// configuração da Data
		lblData.setBounds(10, 110, 200, 20);
		add(lblData);
		txtData.setBounds(10, 130, 100, 20);
		add(txtData);

		// configuração da Quantidade
		lblQuantidade.setBounds(10, 160, 200, 20);
		add(lblQuantidade);
		txtQuantidade.setBounds(10, 180, 50, 20);
		add(txtQuantidade);

		// configuração dos botões
		btnGravar.setBounds(10, 210, 75, 20);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(cboidProduto, cboidCliente, txtData, txtQuantidade));

		btnLimpar.setBounds(103, 210, 75, 20);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(cboidProduto, cboidCliente, txtData, txtQuantidade));

		btnSair.setBounds(195, 210, 75, 20);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
