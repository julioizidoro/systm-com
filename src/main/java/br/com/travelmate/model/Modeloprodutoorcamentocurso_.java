package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.157-0300")
@StaticMetamodel(Modeloprodutoorcamentocurso.class)
public class Modeloprodutoorcamentocurso_ {
	public static volatile SingularAttribute<Modeloprodutoorcamentocurso, Integer> idprodutoOrcamentoCurso;
	public static volatile SingularAttribute<Modeloprodutoorcamentocurso, Float> valorMoedaEstrangeira;
	public static volatile SingularAttribute<Modeloprodutoorcamentocurso, Float> valorMoedaNacional;
	public static volatile SingularAttribute<Modeloprodutoorcamentocurso, Modeloorcamentocurso> modeloorcamentocurso;
	public static volatile SingularAttribute<Modeloprodutoorcamentocurso, Produtosorcamento> produtosorcamento;
}
