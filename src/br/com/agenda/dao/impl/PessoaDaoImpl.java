package br.com.agenda.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.connection.ConnectionFactory;
import br.com.agenda.dao.DaoGenerico;
import br.com.agenda.model.Pessoa;

public class PessoaDaoImpl implements DaoGenerico<Pessoa> {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private List<Pessoa> pessoas;

	public PessoaDaoImpl() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}

	@Override
	public Pessoa inserir(Pessoa pessoa) throws SQLException {

		try {

			String sql = "INSERT INTO PESSOA (NOME, EMAIL, FONE) VALUES(?, ?, ?)";

			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, pessoa.getNome());
			preparedStatement.setString(2, pessoa.getEmail());
			preparedStatement.setString(3, pessoa.getFone());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}

		return pessoa;

	}

	@Override
	public Pessoa obter(Long id) throws SQLException {

		Pessoa pessoa = null;

		try {

			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM pessoa WHERE id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				
				pessoa = new Pessoa();
				pessoa.setId(resultSet.getLong("id"));
				pessoa.setNome(resultSet.getString("nome"));
				pessoa.setEmail(resultSet.getString("email"));
				pessoa.setFone(resultSet.getString("fone"));

			}

			resultSet.close();

		} catch (Exception e) {
			
			throw new RuntimeException("Erro ao inserir contato.", e);

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}

		return pessoa;
	}
	
	@Override
	public List<Pessoa> listar() throws SQLException {
		
		pessoas = new ArrayList<Pessoa>();
  
		try {
			
			String sql = "SELECT * FROM pessoa";
			
			preparedStatement = connection.prepareStatement(sql);
		    resultSet = preparedStatement.executeQuery();
		
		    while (resultSet.next()) {
		    	
		    	Pessoa pessoa = new Pessoa();
		    	pessoa.setId(resultSet.getLong("id"));
		    	pessoa.setNome(resultSet.getString("nome"));
		    	pessoa.setEmail(resultSet.getString("email"));
		    	pessoa.setFone(resultSet.getString("fone"));
		    	pessoas.add(pessoa);
		    
		    }
		
		    resultSet.close();
		    
	  } catch (Exception e) {
	    
		  throw new RuntimeException("Erro ao listar pessoas.", e);
		  
	  } finally {
		  
		  if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}	    
		  
	  }
	
	  return pessoas;
	  
	}

	@Override
	public List<Pessoa> buscar(String nome) throws SQLException {

		  List<Pessoa> pessoas = new ArrayList<Pessoa>();
		  
		  try {
			  connection = ConnectionFactory.getConnection();

			  String sql = "SELECT * FROM pessoa WHERE nome LIKE ?";
	
			  preparedStatement = connection.prepareStatement(sql);
			  preparedStatement.setString(1, "%" + nome + "%");
	     	  
			  resultSet = preparedStatement.executeQuery();
	
			  while (resultSet.next()) {
				  
				  Pessoa pessoa = new Pessoa();
				  pessoa.setId(resultSet.getLong("id"));
				  pessoa.setNome(resultSet.getString("nome"));
				  pessoa.setEmail(resultSet.getString("email"));
				  pessoa.setFone(resultSet.getString("fone"));
				  pessoas.add(pessoa);

			  }

			  resultSet.close();

		  } catch (Exception e) {
			  throw new RuntimeException("Erro ao listar contatos.", e);

		  } finally {

			  if (preparedStatement != null) {
				  preparedStatement.close();
			  }

			  if (connection != null) {
				  connection.close();
			  }	    

		  }

		  return pessoas;
		  
	}

	@Override
	public void alterar(Pessoa pessoa) throws SQLException {

		try {
			
			connection = ConnectionFactory.getConnection();

			String sql = "UPDATE pessoa SET nome = ?, email = ?, fone = ? WHERE id = ?";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, pessoa.getNome());
			preparedStatement.setString(2, pessoa.getEmail());
			preparedStatement.setString(3, pessoa.getFone());
			preparedStatement.setLong(4, pessoa.getId());
			preparedStatement.executeUpdate();
		
		} catch (Exception e) {
			throw new RuntimeException("Erro ao atualizar pessoa.", e);
		
		} finally {
		
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}	    
			
		}
		
	}

	@Override
	public void excluir(Pessoa pessoa) throws SQLException {
		
		try {
			connection = ConnectionFactory.getConnection();

			String sql = "DELETE FROM pessoa WHERE id = ?";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, pessoa.getId());

			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao excluir pessoa.", e);
		
		} finally {
			
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}	    
		}
		
	}
}
	
	

