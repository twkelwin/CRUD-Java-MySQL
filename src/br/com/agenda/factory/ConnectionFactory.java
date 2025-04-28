package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME = "root";

	private static final String PASSWORD = "";

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3307/agenda";

	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws Exception {
		// recuperar uma conexão com banco de dados
		Connection con = createConnectionToMySQL();

		// testar se a conexão é nula
		if (con != null)
			System.out.println("Conexão obtida com sucesso!");
		con.close();
	}
}
