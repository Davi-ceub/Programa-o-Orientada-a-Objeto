package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// propriedades da classe
	private JComboBox<String> cboidCargo = null;
	private JTextField txtNome = null;
	private JTextArea txtFolha = null;

	// construtor cheio

	public ControladorLimpar(JComboBox<String> cboidCargo, JTextField txtNome, JTextArea txtFolha) {
		super();
		this.cboidCargo = cboidCargo;
		this.txtNome = txtNome;
		this.txtFolha = txtFolha;
	}

// método implementado da interface
	public void actionPerformed(ActionEvent e) {
		cboidCargo.setSelectedIndex(0);
		txtNome.setText("");
		txtFolha.setText("");

	}

}
