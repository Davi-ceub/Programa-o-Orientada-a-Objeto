package apresentação;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import negócio.Cilindro;
import negócio.Cubo;
import negócio.Solido;

public class VisãoGeometria {
	public static void main(String[] args) {
		// declaração das váriaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Solido objSolido = null;
		int opcao = 0;

		// entrada de dados
		try {
			System.out.print("Digite <1> para cubo ou <2> para cilindro: ");
			opcao = Integer.parseInt(leitor.readLine());

			if (opcao == 1) {
				objSolido = new Cubo();
				System.out.print("Digite a aresta: ");
				((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
			} else {
				objSolido = new Cilindro();
				System.out.print("Digite o raio: ");
				((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));
				System.out.print("Digite a altura: ");
				((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		// Saida de dados
		System.out.println("Area: " + objSolido.CalcularArea());
		System.out.println("Volume: " + objSolido.CalcularVolume());
	}

}
