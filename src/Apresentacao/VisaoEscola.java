package Apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negócio.Disciplina;
import Negócio.Professor;

public class VisaoEscola extends JFrame {
// Propriedades da classe
	private static final long serialVersionUID = 1L;

	private JLabel lblidTurma = new JLabel("idTurma");
	private JTextField txtidTurma = new JTextField();

	private JLabel lblDisciplina = new JLabel("Disciplina");
	private JComboBox<String> cboDisciplina = new JComboBox<String>();

	private JLabel lblProfessor = new JLabel("Professor");
	private JComboBox<String> cboProfessor = new JComboBox<String>();

	private JLabel lblLetra = new JLabel("Letra");
	private JTextField txtLetra = new JTextField();

	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");

	// método principal de execução da classe
	public static void main(String[] args) {
		new VisaoEscola().setVisible(true);
	}

// método construtor da classe
	public VisaoEscola() {
		// configuração da janela
		setTitle("Cadastro da Turma");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		// configuração do id da turma
		lblidTurma.setBounds(10, 10, 200, 20);
		add(lblidTurma);
		txtidTurma.setBounds(10, 30, 70, 20);
		add(txtidTurma);

		// configuração disciplina
		lblDisciplina.setBounds(10, 60, 200, 20);
		add(lblDisciplina);
		cboDisciplina.setBounds(10, 80, 265, 20);
		add(cboDisciplina);
		cboDisciplina.addItem("---Selecione a Disciplina---");
		try {
			for (Disciplina objDisciplina : Disciplina.getTodos()) {
				cboDisciplina.addItem(objDisciplina.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		// configuração do professor
		lblProfessor.setBounds(10, 110, 200, 20);
		add(lblProfessor);
		cboProfessor.setBounds(10, 130, 265, 20);
		add(cboProfessor);
		cboProfessor.addItem("---Selecione o Professor---");
		try {
			for (Professor objProfessor : Professor.getTodos()) {
				cboProfessor.addItem(objProfessor.getNome() + "//" + objProfessor.getTitulacao());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		// configuração da letra
		lblLetra.setBounds(10, 160, 200, 20);
		add(lblLetra);
		txtLetra.setBounds(10, 180, 70, 20);
		add(txtLetra);

		// configuração dos botões
		btnGravar.setBounds(10, 220, 80, 20);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtidTurma,cboDisciplina,cboProfessor,txtLetra));

		btnLimpar.setBounds(100, 220, 80, 20);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtidTurma,cboDisciplina,cboProfessor,txtLetra));

		btnSair.setBounds(190, 220, 80, 20);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
