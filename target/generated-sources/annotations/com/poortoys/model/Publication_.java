package com.poortoys.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Publication.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Publication_ {

	public static final String STATUS_PUBLICATION = "statusPublication";
	public static final String YEAR = "year";
	public static final String AUTHOR = "author";
	public static final String BORROWS = "borrows";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String ISSUES = "issues";

	
	/**
	 * @see com.poortoys.model.Publication#statusPublication
	 **/
	public static volatile SingularAttribute<Publication, StatusPublication> statusPublication;
	
	/**
	 * @see com.poortoys.model.Publication#year
	 **/
	public static volatile SingularAttribute<Publication, Integer> year;
	
	/**
	 * @see com.poortoys.model.Publication#author
	 **/
	public static volatile SingularAttribute<Publication, String> author;
	
	/**
	 * @see com.poortoys.model.Publication#borrows
	 **/
	public static volatile ListAttribute<Publication, Borrow> borrows;
	
	/**
	 * @see com.poortoys.model.Publication#id
	 **/
	public static volatile SingularAttribute<Publication, Long> id;
	
	/**
	 * @see com.poortoys.model.Publication#title
	 **/
	public static volatile SingularAttribute<Publication, String> title;
	
	/**
	 * @see com.poortoys.model.Publication
	 **/
	public static volatile EntityType<Publication> class_;
	
	/**
	 * @see com.poortoys.model.Publication#issues
	 **/
	public static volatile ListAttribute<Publication, Issue> issues;

}

