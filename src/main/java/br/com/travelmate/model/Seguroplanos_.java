package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.234-0300")
@StaticMetamodel(Seguroplanos.class)
public class Seguroplanos_ {
	public static volatile SingularAttribute<Seguroplanos, Integer> idseguroplanos;
	public static volatile SingularAttribute<Seguroplanos, String> nome;
	public static volatile SingularAttribute<Seguroplanos, Boolean> ativo;
	public static volatile SingularAttribute<Seguroplanos, Integer> idademinima;
	public static volatile SingularAttribute<Seguroplanos, Integer> idademaxima;
	public static volatile SingularAttribute<Seguroplanos, Integer> diasemissaominima;
	public static volatile SingularAttribute<Seguroplanos, Fornecedor> fornecedor;
}
