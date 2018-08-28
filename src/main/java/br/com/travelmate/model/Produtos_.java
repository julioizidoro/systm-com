package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.216-0300")
@StaticMetamodel(Produtos.class)
public class Produtos_ {
	public static volatile SingularAttribute<Produtos, Integer> idprodutos;
	public static volatile SingularAttribute<Produtos, String> descricao;
	public static volatile SingularAttribute<Produtos, Double> comissaogerente;
	public static volatile SingularAttribute<Produtos, Integer> idgerente;
	public static volatile SingularAttribute<Produtos, String> tipo;
	public static volatile SingularAttribute<Produtos, Boolean> mostrar;
	public static volatile ListAttribute<Produtos, Fornecedorcidade> fornecedorcidadeList;
	public static volatile ListAttribute<Produtos, Tipoarquivoproduto> tipoarquivoprodutoList;
	public static volatile ListAttribute<Produtos, Paisproduto> paisprodutoList;
	public static volatile SingularAttribute<Produtos, Boolean> produtorunners;
	public static volatile SingularAttribute<Produtos, Integer> ordem;
}
