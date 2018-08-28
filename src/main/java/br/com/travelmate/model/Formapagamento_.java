package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.117-0300")
@StaticMetamodel(Formapagamento.class)
public class Formapagamento_ {
	public static volatile SingularAttribute<Formapagamento, Integer> idformaPagamento;
	public static volatile SingularAttribute<Formapagamento, String> condicao;
	public static volatile SingularAttribute<Formapagamento, Float> valorOrcamento;
	public static volatile SingularAttribute<Formapagamento, String> possuiJuros;
	public static volatile SingularAttribute<Formapagamento, Float> valorJuros;
	public static volatile SingularAttribute<Formapagamento, Float> valorTotal;
	public static volatile SingularAttribute<Formapagamento, String> observacoes;
	public static volatile SingularAttribute<Formapagamento, Float> valordesconto;
	public static volatile ListAttribute<Formapagamento, Parcelamentopagamento> parcelamentopagamentoList;
	public static volatile SingularAttribute<Formapagamento, Vendas> vendas;
}
