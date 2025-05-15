package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negócio.Pessoa;

public class ControladorGravar implements ActionListener {
	// propriedades da classe
	private JTextField txtNome = null;
	private JTextField txtEndereco = null;
	private JTextField txtTelefone = null;

	// construtor cheio
	public ControladorGravar(JTextField txtNome, JTextField txtEndereco, JTextField txtTelefone) {
		super();
		this.txtNome = txtNome;
		this.txtEndereco = txtEndereco;
		this.txtTelefone = txtTelefone;
	}
	// modelo implementado da interface
	public void actionPerformed(ActionEvent e) {
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setTelefone(txtTelefone.getText());

		try {
			objPessoa.persistir();
			JOptionPane.showMessageDialog(null, "Gravação Realizada com Sucesso");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}

	}

}
