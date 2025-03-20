package negócio;

public class Aluno {
// propriedades de acesso da classe
 private String nome = "";
 private int matricula = 0;
 // métodos construtores da classe
public Aluno() {
	super();
}
public Aluno(String nome, int matricula) {
	super();
	this.nome = nome;
	this.matricula = matricula;
}
// métodos de acesso da classe 
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getMatricula() {
	return matricula;
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}
}
