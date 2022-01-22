package com.innova.bootcamp.iocli.cdisiz;

public class MssqlDB implements IDatabaseType {

	@Override
	public void databaseType() {
		System.out.println("Database Type: Mssql DB");
		
	}

}
