package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.187-0300")
@StaticMetamodel(Pacoteingresso.class)
public class Pacoteingresso_ {
	public static volatile SingularAttribute<Pacoteingresso, Integer> idpacoteingresso;
	public static volatile SingularAttribute<Pacoteingresso, String> pais;
	public static volatile SingularAttribute<Pacoteingresso, String> cidade;
	public static volatile SingularAttribute<Pacoteingresso, Date> data;
	public static volatile SingularAttribute<Pacoteingresso, Integer> adt;
	public static volatile SingularAttribute<Pacoteingresso, Integer> chd;
	public static volatile SingularAttribute<Pacoteingresso, Integer> inf;
	public static volatile SingularAttribute<Pacoteingresso, Float> tarifa;
	public static volatile SingularAttribute<Pacoteingresso, Float> taxa;
	public static volatile SingularAttribute<Pacoteingresso, String> descritivo;
	public static volatile SingularAttribute<Pacoteingresso, Cambio> cambio;
	public static volatile SingularAttribute<Pacoteingresso, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacoteingresso, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacoteingresso, Float> valorcambio;
	public static volatile SingularAttribute<Pacoteingresso, Date> datapagamentoparceiro;
}
