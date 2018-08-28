package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.143-0300")
@StaticMetamodel(Invoice.class)
public class Invoice_ {
	public static volatile SingularAttribute<Invoice, Integer> idinvoices;
	public static volatile SingularAttribute<Invoice, Date> dataPagamentoInvoice;
	public static volatile SingularAttribute<Invoice, Float> valorPagamentoInvoice;
	public static volatile SingularAttribute<Invoice, Float> valorcredito;
	public static volatile SingularAttribute<Invoice, String> obscredito;
	public static volatile SingularAttribute<Invoice, String> prioridade;
	public static volatile SingularAttribute<Invoice, Integer> controle;
	public static volatile SingularAttribute<Invoice, Date> datarecebimentocomprovante;
	public static volatile SingularAttribute<Invoice, Boolean> possuicredito;
	public static volatile SingularAttribute<Invoice, Integer> escala;
	public static volatile ListAttribute<Invoice, Pagamentoinvoice> pagamentoinvoiceList;
	public static volatile SingularAttribute<Invoice, Float> valorPago;
	public static volatile SingularAttribute<Invoice, Date> dataPrevistaPagamento;
	public static volatile SingularAttribute<Invoice, Float> valorPrevistoInvoice;
	public static volatile SingularAttribute<Invoice, String> tipo;
	public static volatile SingularAttribute<Invoice, String> situacao;
	public static volatile SingularAttribute<Invoice, String> observacaofinanceiro;
	public static volatile SingularAttribute<Invoice, String> observacaodepartamento;
	public static volatile SingularAttribute<Invoice, Boolean> paga;
	public static volatile SingularAttribute<Invoice, Invoiceremessainvoice> invoiceremessainvoice;
	public static volatile SingularAttribute<Invoice, Produtos> produtos;
	public static volatile SingularAttribute<Invoice, Vendas> vendas;
}
