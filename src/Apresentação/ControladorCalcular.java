package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Negócio.Colaborador;

public class ControladorCalcular implements ActionListener {
// propriedades da classe
	private JTextArea txtFolha = null;

	// método construtor cheio da classe
	public ControladorCalcular(JTextArea txtFolha) {
		super();
		this.txtFolha = txtFolha;
	}

	// método implementado da interface
	public void actionPerformed(ActionEvent e) {
		try {
			txtFolha.setText("Nome\tSalario Bruto\tDescontos\tSalário Liquido\n"
					+ "===================================================================\n");

			for (Colaborador objColaborador : Colaborador.getTodos()) {
				double descontos = 0;
				double salarioBruto = 0;
				double salarioLiquido = 0;

				salarioBruto = objColaborador.getObjCargo().getSalario();
				descontos = ((0.275 * salarioBruto) + (0.14 * salarioBruto));
				salarioLiquido = salarioBruto - descontos;

				txtFolha.append(objColaborador.getNome() + "\t" + salarioBruto + "\t" + descontos + "\t"
						+ salarioLiquido + "\n");
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}
}
