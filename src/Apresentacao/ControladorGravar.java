package Apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negócio.Disciplina;
import Negócio.Professor;
import Negócio.Turma;

public class ControladorGravar implements ActionListener {
// propriedades da classe
	private JTextField txtidTurma = null;
	private JComboBox<String> cboDisciplina = null;
	private JComboBox<String> cboProfessor = null;
	private JTextField txtLetra = null;

	// construtor cheio

	public ControladorGravar(JTextField txtidTurma, JComboBox<String> cboDisciplina, JComboBox<String> cboProfessor,
			JTextField txtLetra) {
		super();
		this.txtidTurma = txtidTurma;
		this.cboDisciplina = cboDisciplina;
		this.cboProfessor = cboProfessor;
		this.txtLetra = txtLetra;
	}

// modelo implementado de interface
	public void actionPerformed(ActionEvent e) {

		// critica de dados
		if (cboDisciplina.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo Disciplina Obrigatório");
			return;
		}
		if (cboProfessor.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo Professor Obrigatório");
			return;
		}
		if (txtLetra.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo Letra Obrigatório");
			return;
		}
		Turma objTurma = new Turma();

		objTurma.setidTurma(txtidTurma.getText());
		objTurma.setObjDisciplina(new Disciplina(cboDisciplina.getSelectedIndex(), ""));
		objTurma.setObjProfessor(new Professor(cboProfessor.getSelectedIndex(), "", ""));
		objTurma.setLetra(txtLetra.getText());

		try {
			objTurma.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}

}
