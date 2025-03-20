package apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visao extends JFrame { // -> passo 1 extends JFrame
// propriedades da classe
	private static final long serialVersionUID = 1L; // identificador de janela, passo 2
	private JPanel objPainel = new Painel();
// passo 3 -> cadastrar os controles da tela

// método principal de execução de programa -> passo 4
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}

// método construtor da classe
	public Visao() {
		// configuração da janela -> titulo, tamanho, x e posição. passo 5
		setTitle("Minha primeira janela JAVA");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// configuração do painel
		setContentPane(objPainel);
	}
}