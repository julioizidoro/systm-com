package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.213-0300")
@StaticMetamodel(Planoconta.class)
public class Planoconta_ {
	public static volatile ListAttribute<Planoconta, Conciliacao> conciliacaoList;
	public static volatile ListAttribute<Planoconta, Contaspagar> contaspagarList;
	public static volatile SingularAttribute<Planoconta, Integer> idplanoconta;
	public static volatile SingularAttribute<Planoconta, String> descricao;
	public static volatile ListAttribute<Planoconta, Contasreceber> contasreceberList;
}
