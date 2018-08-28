package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.198-0300")
@StaticMetamodel(Pagamentoinvoice.class)
public class Pagamentoinvoice_ {
	public static volatile SingularAttribute<Pagamentoinvoice, Integer> idpagamentoinvoice;
	public static volatile SingularAttribute<Pagamentoinvoice, Date> datapagamento;
	public static volatile SingularAttribute<Pagamentoinvoice, Float> valorpago;
	public static volatile SingularAttribute<Pagamentoinvoice, Float> taxa;
	public static volatile SingularAttribute<Pagamentoinvoice, Float> iof;
	public static volatile SingularAttribute<Pagamentoinvoice, Float> cambiopagamento;
	public static volatile SingularAttribute<Pagamentoinvoice, Float> ganhoperda;
	public static volatile SingularAttribute<Pagamentoinvoice, String> banco;
	public static volatile SingularAttribute<Pagamentoinvoice, String> outros;
	public static volatile SingularAttribute<Pagamentoinvoice, Date> datacomprovante;
	public static volatile SingularAttribute<Pagamentoinvoice, String> nomearquivo;
	public static volatile SingularAttribute<Pagamentoinvoice, String> tipopagamento;
	public static volatile SingularAttribute<Pagamentoinvoice, Invoice> invoice;
}
