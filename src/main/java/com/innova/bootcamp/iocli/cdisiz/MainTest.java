package com.innova.bootcamp.iocli.cdisiz;

public class MainTest {
	
	public static void main(String[] args) {
		
		DatabaseManager databaseManager = new DatabaseManager(new OracleDB());
		databaseManager.databaseType();
	}
	
}
