package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.310-0300")
@StaticMetamodel(Workempregador.class)
public class Workempregador_ {
	public static volatile SingularAttribute<Workempregador, Integer> idworkempregador;
	public static volatile SingularAttribute<Workempregador, String> nome;
	public static volatile SingularAttribute<Workempregador, String> estado;
	public static volatile SingularAttribute<Workempregador, Boolean> oferecepickup;
	public static volatile SingularAttribute<Workempregador, String> aeroportosugerido;
	public static volatile SingularAttribute<Workempregador, Cidadepaisproduto> cidadepaisproduto;
	public static volatile SingularAttribute<Workempregador, Worksponsor> worksponsor;
}
