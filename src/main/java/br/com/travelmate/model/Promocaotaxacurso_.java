package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.226-0300")
@StaticMetamodel(Promocaotaxacurso.class)
public class Promocaotaxacurso_ {
	public static volatile SingularAttribute<Promocaotaxacurso, Integer> idpromocaotaxacurso;
	public static volatile SingularAttribute<Promocaotaxacurso, Boolean> acomodacaoselecionada;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> datainiciocursoinicial;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> datainiciocursofinal;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> datamatriculaenciadaate;
	public static volatile SingularAttribute<Promocaotaxacurso, Integer> numerosemanasinicial;
	public static volatile SingularAttribute<Promocaotaxacurso, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> dataterminio;
	public static volatile SingularAttribute<Promocaotaxacurso, String> turno;
	public static volatile SingularAttribute<Promocaotaxacurso, Integer> cargahoraria;
	public static volatile SingularAttribute<Promocaotaxacurso, String> tipocargahoraria;
	public static volatile SingularAttribute<Promocaotaxacurso, Float> valorporsemana;
	public static volatile SingularAttribute<Promocaotaxacurso, String> tipodesconto;
	public static volatile SingularAttribute<Promocaotaxacurso, Float> valordesconto;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> datavalidadeinicial;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> datavalidadefinal;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> dataacomodacaoinicial;
	public static volatile SingularAttribute<Promocaotaxacurso, Date> datafinalacomodacao;
	public static volatile SingularAttribute<Promocaotaxacurso, String> codigo;
	public static volatile ListAttribute<Promocaotaxacurso, Promocaotaxacidade> promocaotaxacidadeList;
	public static volatile SingularAttribute<Promocaotaxacurso, Produtosorcamento> produtosorcamento;
}
