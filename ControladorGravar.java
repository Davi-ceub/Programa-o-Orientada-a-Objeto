package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Negócio.Produto;
import Negócio.Tipo;

public class ControladorGravar implements ActionListener{
	// propriedades da classe
	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> cboTipo = null;
	private JCheckBox chkPerecivel = null;
	private JTextArea txtDetalhamento = null;
	
	
	// construtor cheio
	public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo, JCheckBox chkPerecivel,
			JTextArea txtDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.cboTipo = cboTipo;
		this.chkPerecivel = chkPerecivel;
		this.txtDetalhamento = txtDetalhamento;
	}
  // método implementado da interface
	public void actionPerformed(ActionEvent e) {
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo Nome Obrigatório");
			return;
		}
		if (txtPreco.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"Campo preço Obrigatório");
			return;
		}
		try {
			Double.parseDouble(txtPreco.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"Campo preço deve ser numérico");
			return;
		}
		if (cboTipo.getSelectedIndex() == 0 ) {
			JOptionPane.showMessageDialog(null,"Campo tipo obrigatório");
			return;
		}
			
		// composição do objeto
		Produto objProduto = new Produto();
		objProduto.setNome(txtNome.getText());
		objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
		objProduto.setObjTipo(new Tipo(cboTipo.getSelectedItem().toString()));
		objProduto.setPerecivel(chkPerecivel.isSelected());
		objProduto.setDetalhamento(txtDetalhamento.getText());
		
		objProduto.getObjTipo();
		JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso \n\n" + "nome: " + objProduto.getNome() + "\n" +
		"Preço: " + objProduto.getPreco());
	}
}
