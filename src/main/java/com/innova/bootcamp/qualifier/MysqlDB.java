package com.innova.bootcamp.qualifier;

@QualifierMultiple
public class MysqlDB implements IDatabaseType {

	@Override
	public String databaseType() {
		return "Database Type: Mysql DB";

	}
}
