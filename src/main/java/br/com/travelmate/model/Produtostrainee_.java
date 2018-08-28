package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.219-0300")
@StaticMetamodel(Produtostrainee.class)
public class Produtostrainee_ {
	public static volatile SingularAttribute<Produtostrainee, Integer> idprodutostrainee;
	public static volatile SingularAttribute<Produtostrainee, Integer> numerosemanas;
	public static volatile SingularAttribute<Produtostrainee, Float> valorapplication;
	public static volatile SingularAttribute<Produtostrainee, Float> valorprograma;
	public static volatile SingularAttribute<Produtostrainee, Float> valorvisto;
	public static volatile SingularAttribute<Produtostrainee, Float> valorseguro;
	public static volatile SingularAttribute<Produtostrainee, Float> valortotal;
	public static volatile SingularAttribute<Produtostrainee, String> tipoestagio;
	public static volatile SingularAttribute<Produtostrainee, Produtosorcamento> produtoapplication;
	public static volatile SingularAttribute<Produtostrainee, Produtosorcamento> produtoprograma;
	public static volatile SingularAttribute<Produtostrainee, Produtosorcamento> produtovisto;
	public static volatile SingularAttribute<Produtostrainee, Produtosorcamento> produtoseguro;
	public static volatile SingularAttribute<Produtostrainee, Valorestrainee> valorestrainee;
}
