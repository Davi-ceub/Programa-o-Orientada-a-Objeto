package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import negocio.Livro;
import negocio.Autor;

public class VisaoLivraria {
	public static void main(String[] args) {
		// Declaração de variáveis
	  BufferedReader leitor = new BufferedReader (
			                  new InputStreamReader (
			                  System.in));
	  Livro objLivro = new Livro();
	  
	  // Entrada de dados
	  try {
		  System.out.print("Digite o título do livro: ");
		  objLivro.setTitulo(leitor.readLine());
		  System.out.print("Digite o nome do autor do livro: ");
		  objLivro.setObjAutor(new Autor(leitor.readLine()));
		  System.out.print("Digite o genero do livro: ");
		  objLivro.setgenero(leitor.readLine());
		  
	  } catch (Exception erro) {}
	  
	 // Saída de dados 
	  System.out.println("Título: "+ objLivro.gettitulo());
	  System.out.println("Autor: "+ objLivro.getobjAutor().getnome());
	  System.out.println("Genero: "+ objLivro.getgenero());
	}

}
