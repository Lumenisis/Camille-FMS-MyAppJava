package fr.cam.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import fr.cam.dao.BddConnection;

/**
 * @author Camille - 2023
 *
 */

public class BddConnection {
	private static Connection connection;
	private static String driver;
	private static String url;
	private static String login;
	private static String password;

	private BddConnection() {
		try { 
			getConfigFile();
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url,login,password);
			}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println("Connection problem" + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println("First generate the configuration file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if(connection == null) new BddConnection();
		return connection;
	}

	private static void getConfigFile() throws FileNotFoundException, IOException {
		Properties props = new Properties();		
		try (FileInputStream fis = new FileInputStream("files/config.properties")) {
			props.load(fis);
		} catch (FileNotFoundException e1) {
			System.out.println("File not found" + e1.getMessage());
		} catch (IOException e1) {
			System.out.println("Can't read the file" + e1.getMessage());
		}		
		driver = props.getProperty("db.driver");
		url = props.getProperty("db.url");
		login = props.getProperty("db.login");
		password = props.getProperty("db.password");
	}
}