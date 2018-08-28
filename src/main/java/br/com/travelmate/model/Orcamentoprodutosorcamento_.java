package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-02T10:45:16.379-0300")
@StaticMetamodel(Orcamentoprodutosorcamento.class)
public class Orcamentoprodutosorcamento_ {
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, Integer> idorcamentoProdutosOrcamento;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, String> descricao;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, Float> valorMoedaEstrangeira;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, Float> valorMoedaNacional;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, String> tipo;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, Orcamento> orcamento;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, Boolean> importado;
	public static volatile SingularAttribute<Orcamentoprodutosorcamento, Boolean> obrigatorio;
}
