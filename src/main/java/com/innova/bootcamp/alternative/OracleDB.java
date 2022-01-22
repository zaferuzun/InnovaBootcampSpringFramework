package com.innova.bootcamp.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class OracleDB implements IDatabaseType {

	@Override
	public String databaseType() {
		return "Database Type: Oracle DB";

	}

}
