package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.062-0300")
@StaticMetamodel(Conciliacao.class)
public class Conciliacao_ {
	public static volatile SingularAttribute<Conciliacao, Integer> idconciliacai;
	public static volatile SingularAttribute<Conciliacao, Date> data;
	public static volatile SingularAttribute<Conciliacao, String> descricao;
	public static volatile SingularAttribute<Conciliacao, Float> valorentrada;
	public static volatile SingularAttribute<Conciliacao, Float> valorsaida;
	public static volatile SingularAttribute<Conciliacao, Banco> banco;
	public static volatile SingularAttribute<Conciliacao, Planoconta> planoconta;
	public static volatile SingularAttribute<Conciliacao, Unidadenegocio> unidadenegocio;
}
