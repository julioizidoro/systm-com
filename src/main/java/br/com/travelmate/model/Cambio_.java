package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.042-0300")
@StaticMetamodel(Cambio.class)
public class Cambio_ {
	public static volatile SingularAttribute<Cambio, Integer> idcambio;
	public static volatile SingularAttribute<Cambio, Date> data;
	public static volatile SingularAttribute<Cambio, Float> valor;
	public static volatile SingularAttribute<Cambio, Moedas> moedas;
}
