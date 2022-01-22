package com.innova.bootcamp.enumqualifier;


@EQualifierMultiple(EDatabaseType.OracleDB)
public class OracleDB implements IDatabaseType {

	@Override
	public String databaseType() {
		return "Database Type: Oracle DB";

	}

}
