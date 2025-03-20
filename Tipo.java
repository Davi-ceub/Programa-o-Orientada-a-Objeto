package negócio;

public class Tipo {
   // propriedades da classe
	private String descricao = "";
// métodos construtores da classe
public Tipo() {
	super();
}
  
public Tipo(String descricao) {
	super();
	this.descricao = descricao;
}
// métodos de acesso da classe
public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

}
