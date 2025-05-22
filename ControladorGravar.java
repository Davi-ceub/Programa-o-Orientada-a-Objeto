package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negócio.Autor;
import Negócio.Livro;

public class ControladorGravar implements ActionListener {
	// propriedades da classe
	private JTextField txtTitulo = null;
	private JComboBox<String> cboAutor = null;

	// construtor cheio

	public ControladorGravar(JTextField txtTitulo, JComboBox<String> cboAutor) {
		super();
		this.txtTitulo = txtTitulo;
		this.cboAutor = cboAutor;
	}

// modelo implementado da interface
	public void actionPerformed(ActionEvent e) {
		Livro objLivro = new Livro();

		objLivro.setTitulo(txtTitulo.getText());
		objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(), ""));

		try {
			objLivro.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}

}
