package com.innova.bootcamp.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualiferCDI")
@ApplicationScoped
public class QualiferDatabaseManager implements Serializable {
	private static final long serialVersionUID = 3097860167944776376L;

//	//Default
//	@Inject
//	private IDatabaseType iDatabaseType;	

	@SuppressWarnings("cdi-ambiguous-dependency")
	@QualifierMultiple
	@Inject
	private IDatabaseType iDatabaseType;

	public String getiDatabaseType() {
		return iDatabaseType.databaseType();
	}

}
