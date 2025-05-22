package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
// propriedades da classe
	private JTextField txtTitulo = null;
	private JComboBox<String> cboAutor = null;

	// construtor cheio
	public ControladorLimpar(JTextField txtTitulo, JComboBox<String> cboAutor) {
		super();
		this.txtTitulo = txtTitulo;
		this.cboAutor = cboAutor;
	}

	// método implementado da interface
	public void actionPerformed(ActionEvent e) {
		txtTitulo.setText("");
		cboAutor.setSelectedIndex(0);
	}
}
