package Persistência;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import Negócio.Produto;

public class ProdutoDAO {
	// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	// métodos da classe
	public Collection<Produto> getTodos() throws Exception {
		ArrayList<Produto> colecao = new ArrayList<Produto>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRODUTO");
		objCursor = objExecucao.executeQuery();

		while (objCursor.next()) { // while vai buscar todas as linhas da tabela
			colecao.add(new Produto(objCursor.getInt("idProduto"), objCursor.getString("Nome"),
					objCursor.getDouble("Preco")));
		}
		objBanco.desconectar();

		return colecao;
	}
}
