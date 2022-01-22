package com.innova.bootcamp.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MssqlDB implements IDatabaseType {

	@Override
	public String databaseType() {
		return "Database Type: Mssql DB";

	}

}
