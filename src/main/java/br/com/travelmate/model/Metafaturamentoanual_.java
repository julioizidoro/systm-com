package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.154-0300")
@StaticMetamodel(Metafaturamentoanual.class)
public class Metafaturamentoanual_ {
	public static volatile SingularAttribute<Metafaturamentoanual, Integer> idmetafaturamentoanual;
	public static volatile SingularAttribute<Metafaturamentoanual, Integer> mes;
	public static volatile SingularAttribute<Metafaturamentoanual, Integer> ano;
	public static volatile SingularAttribute<Metafaturamentoanual, Float> valormeta;
	public static volatile SingularAttribute<Metafaturamentoanual, Float> metaalcancada;
	public static volatile SingularAttribute<Metafaturamentoanual, Float> percentualalcancado;
	public static volatile SingularAttribute<Metafaturamentoanual, Unidadenegocio> unidadenegocio;
}
