package br.com.agenda.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.agenda.model.Pessoa;

public class PessoaTest {

	@Test
	public void testPessoa() {
		
		Pessoa pessoa = new Pessoa();
		Assert.assertEquals(pessoa, pessoa);
		
		pessoa.setId((long) 1);
		Long l = (long)1;
		Assert.assertEquals(l, pessoa.getId());
		
		
		pessoa.setNome("Peres Juliao");
		Assert.assertEquals("Peres Juliao", pessoa.getNome());
		
		pessoa.setEmail("peres@email.com");
		Assert.assertEquals("peres@email.com", pessoa.getEmail());
		
		pessoa.setFone("34 32283778");
		Assert.assertEquals("34 32283778", pessoa.getFone());	
		
	}

}
