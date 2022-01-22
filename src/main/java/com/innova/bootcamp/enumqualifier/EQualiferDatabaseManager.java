package com.innova.bootcamp.enumqualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class EQualiferDatabaseManager implements Serializable {
	private static final long serialVersionUID = 3097860167944776376L;

//	//Default
//	@Inject
//	private IDatabaseType iDatabaseType;	

	@SuppressWarnings("cdi-ambiguous-dependency")
	@EQualifierMultiple(EDatabaseType.OracleDB)
	@Inject()
	private IDatabaseType iDatabaseType;

	public String getiDatabaseType() {
		return iDatabaseType.databaseType();
	}

}
