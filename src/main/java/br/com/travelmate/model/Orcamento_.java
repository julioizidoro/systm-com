package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.172-0300")
@StaticMetamodel(Orcamento.class)
public class Orcamento_ {
	public static volatile SingularAttribute<Orcamento, Integer> idorcamento;
	public static volatile SingularAttribute<Orcamento, Date> dataCambio;
	public static volatile SingularAttribute<Orcamento, Float> valorCambio;
	public static volatile SingularAttribute<Orcamento, String> cambioAlterado;
	public static volatile SingularAttribute<Orcamento, Float> totalMoedaEstrangeira;
	public static volatile SingularAttribute<Orcamento, Float> totalMoedaNacional;
	public static volatile SingularAttribute<Orcamento, Float> taxatm;
	public static volatile SingularAttribute<Orcamento, Cambio> cambio;
	public static volatile SingularAttribute<Orcamento, Vendas> vendas;
	public static volatile ListAttribute<Orcamento, Orcamentoprodutosorcamento> orcamentoprodutosorcamentoList;
}
