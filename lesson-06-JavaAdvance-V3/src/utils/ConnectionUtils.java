package utils;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.xml.DOMConfigurator;

public class ConnectionUtils {
	static String URL = "jdbc:mysql://localhost/internet_magazine?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
	static String USER_NAME = "root";
	static String USER_PASSWORD = "root";
	
	
	public static Connection connect() throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		DOMConfigurator.configure("loggerConfig.xml");
		Class.forName ("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
		return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
	}
}