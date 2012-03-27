package br.com.agenda.teste;

import java.sql.SQLException;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.com.agenda.dao.impl.PessoaDaoImpl;
import br.com.agenda.model.Pessoa;

public class PessoaDaoImplTest {

//	@Test
//	public void testInserir() throws SQLException  {
//		Pessoa pessoa = new Pessoa();
//		pessoa.setNome("Rafaella Maiorki");
//		pessoa.setEmail("rafa@email.com");
//		pessoa.setFone("34 32589632");
//				
//		PessoaDaoImpl dao = new PessoaDaoImpl();
//		
//		Pessoa p = dao.inserir(pessoa);
//		Assert.assertEquals(pessoa, p);	
//		
//	}
	
//	@Test
//	public void testObter() throws SQLException {
//		
//		Long id = (long) 1;
//		PessoaDaoImpl dao = new PessoaDaoImpl();
//		Pessoa pessoa = dao.obter(id);
//		Assert.assertEquals("Peres Juliao", pessoa.getNome());
//		
//		System.out.println(pessoa.getFone());
//		
//	}

//	@Test
//	public void testListar() throws SQLException {
//		
//		PessoaDaoImpl dao = new PessoaDaoImpl();
//		
//		List<Pessoa> pessoas = dao.listar();
//		Assert.assertEquals(pessoas, pessoas);
//		
//		for (Pessoa pessoa : pessoas) {
//			System.out.println("Nome: " + pessoa.getNome());
//		}
//	}
	
//	@Test
//	public void testBuscar() throws SQLException {
//		
//		PessoaDaoImpl dao = new PessoaDaoImpl();
//		
//		List<Pessoa> pessoas = dao.buscar("Isabella");
//		Assert.assertEquals(pessoas, pessoas);
//		
//		for (Pessoa pessoa : pessoas) {
//			System.out.println("Nome: " + pessoa.getNome());
//		}
//	}

//	@Test
//	public void testAlterar() throws SQLException {
//		
//		PessoaDaoImpl dao = new PessoaDaoImpl();
//		
//		List<Pessoa> pessoas = dao.listar();
//		Assert.assertEquals(pessoas, pessoas);
//		Pessoa alterar = new Pessoa();
//		
//
//		
//		
//		
//		for (Pessoa pessoa : pessoas) {
//			System.out.println("Nome: " + pessoa.getNome());
//			if (pessoa.getId() == 3) {
//				alterar = pessoa;
//			}
//		}
////		alterar.setNome("Marcela de Lima Rodrigues");
////		dao.alterar(alterar);
//}
	
//	@Test
//	public void testExcluir() throws SQLException {
//		
//		PessoaDaoImpl dao = new PessoaDaoImpl();
//		
//		List<Pessoa> pessoas = dao.buscar("Rafaella");
//		Assert.assertEquals(pessoas, pessoas);
//		
//		Pessoa p = pessoas.get(0);
//		
//		dao.excluir(p);
//		
//	}

}
