package Apresentação;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Negócio.Cargo;

public class VisaoFolhaDePagamento extends JFrame {
// propriedades da classe
	private static final long serialVersionUID = 1L;

	private JLabel lblidCargo = new JLabel("idCargo");
	private JComboBox<String> cboidCargo = new JComboBox<String>();

	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();

	private JLabel lblFolha = new JLabel("Folha de Pagamento");
	private JTextArea txtFolha = new JTextArea();
	private JScrollPane jspFolha = new JScrollPane(txtFolha);

	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");

	// método principal de execução da classe
	public static void main(String[] args) {
		new VisaoFolhaDePagamento().setVisible(true);
	}

	// método construtor da classe
	public VisaoFolhaDePagamento() {
		// configuração da janela
		setTitle("Colaborador");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		// configuração do id do cargo
		lblidCargo.setBounds(10, 10, 200, 20);
		add(lblidCargo);
		cboidCargo.setBounds(10, 30, 200, 20);
		add(cboidCargo);
		cboidCargo.addItem("---Selecione o Cargo---");
		try {
			for (Cargo objCargo : Cargo.getTodos()) {
				cboidCargo.addItem(objCargo.getNome() + "(R$ " + objCargo.getSalario() + ")");
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		// configuração do nome
		lblNome.setBounds(10, 60, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 80, 265, 20);
		add(txtNome);

		// configuração da caixa
		lblFolha.setBounds(10, 110, 200, 20);
		add(lblFolha);
		jspFolha.setBounds(10, 130, 750, 375);
		add(jspFolha);
		txtFolha.setLineWrap(true);

		// configuração dos botões
		btnCalcular.setBounds(197, 525, 90, 20);
		add(btnCalcular);
		btnCalcular.addActionListener(new ControladorCalcular(txtFolha));

		btnGravar.setBounds(297, 525, 90, 20);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(cboidCargo, txtNome));

		btnLimpar.setBounds(397, 525, 90, 20);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(cboidCargo, txtNome, txtFolha));

		btnSair.setBounds(497, 525, 90, 20);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
