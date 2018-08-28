package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.144-0300")
@StaticMetamodel(Invoiceremessa.class)
public class Invoiceremessa_ {
	public static volatile SingularAttribute<Invoiceremessa, Integer> idinvoiceremessa;
	public static volatile SingularAttribute<Invoiceremessa, Date> data;
	public static volatile SingularAttribute<Invoiceremessa, String> hora;
	public static volatile SingularAttribute<Invoiceremessa, Usuario> usuarioCurso;
	public static volatile SingularAttribute<Invoiceremessa, Usuario> usuairoFinanceiro;
	public static volatile ListAttribute<Invoiceremessa, Invoiceremessainvoice> invoiceremessainvoiceList;
	public static volatile SingularAttribute<Invoiceremessa, Boolean> finalizada;
}
