package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.220-0300")
@StaticMetamodel(Promocaoacomodacao.class)
public class Promocaoacomodacao_ {
	public static volatile SingularAttribute<Promocaoacomodacao, Integer> idpromoacaoacomodacao;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> datavalidadeinicial;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> datavalidadefinal;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> datainicioiniciocurso;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> datainicioterminiocurso;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> datainicioacomodacao;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> dataterminioacodomodacao;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> datamatricula;
	public static volatile SingularAttribute<Promocaoacomodacao, Boolean> acomodacaoescola;
	public static volatile SingularAttribute<Promocaoacomodacao, String> tipoacomodacao;
	public static volatile SingularAttribute<Promocaoacomodacao, Integer> numerosemanainicio;
	public static volatile SingularAttribute<Promocaoacomodacao, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Promocaoacomodacao, Float> valorsemanaacima;
	public static volatile SingularAttribute<Promocaoacomodacao, Float> valorsemanaigual;
	public static volatile SingularAttribute<Promocaoacomodacao, Float> valormaximodesconto;
	public static volatile SingularAttribute<Promocaoacomodacao, String> tipodesconto;
	public static volatile SingularAttribute<Promocaoacomodacao, Float> valorsemana;
	public static volatile SingularAttribute<Promocaoacomodacao, Float> valortotal;
	public static volatile SingularAttribute<Promocaoacomodacao, String> tipoquarto;
	public static volatile SingularAttribute<Promocaoacomodacao, String> tiporefeicao;
	public static volatile SingularAttribute<Promocaoacomodacao, String> tipobanheiro;
	public static volatile SingularAttribute<Promocaoacomodacao, String> codigo;
	public static volatile ListAttribute<Promocaoacomodacao, Promocaoacomodacaocidade> promocaoacomodacaocidadeList;
	public static volatile SingularAttribute<Promocaoacomodacao, Date> dataterminocurso;
}
