package com.innova.bootcamp.iocli.cdisiz;

import javax.inject.Inject;

public class DatabaseManager {

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private IDatabaseType iDatabaseType;

	//constructor 
	public DatabaseManager(IDatabaseType iDatabaseType) {
		this.iDatabaseType = iDatabaseType;
	}

	public void databaseType() {

		iDatabaseType.databaseType();
	}

}
