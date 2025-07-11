package com.poortoys.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Borrow.class)
public abstract class Borrow_ {

	public static final String FROM_DATE = "fromDate";
	public static final String BORROW_STATUS = "borrowStatus";
	public static final String TO_DATE = "toDate";
	public static final String PUBLICATION = "publication";
	public static final String MEMBER = "member";
	public static final String ID = "id";

	
	/**
	 * @see com.poortoys.model.Borrow#fromDate
	 **/
	public static volatile SingularAttribute<Borrow, Date> fromDate;
	
	/**
	 * @see com.poortoys.model.Borrow#borrowStatus
	 **/
	public static volatile SingularAttribute<Borrow, String> borrowStatus;
	
	/**
	 * @see com.poortoys.model.Borrow#toDate
	 **/
	public static volatile SingularAttribute<Borrow, Date> toDate;
	
	/**
	 * @see com.poortoys.model.Borrow#publication
	 **/
	public static volatile SingularAttribute<Borrow, Publication> publication;
	
	/**
	 * @see com.poortoys.model.Borrow#member
	 **/
	public static volatile SingularAttribute<Borrow, Member> member;
	
	/**
	 * @see com.poortoys.model.Borrow#id
	 **/
	public static volatile SingularAttribute<Borrow, Long> id;
	
	/**
	 * @see com.poortoys.model.Borrow
	 **/
	public static volatile EntityType<Borrow> class_;

}

