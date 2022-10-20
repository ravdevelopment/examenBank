package com.curso.RRHH.BBDD.JDBC;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

public class EjemploUsoAPIJDBC {

	public static void main(String[] args) {
		// 1. Cargar Driver JDBC Oracle 18c

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("cargó ok");
		} catch (ClassNotFoundException e) {
			System.out.println("No cargó driver");
			e.printStackTrace();
			return;
		}

		// 2. Crear una conexión a la BD

		String url = "jdbc:oracle:thin:@localhost:49161:xe";
		String usr = "SYSTEM";
		String clave = "oracle";

		try (Connection con = DriverManager.getConnection(url, usr, clave)) {
			Statement st = con.createStatement();
			// 3.1. lanzar la consulta
			ResultSet rs = st.executeQuery("SELECT * FROM hr.COUNTRIES");
			// 3.2 recorrer el resultado de la consulta
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			System.out.println("conectó ok");
		} catch (SQLException e) {
			System.out.println("Error conexión " + e.getMessage());
			e.printStackTrace();
		}

		// 2. hacer una select
		// 3. hacer un insert
	}
}
