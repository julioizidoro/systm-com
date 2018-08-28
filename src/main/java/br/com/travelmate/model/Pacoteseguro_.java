package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.192-0300")
@StaticMetamodel(Pacoteseguro.class)
public class Pacoteseguro_ {
	public static volatile SingularAttribute<Pacoteseguro, Integer> idpacoteseguro;
	public static volatile SingularAttribute<Pacoteseguro, Integer> numerosegurados;
	public static volatile SingularAttribute<Pacoteseguro, Float> totalvalornet;
	public static volatile SingularAttribute<Pacoteseguro, Float> valornet;
	public static volatile SingularAttribute<Pacoteseguro, Pacotes> pacotes;
	public static volatile SingularAttribute<Pacoteseguro, Seguroviagem> seguroviagem;
}
