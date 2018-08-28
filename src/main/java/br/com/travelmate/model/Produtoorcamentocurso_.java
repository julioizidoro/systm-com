package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.214-0300")
@StaticMetamodel(Produtoorcamentocurso.class)
public class Produtoorcamentocurso_ {
	public static volatile SingularAttribute<Produtoorcamentocurso, Integer> idprodutoOrcamentoCurso;
	public static volatile SingularAttribute<Produtoorcamentocurso, Float> valorMoedaEstrangeira;
	public static volatile SingularAttribute<Produtoorcamentocurso, Float> valorMoedaNacional;
	public static volatile SingularAttribute<Produtoorcamentocurso, Integer> orcamentocurso;
	public static volatile SingularAttribute<Produtoorcamentocurso, Produtosorcamento> produtosOrcamento;
	public static volatile SingularAttribute<Produtoorcamentocurso, Boolean> somarvalortotal;
}
