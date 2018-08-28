package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.251-0300")
@StaticMetamodel(Valorcoprodutos.class)
public class Valorcoprodutos_ {
	public static volatile SingularAttribute<Valorcoprodutos, Integer> idvalorcoprodutos;
	public static volatile SingularAttribute<Valorcoprodutos, String> tipodata;
	public static volatile SingularAttribute<Valorcoprodutos, Date> datainicial;
	public static volatile SingularAttribute<Valorcoprodutos, Date> datafinal;
	public static volatile SingularAttribute<Valorcoprodutos, Integer> numerosemanainicial;
	public static volatile SingularAttribute<Valorcoprodutos, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Valorcoprodutos, Float> valororiginal;
	public static volatile SingularAttribute<Valorcoprodutos, Float> valorpromocional;
	public static volatile SingularAttribute<Valorcoprodutos, Boolean> promocional;
	public static volatile SingularAttribute<Valorcoprodutos, String> cobranca;
	public static volatile SingularAttribute<Valorcoprodutos, Coprodutos> coprodutos;
	public static volatile SingularAttribute<Valorcoprodutos, String> produtosuplemento;
	public static volatile SingularAttribute<Valorcoprodutos, String> tiposuplemento;
	public static volatile SingularAttribute<Valorcoprodutos, Integer> ano;
	public static volatile SingularAttribute<Valorcoprodutos, Boolean> datalimite;
	public static volatile SingularAttribute<Valorcoprodutos, String> tipovisto;
}
