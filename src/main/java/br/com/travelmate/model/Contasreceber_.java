package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-09T10:00:11.836-0300")
@StaticMetamodel(Contasreceber.class)
public class Contasreceber_ {
	public static volatile SingularAttribute<Contasreceber, Integer> idcontasreceber;
	public static volatile SingularAttribute<Contasreceber, String> numerodocumento;
	public static volatile SingularAttribute<Contasreceber, String> numeroparcelas;
	public static volatile SingularAttribute<Contasreceber, Date> datavencimento;
	public static volatile SingularAttribute<Contasreceber, Float> valorparcela;
	public static volatile SingularAttribute<Contasreceber, Float> juros;
	public static volatile SingularAttribute<Contasreceber, Float> desagio;
	public static volatile SingularAttribute<Contasreceber, Date> datapagamento;
	public static volatile SingularAttribute<Contasreceber, Float> valorpago;
	public static volatile SingularAttribute<Contasreceber, String> tipodocumento;
	public static volatile SingularAttribute<Contasreceber, String> nossonumero;
	public static volatile SingularAttribute<Contasreceber, String> boletogerado;
	public static volatile SingularAttribute<Contasreceber, String> motivocancelamento;
	public static volatile SingularAttribute<Contasreceber, Date> dataEmissao;
	public static volatile SingularAttribute<Contasreceber, Date> dataenvio;
	public static volatile SingularAttribute<Contasreceber, Date> dataRetorno;
	public static volatile SingularAttribute<Contasreceber, Boolean> boletoenviado;
	public static volatile SingularAttribute<Contasreceber, Boolean> dataalterada;
	public static volatile SingularAttribute<Contasreceber, Boolean> boletocancelado;
	public static volatile SingularAttribute<Contasreceber, Integer> idconciliacao;
	public static volatile SingularAttribute<Contasreceber, String> situacao;
	public static volatile SingularAttribute<Contasreceber, Integer> parcelaboleto;
	public static volatile SingularAttribute<Contasreceber, String> codigoocorrencia;
	public static volatile SingularAttribute<Contasreceber, Banco> banco;
	public static volatile SingularAttribute<Contasreceber, Planoconta> planoconta;
	public static volatile SingularAttribute<Contasreceber, Vendas> vendas;
	public static volatile SingularAttribute<Contasreceber, Date> datacancelamento;
	public static volatile SingularAttribute<Contasreceber, Crmcobrancaconta> crmcobrancaconta;
	public static volatile SingularAttribute<Contasreceber, Date> datanovovencimento;
	public static volatile SingularAttribute<Contasreceber, Integer> idparcelamentopagamento;
	public static volatile SingularAttribute<Contasreceber, Boolean> restrito;
}
