package negocio;

public class Livro {
	// Propriedades da classe
	private String titulo = "";
	private Autor objAutor = null;
	private String genero = "";
   
	// Métodos construtores da classe
	 public Livro() {
		 
	 }
	 
	 public Livro(String titulo, Autor objAutor, String genero) {
		 this.titulo = titulo;
		 this.objAutor = objAutor;
		 this.genero = genero;
		 
	 }
	 
	 // Métodos de acesso da classe
	 
	 public String gettitulo() {
		 return titulo;
	 }
	 
	 public void setTitulo(String titulo) {
		 this.titulo = titulo;
	 }
	 
	 public Autor getobjAutor() {
		 return objAutor;
		
	 }
	 public void setObjAutor(Autor objAutor) {
		 this.objAutor = objAutor;
	 }
	 
	 public String getgenero() {
		 return genero;
	 }
	 
	 public void setgenero(String genero) {
		 this.genero = genero;
	 }
}
