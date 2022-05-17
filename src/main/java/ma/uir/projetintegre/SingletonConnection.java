/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.uir.projetintegre;

import java.sql.DriverManager;
import java.sql.Connection;

public class SingletonConnection {
	private static Connection connection; 
	
	static{
		try {            
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2", "root", "nCVhqToDiF2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        public static Connection getConnection(){
		return connection;
	}
}
