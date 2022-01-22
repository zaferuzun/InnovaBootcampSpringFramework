package com.innova.bootcamp.iocsiz.cdisiz;

public class DatabaseType {
	
	public void databaseType(String type) {
		
		if (type.equals("OracleDB")) {
			System.out.println("Oracle DB");
		} else if (type.equals("Mysql")) {
			System.out.println("Mysql DB");
		} else if (type.equals("Mssql")) {
			System.out.println("Mssql DB");
		} else {
			System.out.println("Farklı bir sürüm girdiniz");
		}
	}
	
}
