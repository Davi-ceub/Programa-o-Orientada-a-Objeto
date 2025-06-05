package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
// propriedades da classe
	private JComboBox<String> cboidProduto = null;
	private JComboBox<String> cboidCliente = null;
	private JTextField txtData = null;
	private JTextField txtQuantidade = null;

	// construtor cheio
	public ControladorLimpar(JComboBox<String> cboidProduto, JComboBox<String> cboidCliente, JTextField txtData,
			JTextField txtQuantidade) {
		super();
		this.cboidProduto = cboidProduto;
		this.cboidCliente = cboidCliente;
		this.txtData = txtData;
		this.txtQuantidade = txtQuantidade;

	}

// método implementado da interface
	public void actionPerformed(ActionEvent e) {
		cboidProduto.setSelectedIndex(0);
		cboidCliente.setSelectedIndex(0);
		txtData.setText("");
		txtQuantidade.setText("");
	}

}
