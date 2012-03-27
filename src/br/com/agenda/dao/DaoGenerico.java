package br.com.agenda.dao;

import java.sql.SQLException;
import java.util.List;

public interface DaoGenerico<T> {
	
	public T inserir(T objeto) throws SQLException;
	
	public T obter(Long id) throws SQLException;;
	
	public List<T> listar() throws SQLException;
	
	public List<T> buscar(String nome) throws SQLException;
	
	public void alterar(T objeto) throws SQLException; 	
	
	public void excluir(T objeto) throws SQLException;
	
}
