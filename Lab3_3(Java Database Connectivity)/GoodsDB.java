package _3_3_database_connectivity.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import _3_3_database_connectivity.common.presentation.driver_manager_and_connection.students.Student;

public class GoodsDB {

	private static final String DB_DRIVER;
	private static final String DB_CONNECTION;
	private static final String DB_USER;
	private static final String DB_PASSWORD;

	private static Connection connection = null;

	static {
		DB_DRIVER = "org.h2.Driver";
		DB_CONNECTION = "jdbc:h2:tcp://localhost/~/goods";
		DB_USER = "sa";
		DB_PASSWORD = "sa";
	}

	public static void goodsDBDemo() {
		create();
		insert(new ShoppingCard("Egg", 7.2, 1.9, 0.1));
		insert(new ShoppingCard("Chicken", 18.2, 1.5, 1.2));
		insert(new ShoppingCard("Meat", 14.8, 20.2, 8.2));
		insert(new ShoppingCard("Cheese", 25.4, 17.5, 35.1));
		insert(new ShoppingCard("Banana", 1.4, 3.3, 35.1));
		read();
		delete(5);
		delete("Meat");
		update(1, new ShoppingCard("Egg", 7.2, 1.9, 2.1));
		System.out.println("\n\n\nChange DB\n");
		read();
	}

	private static void create() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "DROP TABLE IF EXISTS GOODS;" + "CREATE TABLE GOODS(" + "ID INT PRIMARY KEY, "
					+ "NAME VARCHAR(255)," + "PROTEIN DOUBLE," + "CARGOHYBRATE DOUBLE," + "FAT DOUBLE);";
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void insert(final ShoppingCard shCard) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "INSERT INTO GOODS " + "(ID, NAME, PROTEIN, CARGOHYBRATE, FAT)" + "values ('" + (getDBLastID() + 1)
					+ "'" + ", '" + shCard.getName() + "'" + ", '" + shCard.getProtein() + "'" + ", '"
					+ shCard.getCargohybrate() + "'" + ", '" + shCard.getFat() + "')";
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	private static void delete(final int ID) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "DELETE FROM GOODS WHERE ID=" + ID;
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void delete(String name) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "DELETE FROM GOODS WHERE NAME='" + name + "'";
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	private static void read() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM GOODS ");
			System.out.printf("%-5s%-15s%-15s%-15s%-15s%n%n", "ID", "NAME", "PROTEIN", "CARGOHYBRATE" , "FAT");
			while (rs.next())
				System.out.printf("%-5s%-15s%-15s%-15s%-15s%n", rs.getString("ID"), rs.getString("NAME"),
						rs.getString("PROTEIN"), rs.getString("CARGOHYBRATE"),rs.getString("FAT"));
			System.out.println();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void update(final int ID, final ShoppingCard ShoppingCard) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);
			connection.setAutoCommit(false);
			Statement stmt = connection.createStatement();

			String sql = "UPDATE GOODS SET NAME='" + 
					ShoppingCard.getName() + "' WHERE ID=" + ID; 
			stmt.executeUpdate(sql);
			
			sql = "UPDATE GOODS SET PROTEIN='" + 
					ShoppingCard.getProtein() + "' WHERE ID=" + ID; 
			stmt.executeUpdate(sql);
			
			sql = "UPDATE GOODS SET CARGOHYBRATE='" + 
					ShoppingCard.getCargohybrate() + "' WHERE ID=" + ID; 
			stmt.executeUpdate(sql);
			
			sql = "UPDATE GOODS SET FAT='" + 
					ShoppingCard.getFat() + "' WHERE ID=" + ID; 
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static int getDBLastID() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM GOODS ");
			
			int counter = 0;
			while (rs.next())
				++counter;
			
			return counter;
			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}