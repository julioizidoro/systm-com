package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-07T19:55:04.369-0300")
@StaticMetamodel(Produtosorcamento.class)
public class Produtosorcamento_ {
	public static volatile SingularAttribute<Produtosorcamento, Integer> idprodutosOrcamento;
	public static volatile SingularAttribute<Produtosorcamento, String> descricao;
	public static volatile ListAttribute<Produtosorcamento, Filtroorcamentoproduto> filtroorcamentoprodutoList;
	public static volatile SingularAttribute<Produtosorcamento, String> tipo;
	public static volatile SingularAttribute<Produtosorcamento, String> tipoproduto;
	public static volatile SingularAttribute<Produtosorcamento, String> descricaooutralingua;
	public static volatile SingularAttribute<Produtosorcamento, Boolean> vincular;
	public static volatile SingularAttribute<Produtosorcamento, String> tipoorcamento;
	public static volatile SingularAttribute<Produtosorcamento, Boolean> pathway;
	public static volatile ListAttribute<Produtosorcamento, Produtoremessa> produtoremessaList;
	public static volatile SingularAttribute<Produtosorcamento, Produtosorcamentogrupo> produtosorcamentogrupo;
	public static volatile SingularAttribute<Produtosorcamento, Boolean> novo;
}
