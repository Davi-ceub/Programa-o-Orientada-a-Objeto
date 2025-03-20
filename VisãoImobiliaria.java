package apresentação;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negócio.Imovél;
import negócio.Novo;
import negócio.Usado;

public class VisãoImobiliaria {
	public static void main(String[] args) {

// declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovél objImovel = null;
		String opcao = "";

// Entrada de dados
		try {
			System.out.print("Digite <N> para novo ou <U> para usado: ");
			opcao = leitor.readLine();	if (opcao.equalsIgnoreCase("N")) {
				objImovel = new Novo();
			} else {
				objImovel = new Usado();
			}
			System.out.print("Digite o endereco: ");
			objImovel.setEndereco(leitor.readLine());
			System.out.print("Digite a metragem: ");
			objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			System.out.print("Digite o valor: ");
			objImovel.setValor(Double.parseDouble(leitor.readLine()));
			if(opcao.equalsIgnoreCase("N")) {
				System.out.print("Digite o adicional: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
			}else {
			System.out.print("Digite a depreciação: ");
			  ((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
			}
		
		} catch (Exception erro) {
			System.out.println("Erro" + erro);
		}
		// saida de dados
		System.out.println("Endereco: "+ objImovel.getEndereco());
		System.out.println("Metragem: "+ objImovel.getMetragem());
		System.out.println("Valor: "+ objImovel.getValor());
	}
}
