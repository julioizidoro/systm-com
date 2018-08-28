package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.223-0300")
@StaticMetamodel(Promocaocurso.class)
public class Promocaocurso_ {
	public static volatile SingularAttribute<Promocaocurso, Integer> idpromoacaocurso;
	public static volatile SingularAttribute<Promocaocurso, Date> datavalidadeinicial;
	public static volatile SingularAttribute<Promocaocurso, Date> datavalidadefinal;
	public static volatile SingularAttribute<Promocaocurso, Date> datainicioiniciocurso;
	public static volatile SingularAttribute<Promocaocurso, Date> datainicioterminiocurso;
	public static volatile SingularAttribute<Promocaocurso, Date> datainicioacomodacao;
	public static volatile SingularAttribute<Promocaocurso, Date> dataterminioacodomodacao;
	public static volatile SingularAttribute<Promocaocurso, Date> datamatricula;
	public static volatile SingularAttribute<Promocaocurso, Boolean> acomodacaoescola;
	public static volatile SingularAttribute<Promocaocurso, String> turno;
	public static volatile SingularAttribute<Promocaocurso, Integer> cargahoraria;
	public static volatile SingularAttribute<Promocaocurso, String> tipocargahoraria;
	public static volatile SingularAttribute<Promocaocurso, Integer> numerosemanainicio;
	public static volatile SingularAttribute<Promocaocurso, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Promocaocurso, Float> valorsemanaacima;
	public static volatile SingularAttribute<Promocaocurso, Float> valorsemanaigual;
	public static volatile SingularAttribute<Promocaocurso, Float> valormaximodesconto;
	public static volatile SingularAttribute<Promocaocurso, Date> dataterminocurso;
	public static volatile SingularAttribute<Promocaocurso, String> tipodesconto;
	public static volatile SingularAttribute<Promocaocurso, Float> valorsemana;
	public static volatile SingularAttribute<Promocaocurso, Float> valortotal;
	public static volatile SingularAttribute<Promocaocurso, String> codigo;
	public static volatile SingularAttribute<Promocaocurso, Boolean> acumulapromocao;
	public static volatile ListAttribute<Promocaocurso, Promocaocursocidade> promocaocursocidadeList;
}
