package br.com.alura.jdbc.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
		
	public ConnectionFactory() { //pool
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/loja_virtual");
		comboPooledDataSource.setUser("debian-sys-maint");
		comboPooledDataSource.setPassword("aDuM9juXcaGQna1v");
		
		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;
	}
	

	public Connection recuperarConexao( ) throws SQLException {  //conexao do pool
		return this.dataSource.getConnection();
	}
}
