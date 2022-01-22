package com.innova.bootcamp.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class DatabaseManager {

	@Inject
	private IDatabaseType iDatabaseType;

	public String getiDatabaseType() {
		return iDatabaseType.databaseType();
	}

}
