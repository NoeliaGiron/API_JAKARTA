package com.poortoys.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static final String ADDRESS = "address";
	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String AGE = "age";

	
	/**
	 * @see com.poortoys.model.Person#address
	 **/
	public static volatile SingularAttribute<Person, String> address;
	
	/**
	 * @see com.poortoys.model.Person#surname
	 **/
	public static volatile SingularAttribute<Person, String> surname;
	
	/**
	 * @see com.poortoys.model.Person#name
	 **/
	public static volatile SingularAttribute<Person, String> name;
	
	/**
	 * @see com.poortoys.model.Person#id
	 **/
	public static volatile SingularAttribute<Person, Long> id;
	
	/**
	 * @see com.poortoys.model.Person
	 **/
	public static volatile EntityType<Person> class_;
	
	/**
	 * @see com.poortoys.model.Person#age
	 **/
	public static volatile SingularAttribute<Person, Integer> age;

}

