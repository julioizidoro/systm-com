package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-07T09:56:24.530-0300")
@StaticMetamodel(Produtosorcamentoindice.class)
public class Produtosorcamentoindice_ {
	public static volatile SingularAttribute<Produtosorcamentoindice, Integer> idprodutosorcamentoindice;
	public static volatile SingularAttribute<Produtosorcamentoindice, String> descricao;
	public static volatile ListAttribute<Produtosorcamentoindice, Produtosorcamentogrupo> produtosorcamentogrupoList;
	public static volatile SingularAttribute<Produtosorcamentoindice, Departamentoproduto> departamentoproduto;
}
