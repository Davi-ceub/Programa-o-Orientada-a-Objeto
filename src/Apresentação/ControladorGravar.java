package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negócio.Cliente;
import Negócio.Compra;
import Negócio.Produto;

public class ControladorGravar implements ActionListener {
	// propriedades da classe
	private JComboBox<String> cboidProduto = null;
	private JComboBox<String> cboidCliente = null;
	private JTextField txtData = null;
	private JTextField txtQuantidade = null;

	// construtor cheio

	public ControladorGravar(JComboBox<String> cboidProduto, JComboBox<String> cboidCliente, JTextField txtData,
			JTextField txtQuantidade) {
		super();
		this.cboidProduto = cboidProduto;
		this.cboidCliente = cboidCliente;
		this.txtData = txtData;
		this.txtQuantidade = txtQuantidade;
	}

// modelo implementado de interface
	public void actionPerformed(ActionEvent e) {
		// critica de dados
		if (cboidProduto.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo idProduto Obrigatório");
			return;
		}
		if (cboidCliente.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo idCliente Obrigatório");
			return;
		}
		if (txtData.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo Data Obrigatório");
			return;
		}
		if (txtQuantidade.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo Quantidade Obrigatório");
			return;
		}
		Compra objCompra = new Compra();

		objCompra.setObjProduto(new Produto(cboidProduto.getSelectedIndex(), "", 0));
		objCompra.setObjCliente(new Cliente(cboidCliente.getSelectedIndex(), "", ""));
		objCompra.setData(txtData.getText());
		objCompra.setQuantidade(Integer.parseInt(txtQuantidade.getText()));

		try {
			objCompra.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}

}
