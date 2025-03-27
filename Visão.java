package Apresentação;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visão extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	private JMenuBar barraDeMenu = new JMenuBar();
	private JMenu mnuArquivo = new JMenu("Arquivo"); // mnu = menu
	private JMenuItem mniNovo = new JMenuItem("Novo"); // mni = menuItem
	private JMenuItem mniAbrir = new JMenuItem("Abrir");
	private JMenuItem mniSair = new JMenuItem("Sair");
	private JMenu mnuEditar = new JMenu("Editar");
	private JMenuItem mniCopiar = new JMenuItem("Copiar");
	private JMenuItem mniColar = new JMenuItem("Colar");
	private JButton btnGravar = new JButton("Gravar"); // btn = button
	private JLabel lblUsuario = new JLabel("Usuário"); // lbl = label
	private JTextField txtUsuario = new JTextField(); // txt = text
	private JLabel lblDescricao = new JLabel("Descrição");
	private JTextArea txtDescricao = new JTextArea();
	private JScrollPane jspDescricao = new JScrollPane(txtDescricao); // jsp = Java scroll pane
	private JLabel lblOpcao = new JLabel("Opção");
	private JComboBox<String> cboOpcao = new JComboBox<String>(); // cbo = combo box
	private JCheckBox chkSalvarSenha = new JCheckBox("Salvar Senha"); // chk = check box
	private JLabel lblSexo = new JLabel("Sexo");
	private JRadioButton optMasculino = new JRadioButton("Masculino"); // opt = option
    private JRadioButton optFeminino = new JRadioButton("Feminino");
    private JRadioButton optDoenteMental = new JRadioButton("Doente Mental");
    private ButtonGroup btgSexo = new ButtonGroup(); // btg = button group
    private JLabel lblBancoDeDados = new JLabel("Banco de Dados");
    private JList<String> lstBancoDeDados = new JList<String>(); // lst = list
    private JScrollPane jspBancoDeDados = new JScrollPane(lstBancoDeDados); 
    private DefaultListModel<String> dlmBancodeDados = new DefaultListModel<String>(); // dlm = default list model 
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Visão().setVisible(true);
	}

	// método construtor da classe
	public Visão() {
		// configuração da janela
		setTitle("Janela de Exemplificação do Uso de Controles Gráficos");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		// configuração da barra de menu
		setJMenuBar(barraDeMenu);
		barraDeMenu.add(mnuArquivo);
		barraDeMenu.add(mnuEditar);
		mnuArquivo.add(mniNovo);
		mnuArquivo.add(mniAbrir);
		mnuArquivo.addSeparator();
		mnuArquivo.add(mniSair);
		mnuArquivo.add(mniCopiar);
		mnuArquivo.add(mniColar);

		// Configuração das ações
		mniSair.addActionListener(new ControladorSair());
		mniCopiar.addActionListener(new ControladorCopiar());

		// configuração do botão
		btnGravar.setBounds(462, 660, 100, 30); // x,y,largura, altura
		add(btnGravar);

		// configuração da caixa de texto
		lblUsuario.setBounds(20, 20, 200, 20);
		add(lblUsuario);
		txtUsuario.setBounds(20, 40, 150, 20);
		add(txtUsuario);

		// configuração da área de texto
		lblDescricao.setBounds(20, 70, 200, 20);
		add(lblDescricao);
		jspDescricao.setBounds(20, 90, 900, 200);
		add(jspDescricao);
		txtDescricao.setLineWrap(true);
		
		// configuração da caixa de opções
		lblOpcao.setBounds(20,300, 200, 20);
		add(lblOpcao);
		cboOpcao.setBounds(20,320, 200, 20);
		add(cboOpcao);
		cboOpcao.addItem("--Selecione--");
		cboOpcao.addItem("Opção 1");
		cboOpcao.addItem("Opção 2");
		cboOpcao.addItem("Opção 3");
		cboOpcao.addItem("Opção 4");
		cboOpcao.addItem("Opção 5");
		
		// configuração da caixa de seleção
		chkSalvarSenha.setBounds(20,350,200, 20);
		add(chkSalvarSenha);		
		
		// configuração do conjunto de opções alternativas
		lblSexo.setBounds(20,380,200,20);
		add(lblSexo);
		optMasculino.setBounds(20,400,150,20);
		add(optMasculino);
		optFeminino.setBounds(190,400,150,20);
		add(optFeminino);
		optDoenteMental.setBounds(340, 400, 150,20);
		add(optDoenteMental);
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		btgSexo.add(optDoenteMental);
		optMasculino.setSelected(true);
		
		// configuração da lista de opções
		lblBancoDeDados.setBounds(20,430,200,20);
		add(lblBancoDeDados);
		jspBancoDeDados.setBounds(20, 450, 200 ,20);
		add(jspBancoDeDados);
		lstBancoDeDados.setModel(dlmBancodeDados);
		dlmBancodeDados.addElement("Registro 1");
		dlmBancodeDados.addElement("Registro 2");
		dlmBancodeDados.addElement("Registro 3");
		dlmBancodeDados.addElement("Registro 4");
		dlmBancodeDados.addElement("Registro 5");
	}

}
