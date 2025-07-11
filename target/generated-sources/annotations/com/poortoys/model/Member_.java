package com.poortoys.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Member.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Member_ extends com.poortoys.model.Person_ {

	public static final String BORROWS = "borrows";
	public static final String ID_MEMBER = "idMember";

	
	/**
	 * @see com.poortoys.model.Member#borrows
	 **/
	public static volatile ListAttribute<Member, Borrow> borrows;
	
	/**
	 * @see com.poortoys.model.Member#idMember
	 **/
	public static volatile SingularAttribute<Member, String> idMember;
	
	/**
	 * @see com.poortoys.model.Member
	 **/
	public static volatile EntityType<Member> class_;

}

