package com.ecodeup.articulos.model;

import java.sql.SQLException;


 
public class ArticuloDAO {
	private Conexion con;
	
	public ArticuloDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {

		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
		con.conectar();
		
		System.out.println(con.getJdbcConnection());		
	}
}