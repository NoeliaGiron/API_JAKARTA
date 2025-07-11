package com.poortoys.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Librarian.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Librarian_ extends com.poortoys.model.Person_ {

	public static final String ID_LIBRARIAN = "idLibrarian";
	public static final String ISSUES = "issues";

	
	/**
	 * @see com.poortoys.model.Librarian#idLibrarian
	 **/
	public static volatile SingularAttribute<Librarian, String> idLibrarian;
	
	/**
	 * @see com.poortoys.model.Librarian
	 **/
	public static volatile EntityType<Librarian> class_;
	
	/**
	 * @see com.poortoys.model.Librarian#issues
	 **/
	public static volatile ListAttribute<Librarian, Issue> issues;

}

