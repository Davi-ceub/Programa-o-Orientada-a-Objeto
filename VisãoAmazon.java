package apresentação;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import negócio.Compra;
import negócio.Produto;
import negócio.Tipo;
public class VisãoAmazon {
   public static void main(String[] args) {
	  // Declaração de váriaveis
	   BufferedReader leitor = new BufferedReader(
			                   new InputStreamReader(System.in));
	   Compra objCompra = new Compra();
	   Produto objProduto = new Produto();
	   
	   // Entrada de dados
	   try {
	System.out.print("informe o nome do produto: ");
	objProduto.setNome(leitor.readLine());  // ler a string
	
	System.out.print("informe o tipo do produto: ");
	objProduto.setObjTipo(new Tipo(leitor.readLine()));  // ler a string e criar um novo tipo
	
	System.out.print("informe o preço do produto: ");
	objProduto.setPreco(Double.parseDouble(leitor.readLine())); // ler o texto e converter para fracionario // parse --> converte(int,double,char,etc) 
	// colocar o objproduto dentro do objCompra
	objCompra.setObjProduto(objProduto);
	
	System.out.print("informe a quantidade de produtos: ");
	objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
	
	System.out.print("informe a data: ");
	objCompra.setData(leitor.readLine());
	
	System.out.print("informe o número do cartão da compra: ");
	objCompra.setCartao(leitor.readLine());
   }catch(Exception erro) {
	   System.out.println("Ferrou" + erro);
   }
	  
	   // saída de dados
  System.out.println("Produto: " + objCompra.getObjProduto().getNome());
  System.out.println("Tipo: " + objCompra.getObjProduto().getObjTipo().getDescricao());
  System.out.println("Data: " + objCompra.getData());
  System.out.println("Valor total: R$" + objCompra.getQuantidade() * objCompra.getObjProduto().getPreco());
}
}

