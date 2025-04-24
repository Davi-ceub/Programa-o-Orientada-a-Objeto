package Apresentação;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Negócio.Tipo;

public class VisaoProduto extends JFrame{
	
// propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblPreco = new JLabel("Preço");
    private JTextField txtPreco = new JTextField();
    
    private JLabel lblTipo = new JLabel("Tipo");
    private JComboBox<String> cboTipo = new JComboBox<String>();
    
    private JCheckBox chkPerecivel = new JCheckBox("Perecível");
    
    private JLabel lblDetalhamento = new JLabel("Detalhamento");
    private JTextArea txtDetalhamento = new JTextArea();
    private JScrollPane jspDetalhamento = new JScrollPane(txtDetalhamento);
    
    private JButton btnGravar = new JButton("Gravar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");
    
    // método principal de execução da classe
    public static void main(String[] args) {
    	new VisaoProduto().setVisible(true);
    }
   // método construtor da classe
    public VisaoProduto() {
    	// configurações da janela
    	setTitle("Cadastro de Produtos");
    	setSize(400,500);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	setLayout(null);
    	
    // configuração do nome
    	lblNome.setBounds(10,10,200,20);
    	add(lblNome);
    	txtNome.setBounds(10, 30, 365, 20);
    	add(txtNome);
    	
    // configuração preço
    	lblPreco.setBounds(10, 60, 200, 20);
    	add(lblPreco);
    	txtPreco.setBounds(10, 80, 100, 20);
    	add(txtPreco);
    	
    // configuração tipo
    	lblTipo.setBounds(10, 110, 200, 20);
    	add(lblTipo);
    	cboTipo.setBounds(10, 130, 150, 20);
    	add(cboTipo);
    	cboTipo.addItem("--- Selecione o Tipo ---");
    	try {
    		for (Tipo objTipo : Tipo.getTodos()) {
    			cboTipo.addItem(objTipo.getDescricao());
    		}
    	}catch (Exception erro) {
    		JOptionPane.showMessageDialog(null, erro);
    	}
    	
    // configuração perecivel
    	chkPerecivel.setBounds(10, 160, 80, 20);
    	add(chkPerecivel);
    	
    // configuração Detalhamento
    	lblDetalhamento.setBounds(10, 190, 200, 20);
    	add(lblDetalhamento);
    	jspDetalhamento.setBounds(10,210,365,100);
    	add(jspDetalhamento);
    	txtDetalhamento.setLineWrap(true);
    	
    // configuração botão
    	btnGravar.setBounds(20, 330, 100, 30);
    	add(btnGravar);
    	btnGravar.addActionListener(new ControladorGravar(txtNome,txtPreco,cboTipo,chkPerecivel,txtDetalhamento));
    	
    	btnLimpar.setBounds(143, 330, 100, 30);
    	add(btnLimpar);
        btnLimpar.addActionListener(new ControladorLimpar(txtNome,txtPreco,cboTipo,chkPerecivel,txtDetalhamento));
    	
    	btnSair.setBounds(265, 330, 100, 30);
    	add(btnSair);
    	btnSair.addActionListener(new ControladorSair());
    }
    

}
