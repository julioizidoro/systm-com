package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.111-0300")
@StaticMetamodel(Faturabanco.class)
public class Faturabanco_ {
	public static volatile SingularAttribute<Faturabanco, Integer> idfaturabanco;
	public static volatile SingularAttribute<Faturabanco, String> banco;
	public static volatile SingularAttribute<Faturabanco, String> agencia;
	public static volatile SingularAttribute<Faturabanco, String> conta;
	public static volatile SingularAttribute<Faturabanco, Fatura> fatura;
}
