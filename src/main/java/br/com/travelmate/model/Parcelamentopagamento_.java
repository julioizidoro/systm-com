package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-09T10:00:11.970-0300")
@StaticMetamodel(Parcelamentopagamento.class)
public class Parcelamentopagamento_ {
	public static volatile SingularAttribute<Parcelamentopagamento, Integer> idparcemlamentoPagamento;
	public static volatile SingularAttribute<Parcelamentopagamento, String> formaPagamento;
	public static volatile SingularAttribute<Parcelamentopagamento, String> tipoParcelmaneto;
	public static volatile SingularAttribute<Parcelamentopagamento, Float> valorParcelamento;
	public static volatile SingularAttribute<Parcelamentopagamento, Date> diaVencimento;
	public static volatile SingularAttribute<Parcelamentopagamento, Integer> numeroParcelas;
	public static volatile SingularAttribute<Parcelamentopagamento, Float> valorParcela;
	public static volatile SingularAttribute<Parcelamentopagamento, Formapagamento> formapagamento;
	public static volatile SingularAttribute<Parcelamentopagamento, Boolean> restrito;
}
