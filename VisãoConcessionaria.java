package apresentação;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negócio.Carro;
import negócio.Fabricante;
import negócio.Moto;
import negócio.Veiculo;

public class VisãoConcessionaria {
	public static void main(String[] args) {
// definição das váriaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Veiculo objVeiculo = null;
		String opcao = "";

		// Entrada de dados

		try {
			System.out.print("Digite <C> para carro ou <M> para moto: ");
			opcao = leitor.readLine();

			if (opcao.equalsIgnoreCase("C")) {
				objVeiculo = new Carro();
			} else {
				objVeiculo = new Moto();
			}
			System.out.print("Digite o modelo do veiculo: ");
			objVeiculo.setModelo(leitor.readLine());
			System.out.print("Digite o fabricante: ");
			objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
			System.out.print("Digite a cor: ");
			objVeiculo.setCor(leitor.readLine());
			
			if(opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite <S> se houver teto solar: ");
				((Carro)objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("S"));
			}else {
			System.out.print("Digite a cilindrada: ");
			((Moto)objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
			
			}

		} catch (Exception erro) {
			System.out.println("Erro" + erro);
		}
		// Saida de dados
		System.out.println("Modelo: "+ objVeiculo.getModelo());
		System.out.println("Fabricante: "+ objVeiculo.getObjFabricante().getNome());
		System.out.println("Cor: "+ objVeiculo.getCor());
		if(opcao.equalsIgnoreCase("C")) {
		System.out.println("TetoSolar: "+ (((Carro) objVeiculo).isTetoSolar()? "SIM" : "NÃO"));
		}else {
		System.out.println("Cilindrada: "+ ((Moto) objVeiculo).getCilindrada());
		}
	}

	
	}

