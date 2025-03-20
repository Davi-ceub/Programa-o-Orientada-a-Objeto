package Apresentação;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negócio.Aguia;
import Negócio.Animal;
import Negócio.Ave;
import Negócio.Cachorro;
import Negócio.Leopardo;
import Negócio.Mamifero;

public class VisãoZoológico {
	public static void main(String[] args) {
		// definição das variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

		Animal objAnimal = null;
		String opcao = "";

		// entrada de dados
		try {
			System.out.print("Digite <C> para cachorro, <L> para leopardo, <A> para aguia: ");
			opcao = leitor.readLine();
			if (opcao.equalsIgnoreCase("C")) {
				objAnimal = new Cachorro();
			} else if (opcao.equalsIgnoreCase("L")) {
				objAnimal = new Leopardo();
			} else {
				objAnimal = new Aguia();
			}
			System.out.print("Digite o nome do animal: ");
			objAnimal.setNome(leitor.readLine());
			System.out.print("Digite a altura: ");
			objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
			System.out.print("Digite o peso: ");
			objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			if (opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite os litros de leite: ");
				((Mamifero) objAnimal).setLitrosleite(Integer.parseInt(leitor.readLine()));
				System.out.print("Digite a forca da mordida: ");
				((Cachorro) objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));
			} else if (opcao.equalsIgnoreCase("L")) {
				System.out.print("Digite a quantidade de litros: ");
				((Mamifero) objAnimal).setLitrosleite(Integer.parseInt(leitor.readLine()));
				System.out.print("Digite a velocidade: ");
				((Leopardo) objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
			} else {
				System.out.print("Digite a quantidade de ovos: ");
				((Ave) objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));
				System.out.print("Digite a autonomia: ");
				((Aguia) objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {
			System.out.println("Erro");
		}
		// Saida de dados
		System.out.println("Nome: " + objAnimal.getNome());
		System.out.println("IMC: " + objAnimal.calcularIMC());
		if (opcao.equalsIgnoreCase("C")) {
			((Cachorro) objAnimal).morder();
		} else if (opcao.equalsIgnoreCase("L")) {
			((Leopardo) objAnimal).correr();
		} else {
			((Aguia) objAnimal).voar();
		}
		System.out.println("Altura: " + objAnimal.getAltura());
		System.out.println("Peso: " + objAnimal.getPeso());

	}
}
