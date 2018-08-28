package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.259-0300")
@StaticMetamodel(Valoreswork.class)
public class Valoreswork_ {
	public static volatile SingularAttribute<Valoreswork, Integer> idvaloresWork;
	public static volatile SingularAttribute<Valoreswork, String> descricao;
	public static volatile SingularAttribute<Valoreswork, Float> valorgross;
	public static volatile SingularAttribute<Valoreswork, Float> valornet;
	public static volatile SingularAttribute<Valoreswork, String> situacao;
	public static volatile SingularAttribute<Valoreswork, Float> comissaopremium;
	public static volatile SingularAttribute<Valoreswork, Float> comissaoexpress;
	public static volatile SingularAttribute<Valoreswork, String> programa;
	public static volatile SingularAttribute<Valoreswork, Date> datainicio;
	public static volatile SingularAttribute<Valoreswork, Moedas> moedas;
	public static volatile SingularAttribute<Valoreswork, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Valoreswork, Moedas> moedas1;
	public static volatile SingularAttribute<Valoreswork, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Valoreswork, Fornecedor> fornecedor;
}
