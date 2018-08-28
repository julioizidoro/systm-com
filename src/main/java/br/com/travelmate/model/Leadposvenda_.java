package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.150-0300")
@StaticMetamodel(Leadposvenda.class)
public class Leadposvenda_ {
	public static volatile SingularAttribute<Leadposvenda, Integer> idleadposvenda;
	public static volatile SingularAttribute<Leadposvenda, Date> dataembarque;
	public static volatile SingularAttribute<Leadposvenda, Date> datachegada;
	public static volatile SingularAttribute<Leadposvenda, Lead> lead;
	public static volatile SingularAttribute<Leadposvenda, Vendas> vendas;
}
