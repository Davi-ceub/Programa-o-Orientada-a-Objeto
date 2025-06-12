package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negócio.Cargo;
import Negócio.Colaborador;

public class ControladorGravar implements ActionListener {
// propriedades da classe
	private JComboBox<String> cboidCargo = null;
	private JTextField txtNome = null;

	// construtor cheio
	public ControladorGravar(JComboBox<String> cboidCargo, JTextField txtNome) {
		super();
		this.cboidCargo = cboidCargo;
		this.txtNome = txtNome;
	}

// modelo implementado de interface
	public void actionPerformed(ActionEvent e) {
		// critica de dados
		if (cboidCargo.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo idCargo Obrigatório");
			return;
		}
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo Nome Obrigatório");
			return;
		}
		try {
			Colaborador objColaborador = new Colaborador();

			objColaborador.setObjCargo(new Cargo(cboidCargo.getSelectedIndex(), "", 0));
			objColaborador.setNome(txtNome.getText());

			objColaborador.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}

}
