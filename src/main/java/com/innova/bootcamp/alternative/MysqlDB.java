package com.innova.bootcamp.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MysqlDB implements IDatabaseType {

	@Override
	public String databaseType() {
		return "Database Type: Mysql DB";

	}
}
