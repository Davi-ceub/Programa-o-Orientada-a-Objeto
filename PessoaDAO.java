package Persistência;

import java.sql.PreparedStatement;

import Negócio.Pessoa;

public class PessoaDAO {
// propriedade da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;

// métodos da classe
	public void persistir(Pessoa objPessoa) throws Exception {

		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO pessoa " + 
		"(Nome, Endereco, Telefone)" + "VALUES " + "(?, ?, ?)"); 
		objExecucao.setString(1, objPessoa.getNome());
		objExecucao.setString(2, objPessoa.getEndereco());
		objExecucao.setString(3, objPessoa.getTelefone());
		
		objExecucao.executeUpdate();
		
		
		objBanco.desconectar();
	}
}
