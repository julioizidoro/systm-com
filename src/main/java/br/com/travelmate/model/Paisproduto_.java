package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-17T13:27:05.130-0300")
@StaticMetamodel(Paisproduto.class)
public class Paisproduto_ {
	public static volatile SingularAttribute<Paisproduto, Integer> idpaisproduto;
	public static volatile SingularAttribute<Paisproduto, String> descricao;
	public static volatile SingularAttribute<Paisproduto, Produtos> produtos;
	public static volatile SingularAttribute<Paisproduto, Pais> pais;
	public static volatile ListAttribute<Paisproduto, Cidadepaisproduto> cidadepaisList;
}
