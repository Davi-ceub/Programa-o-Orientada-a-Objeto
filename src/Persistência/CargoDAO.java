package Persistência;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import Negócio.Cargo;

public class CargoDAO {
	// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	// métodos da classe
	public Collection<Cargo> getTodos() throws Exception {
		ArrayList<Cargo> colecao = new ArrayList<Cargo>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CARGO");
		objCursor = objExecucao.executeQuery();

		while (objCursor.next()) { // while vai buscar todas as linhas da tabela
			colecao.add(new Cargo(objCursor.getInt("idCargo"), objCursor.getString("Nome"),
					objCursor.getDouble("Salario")));
		}
		objBanco.desconectar();

		return colecao;
	}
}
