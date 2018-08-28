package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.309-0300")
@StaticMetamodel(Voluntariadoprojetovalor.class)
public class Voluntariadoprojetovalor_ {
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Integer> idvoluntariadoprojetovalor;
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Date> datainicial;
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Date> datafinal;
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Integer> numerosemanainicial;
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Float> valor;
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Float> valorsemanaadicional;
	public static volatile SingularAttribute<Voluntariadoprojetovalor, Voluntariadoprojeto> voluntariadoprojeto;
}
