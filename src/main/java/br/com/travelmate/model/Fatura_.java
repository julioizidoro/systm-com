package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.109-0300")
@StaticMetamodel(Fatura.class)
public class Fatura_ {
	public static volatile SingularAttribute<Fatura, Integer> idfatura;
	public static volatile SingularAttribute<Fatura, Integer> mes;
	public static volatile SingularAttribute<Fatura, Integer> ano;
	public static volatile SingularAttribute<Fatura, Float> saldodebito;
	public static volatile SingularAttribute<Fatura, Float> valorpago;
	public static volatile SingularAttribute<Fatura, Float> saldofinalanterior;
	public static volatile SingularAttribute<Fatura, Float> saldolancamentos;
	public static volatile SingularAttribute<Fatura, Float> valorpagar;
	public static volatile SingularAttribute<Fatura, Float> saldodevedor;
	public static volatile SingularAttribute<Fatura, Boolean> gerartaxapublicidade;
	public static volatile ListAttribute<Fatura, Faturafaturafraquias> faturafaturafraquiasList;
	public static volatile ListAttribute<Fatura, Faturafaturaajuste> faturafaturaajusteList;
	public static volatile SingularAttribute<Fatura, Unidadenegocio> unidadenegocio;
	public static volatile SingularAttribute<Fatura, Usuario> usuario;
}
