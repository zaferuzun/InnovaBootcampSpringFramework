package com.innova.bootcamp.enumqualifier;

@EQualifierMultiple(EDatabaseType.MysqlDB)
public class MysqlDB implements IDatabaseType {

	@Override
	public String databaseType() {
		return "Database Type: Mysql DB";

	}
}
