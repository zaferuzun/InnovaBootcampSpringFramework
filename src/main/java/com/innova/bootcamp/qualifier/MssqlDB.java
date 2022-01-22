package com.innova.bootcamp.qualifier;

import javax.enterprise.inject.Default;

@Default
public class MssqlDB implements IDatabaseType {

	@Override
	public String databaseType() {
		return "Database Type: Mssql DB";

	}

}
