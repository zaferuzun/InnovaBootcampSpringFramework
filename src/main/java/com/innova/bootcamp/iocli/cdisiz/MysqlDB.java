package com.innova.bootcamp.iocli.cdisiz;

public class MysqlDB implements IDatabaseType {

	@Override
	public void databaseType() {
		System.out.println("Database Type: Mysql DB");

	}
}
