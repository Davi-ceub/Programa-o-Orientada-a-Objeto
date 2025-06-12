package Persistência;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import Negócio.Cargo;
import Negócio.Colaborador;

public class ColaboradorDAO {
	// propriedadesda classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	// métodos da classe
	public Collection<Colaborador> getTodos() throws Exception {
		ArrayList<Colaborador> colecao = new ArrayList<Colaborador>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement(
				"SELECT Colaborador.nome as nomeColaborador,Cargo.nome as nomeCargo, Cargo.idCargo, idColaborador, salario "
						+ "FROM CARGO, COLABORADOR " + "WHERE Cargo.IDCARGO = Colaborador.IDCARGO");

		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			colecao.add(new Colaborador(
					objCursor.getInt("idColaborador"), new Cargo(objCursor.getInt("idCargo"),
							objCursor.getString("NomeCargo"), objCursor.getDouble("Salario")),
					objCursor.getString("NomeColaborador")));
		}
		objBanco.desconectar();

		return colecao;
	}

	public void persistir(Colaborador objColaborador) throws Exception {
		objBanco.conectar();

		objExecucao = objBanco.getObjConexao()
				.prepareStatement("INSERT INTO COLABORADOR" + "(idCargo,Nome) " + "VALUES " + "(?, ?)");
		objExecucao.setInt(1, objColaborador.getObjCargo().getIdCargo());
		objExecucao.setString(2, objColaborador.getNome());

		objExecucao.executeUpdate();

		objBanco.desconectar();
	}
}
