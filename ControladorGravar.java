package apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negócio.Fabricante;
import negócio.Veículo;

public class ControladorGravar implements ActionListener {
// propriedades da classe
	private JComboBox<String> cboFabricante = null;
	private JTextField txtModelo = null;
	private JComboBox<String> cboCor = null;
	private JCheckBox chkTetoSolar = null;

// construtor cheio
	public ControladorGravar(JComboBox<String> cboFabricante, JTextField txtModelo, JComboBox<String> cboCor,
			JCheckBox chkTetoSolar) {
		super();
		this.cboFabricante = cboFabricante;
		this.txtModelo = txtModelo;
		this.cboCor = cboCor;
		this.chkTetoSolar = chkTetoSolar;
	}

// modelo implementado da interface
	public void actionPerformed(ActionEvent e) {
		// critica de dados
		if (cboFabricante.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo Fabricante obrigatório !");
			return;
		}
		if (txtModelo.getText().equals("")) {
			JOptionPane.showMessageDialog(null, " Campo Modelo obrigatório !");
			return;
		}
		if (cboCor.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo Cor obrigatório !");
			return;
		}
		// composição do objeto
		Veículo objVeiculo = new Veículo();
		objVeiculo.setObjFabricante(new Fabricante(cboFabricante.getSelectedItem().toString()));
		objVeiculo.setModelo(txtModelo.getText());
		objVeiculo.setCor(cboCor.getSelectedItem().toString());
		objVeiculo.setTetoSolar(chkTetoSolar.isSelected());

		JOptionPane.showMessageDialog(null,
				"Gravação realizada com sucesso !\n\n" + "Fabricante: " + objVeiculo.getObjFabricante().getNome() + "\n"
						+ "Modelo: " + objVeiculo.getModelo() + "\n" + "Cor: " + objVeiculo.getCor() + "\n"
						+ "Teto Solar: " + (objVeiculo.isTetoSolar() ? "SIM" : "NÃO"));
	}

}
