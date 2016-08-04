package application.orm;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import application.DataTableMain.Good;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GoodsBookDB {
	
	private static final String DB_PACKAGE_PATH = "src/application/db/";
	private static final String DB_NAME = "goods_book";
	private static final String DB_TABLE = "PERSONS";
	
	public static final String DB_FIRST_COLUMN_NAME = "Name";
	public static final String DB_SECOND_COLUMN_NAME = "Weigth";
	public static final String DB_THIRD_COLUMN_NAME = "Price";
	private static final String DB_FIRST_COLUMN_TYPE = "varchar(255)";
	private static final String DB_SECOND_COLUMN_TYPE = "varchar(255)";
	private static final String DB_THIRD_COLUMN_TYPE = "varchar(255)";
	
	private static final String DB_INSERT_INTO_QUERY = "INSERT INTO " + DB_TABLE + " VALUES ";
	private static final String DB_SELECT_FROM_QUERY = "SELECT * FROM " + DB_TABLE;
	private static final String DB_DELETE_FROM_QUERY = "DELETE FROM " + DB_TABLE;
	
	private static final String DB_PRINT_FORMAT = "%-15s%-15s%-15s%n%n";
	
	private static final String DB_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String DB_URL = "jdbc:derby:" + DB_PACKAGE_PATH + DB_NAME + ";create=true";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	private static Connection connection;
	
	static {
		try {
			createTable();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void createTable() throws SQLException, ClassNotFoundException {
		if (!isTableAlreadyExists()) {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			String createTableScript = "create table " + DB_TABLE
			+ "(" + DB_FIRST_COLUMN_NAME + " " + DB_FIRST_COLUMN_TYPE + 
			  ", " + DB_SECOND_COLUMN_NAME + " " + DB_SECOND_COLUMN_TYPE + 
			  ", " + DB_THIRD_COLUMN_NAME + " " + DB_THIRD_COLUMN_TYPE + ")";
			connection.createStatement().execute(createTableScript);
			
			connection.close();
		}
	}
	
	private static boolean isTableAlreadyExists() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		DatabaseMetaData dbm = connection.getMetaData();
		ResultSet tables = dbm.getTables(null, null, DB_TABLE.toUpperCase(), null);
		
		return closeConnectionAfterTableCreatedChecking(tables.next());
	}
	
	private static boolean closeConnectionAfterTableCreatedChecking(boolean condition) throws SQLException {
		connection.close();
		return condition;
	}
	
	
	public static void createPersons(Good... goods) throws SQLException, ClassNotFoundException {
		for(Good good : goods)
			createPerson(good.getName(), good.getWeigth(), good.getPrice());
	}
	
	public static ObservableList<Good> readPersons() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(DB_SELECT_FROM_QUERY);
		
		List<Good> existingUsers = new ArrayList<>();
		while (rs.next()) {
			existingUsers.add(new Good(rs.getString(DB_FIRST_COLUMN_NAME), 
					                     rs.getString(DB_SECOND_COLUMN_NAME), 
					                     rs.getString(DB_THIRD_COLUMN_NAME)));
		}
		
		connection.close();
		
		return FXCollections.observableArrayList(existingUsers);
	}
	
	private static void createPerson(final String... columns) throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		String insertScript = DB_INSERT_INTO_QUERY + "(";
		for(int i = 0; i < columns.length; ++i) {
			if(i != columns.length - 1)
				insertScript += "'" + columns[i] + "', ";
			else
				insertScript += "'" + columns[i] + "')";
		}
		connection.createStatement().execute(insertScript);
		
		connection.close();
	}
	
	
	public static void deletePersons() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		connection.createStatement().execute(DB_DELETE_FROM_QUERY);
		
		connection.close();
	}
}
