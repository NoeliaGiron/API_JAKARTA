package com.poortoys.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Issue.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Issue_ {

	public static final String MANAGE_DATE = "manageDate";
	public static final String ISSUE_STATUS = "issueStatus";
	public static final String PUBLICATION = "publication";
	public static final String PUBLISH_DATE = "publishDate";
	public static final String UNPUBLISH_DATE = "unpublishDate";
	public static final String LIBRARIAN = "librarian";
	public static final String ID = "id";

	
	/**
	 * @see com.poortoys.model.Issue#manageDate
	 **/
	public static volatile SingularAttribute<Issue, Date> manageDate;
	
	/**
	 * @see com.poortoys.model.Issue#issueStatus
	 **/
	public static volatile SingularAttribute<Issue, String> issueStatus;
	
	/**
	 * @see com.poortoys.model.Issue#publication
	 **/
	public static volatile SingularAttribute<Issue, Publication> publication;
	
	/**
	 * @see com.poortoys.model.Issue#publishDate
	 **/
	public static volatile SingularAttribute<Issue, Date> publishDate;
	
	/**
	 * @see com.poortoys.model.Issue#unpublishDate
	 **/
	public static volatile SingularAttribute<Issue, Date> unpublishDate;
	
	/**
	 * @see com.poortoys.model.Issue#librarian
	 **/
	public static volatile SingularAttribute<Issue, Librarian> librarian;
	
	/**
	 * @see com.poortoys.model.Issue#id
	 **/
	public static volatile SingularAttribute<Issue, Long> id;
	
	/**
	 * @see com.poortoys.model.Issue
	 **/
	public static volatile EntityType<Issue> class_;

}

