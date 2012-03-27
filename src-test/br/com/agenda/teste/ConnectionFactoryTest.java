package br.com.agenda.teste;

import java.sql.Connection;
import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.Test;

import br.com.agenda.connection.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test(expected = SQLException.class)
	public void testGetConnection() throws SQLException {
	
		Connection conn = ConnectionFactory.getConnection();
		Assert.assertNotNull(conn);
		
	}

}
