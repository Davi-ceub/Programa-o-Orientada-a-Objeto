package Apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener{
	// propriedades da classe
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	// NÃO HÁ CONSTRUTOR DE CLASSE VAZIO PARA CONTROLES A NÃO SER PARA O BOTÃO SAIR
	// método construtor cheio da classe
   public ControladorLimpar(JTextField txtNome, JRadioButton optMasculino, JTextField endereco,
			JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = endereco;
		this.cboUf = cboUf;
	}

// método implementado da interface
public void actionPerformed(ActionEvent e) {
	   txtNome.setText("");
	   optMasculino.setSelected(true);
	   txtEndereco.setText("");
	   cboUf.setSelectedIndex(0);
   }
}
