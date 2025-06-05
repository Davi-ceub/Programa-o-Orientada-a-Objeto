package Persistência;

import java.sql.PreparedStatement;

import Negócio.Compra;

public class CompraDAO {
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;

	// métodos da classe
	public void persistir(Compra objCompra) throws Exception {
		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement(
				"INSERT INTO COMPRA" + "(idProduto,idCliente,Data,Quantidade) " + "VALUES " + "(?, ?, ?, ?)");
		objExecucao.setInt(1, objCompra.getObjProduto().getIdProduto());
		objExecucao.setInt(2, objCompra.getObjCliente().getIdCliente());
		objExecucao.setString(3, objCompra.getDataParaBancoDeDados());
		objExecucao.setInt(4, objCompra.getQuantidade());

		objExecucao.executeUpdate();

		objBanco.desconectar();
	}
}
