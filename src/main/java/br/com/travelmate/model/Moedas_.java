package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.157-0300")
@StaticMetamodel(Moedas.class)
public class Moedas_ {
	public static volatile SingularAttribute<Moedas, Integer> idmoedas;
	public static volatile SingularAttribute<Moedas, String> descricao;
	public static volatile SingularAttribute<Moedas, String> sigla;
	public static volatile ListAttribute<Moedas, Pais> paisList;
}
