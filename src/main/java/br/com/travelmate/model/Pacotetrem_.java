package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.197-0300")
@StaticMetamodel(Pacotetrem.class)
public class Pacotetrem_ {
	public static volatile SingularAttribute<Pacotetrem, Integer> idpacotetrem;
	public static volatile SingularAttribute<Pacotetrem, String> de;
	public static volatile SingularAttribute<Pacotetrem, String> para;
	public static volatile SingularAttribute<Pacotetrem, Date> data;
	public static volatile SingularAttribute<Pacotetrem, String> horasaida;
	public static volatile SingularAttribute<Pacotetrem, String> horachegada;
	public static volatile SingularAttribute<Pacotetrem, String> classe;
	public static volatile SingularAttribute<Pacotetrem, Integer> adt;
	public static volatile SingularAttribute<Pacotetrem, Integer> chd;
	public static volatile SingularAttribute<Pacotetrem, Integer> inf;
	public static volatile SingularAttribute<Pacotetrem, Float> tarifa;
	public static volatile SingularAttribute<Pacotetrem, Float> taxa;
	public static volatile SingularAttribute<Pacotetrem, Cambio> cambio;
	public static volatile SingularAttribute<Pacotetrem, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacotetrem, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacotetrem, Float> valorcambio;
	public static volatile SingularAttribute<Pacotetrem, Date> datapagamentoparceiro;
}
