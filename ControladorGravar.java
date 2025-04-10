package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Negócio.Pessoa;
import Negócio.Uf;

public class ControladorGravar implements ActionListener {
	// propriedades da classe
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;

	// método construtor cheio da classe
	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco,
			JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}

	// método implementado da interface
	public void actionPerformed(ActionEvent e) {
		//composição do objeto
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setSexo(optMasculino.isSelected());
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		// Simulação da persistência
      JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso \n\n" + "nome: " + objPessoa.getNome() + "\n" + 
		"Sexo: " + (objPessoa.isSexo() ? "Masculino" : "Feminino") + "\n" + "Endereco: " + objPessoa.getEndereco()+ "\n" + 
        "Uf: " + objPessoa.getObjUf().getSigla());
	}
}
