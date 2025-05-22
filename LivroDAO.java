package Persistência;

import java.sql.PreparedStatement;

import Negócio.Livro;

public class LivroDAO {
// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;

	// métodos da classe
	public void persistir(Livro objLivro) throws Exception {
		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO LIVRO" + "(Titulo, idAutor) " + "VALUES " + "(?, ?)");
		objExecucao.setString(1, objLivro.getTitulo());
		objExecucao.setInt(2, objLivro.getObjAutor().getId());

		objExecucao.executeUpdate();

		objBanco.desconectar();
	}
}
