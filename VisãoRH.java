package apresentação;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negócio.Colaborador;
import negócio.Gerente;

public class VisãoRH {
	public static void main(String[] args) {
		// Declaração de váriaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = null;
		String opcao = "";

		// Entrada de dados
		try {
			System.out.print("Digite <C> para colaborador ou " + "<G> para gerente: ");
			opcao = leitor.readLine();
			if (opcao.equalsIgnoreCase("C")) {
				objColaborador = new Colaborador();
			} else {
				objColaborador = new Gerente(); // --> polimorfismo, pegou o objeto colaborador e transformou em gerente
			}
			System.out.print("Digite a matricula: ");
			objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));
			System.out.print("Digite o nome: ");
			objColaborador.setNome(leitor.readLine());
			System.out.print("Digite o salario: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
			if (!opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite o bonus: ");
				((Gerente) objColaborador).setBonus(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {
			System.out.println("Erro");
		}
		// Saida de dados
		System.out.println("Matricula: " + objColaborador.getMatricula());
		System.out.println("Nome: " + objColaborador.getNome());
		System.out.println("Salario: " + objColaborador.getSalario());

	}
}
