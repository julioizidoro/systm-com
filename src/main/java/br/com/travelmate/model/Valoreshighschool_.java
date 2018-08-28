package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.255-0300")
@StaticMetamodel(Valoreshighschool.class)
public class Valoreshighschool_ {
	public static volatile SingularAttribute<Valoreshighschool, Integer> idvaloresHighSchool;
	public static volatile SingularAttribute<Valoreshighschool, String> duracao;
	public static volatile SingularAttribute<Valoreshighschool, String> inicio;
	public static volatile SingularAttribute<Valoreshighschool, Float> valorgross;
	public static volatile SingularAttribute<Valoreshighschool, Float> valornet;
	public static volatile SingularAttribute<Valoreshighschool, String> situacao;
	public static volatile SingularAttribute<Valoreshighschool, Float> comissaopremium;
	public static volatile SingularAttribute<Valoreshighschool, Float> comissaoexpress;
	public static volatile ListAttribute<Valoreshighschool, Highschool> highschoolList;
	public static volatile SingularAttribute<Valoreshighschool, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Valoreshighschool, Moedas> moedas;
	public static volatile SingularAttribute<Valoreshighschool, Moedas> moedas1;
	public static volatile SingularAttribute<Valoreshighschool, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Valoreshighschool, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Valoreshighschool, Date> datainicio;
	public static volatile SingularAttribute<Valoreshighschool, Date> datavalidade;
	public static volatile SingularAttribute<Valoreshighschool, String> anoinicio;
}
