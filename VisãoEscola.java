package apresentação;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import negócio.Aluno;
import negócio.Cadeira;
import negócio.Professor;
import negócio.Turma;

public class VisãoEscola {
	public static void main(String[] args) {
		// declaração de váriaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();

		// Entrada de dados

		try {
			// PROFESSOR
			System.out.print("digite o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(leitor.readLine()));
			System.out.print("digite o nome do professor: ");
			objProfessor.setNome(leitor.readLine());
			System.out.print("digite a titulação do professor: ");
			objProfessor.setTitulo(leitor.readLine());
			System.out.print("digite o sálario do professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));
			// Aluno
			do {
				Aluno objAluno = new Aluno();
				System.out.print("digite a matricula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
				System.out.print("digite o nome do aluno: ");
				objAluno.setNome(leitor.readLine());
				objTurma.adicionarAluno(objAluno);
				System.out.print("digite <S> se houber mais alunos: ");
			} while (leitor.readLine().equalsIgnoreCase("S"));
			objTurma.setObjProfessor(objProfessor);
		} catch (Exception erro) {
			System.out.println("Ferrou" + erro);
		}
// Saida de dados
		System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
		System.out.println("Professor: " + objTurma.getObjProfessor().getTitulo() + "\t" + objTurma.getObjProfessor().getNome());
		System.out.println("Alunos: ");
		objTurma.listarAlunos();
	}
}
