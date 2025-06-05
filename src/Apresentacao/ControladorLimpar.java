package Apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
// propriedades da classe
	private JTextField txtidTurma = null;
	private JComboBox<String> cboDisciplina = null;
	private JComboBox<String> cboProfessor = null;
	private JTextField txtLetra = null;

	// construtor cheio
	public ControladorLimpar(JTextField txtidTurma, JComboBox<String> cboDisciplina, JComboBox<String> cboProfessor,
			JTextField txtLetra) {
		super();
		this.txtidTurma = txtidTurma;
		this.cboDisciplina = cboDisciplina;
		this.cboProfessor = cboProfessor;
		this.txtLetra = txtLetra;
	}

// método implementado da interface
	public void actionPerformed(ActionEvent e) {
		txtidTurma.setText("");
		cboDisciplina.setSelectedIndex(0);
		cboProfessor.setSelectedIndex(0);
		txtLetra.setText("");
	}

}
