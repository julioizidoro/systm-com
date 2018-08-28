package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.154-0300")
@StaticMetamodel(Metasfaturamentomensal.class)
public class Metasfaturamentomensal_ {
	public static volatile SingularAttribute<Metasfaturamentomensal, Integer> idmetasfaturamentoemensal;
	public static volatile SingularAttribute<Metasfaturamentomensal, Integer> mes;
	public static volatile SingularAttribute<Metasfaturamentomensal, Integer> ano;
	public static volatile SingularAttribute<Metasfaturamentomensal, Float> valormeta;
	public static volatile SingularAttribute<Metasfaturamentomensal, Float> valoralcancado;
	public static volatile SingularAttribute<Metasfaturamentomensal, Float> percentualalcancado;
	public static volatile SingularAttribute<Metasfaturamentomensal, Float> valormetasemana;
	public static volatile SingularAttribute<Metasfaturamentomensal, Unidadenegocio> unidadenegocio;
}
