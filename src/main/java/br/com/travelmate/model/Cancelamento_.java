package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-02T09:11:27.063-0300")
@StaticMetamodel(Cancelamento.class)
public class Cancelamento_ {
	public static volatile SingularAttribute<Cancelamento, Integer> idcancelamento;
	public static volatile SingularAttribute<Cancelamento, Date> datasolicitacao;
	public static volatile SingularAttribute<Cancelamento, Float> totalrecebido;
	public static volatile SingularAttribute<Cancelamento, Float> totalrecebidomatriz;
	public static volatile SingularAttribute<Cancelamento, Float> totalrecebidoloja;
	public static volatile SingularAttribute<Cancelamento, Float> multacliente;
	public static volatile SingularAttribute<Cancelamento, Float> totalreembolso;
	public static volatile SingularAttribute<Cancelamento, Date> datareembolso;
	public static volatile SingularAttribute<Cancelamento, String> observacao;
	public static volatile SingularAttribute<Cancelamento, Integer> idvendacredito;
	public static volatile SingularAttribute<Cancelamento, Float> estornoloja;
	public static volatile SingularAttribute<Cancelamento, Float> multafornecedor;
	public static volatile SingularAttribute<Cancelamento, Float> saldocancelamento;
	public static volatile SingularAttribute<Cancelamento, Usuario> usuario;
	public static volatile SingularAttribute<Cancelamento, Vendas> vendas;
	public static volatile SingularAttribute<Cancelamento, Condicaocancelamento> condicaocancelamento;
	public static volatile SingularAttribute<Cancelamento, String> motivo;
	public static volatile SingularAttribute<Cancelamento, String> situacao;
	public static volatile SingularAttribute<Cancelamento, Float> valorcredito;
	public static volatile SingularAttribute<Cancelamento, Float> valorreembolso;
	public static volatile SingularAttribute<Cancelamento, String> formapagamento;
	public static volatile SingularAttribute<Cancelamento, String> hora;
	public static volatile SingularAttribute<Cancelamento, Boolean> uploadtermo;
	public static volatile SingularAttribute<Cancelamento, Cancelamentocredito> cancelamentocredito;
}
