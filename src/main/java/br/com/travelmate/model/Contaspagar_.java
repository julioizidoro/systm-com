package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.064-0300")
@StaticMetamodel(Contaspagar.class)
public class Contaspagar_ {
	public static volatile SingularAttribute<Contaspagar, Integer> idcontaspagar;
	public static volatile SingularAttribute<Contaspagar, Date> dataEmissao;
	public static volatile SingularAttribute<Contaspagar, Date> datavencimento;
	public static volatile SingularAttribute<Contaspagar, String> descricao;
	public static volatile SingularAttribute<Contaspagar, Float> valorsaida;
	public static volatile SingularAttribute<Contaspagar, Float> valorentrada;
	public static volatile SingularAttribute<Contaspagar, String> competencia;
	public static volatile SingularAttribute<Contaspagar, Date> datacompensacao;
	public static volatile SingularAttribute<Contaspagar, Unidadenegocio> unidadenegocio;
	public static volatile SingularAttribute<Contaspagar, Planoconta> planoconta;
	public static volatile SingularAttribute<Contaspagar, Banco> banco;
	public static volatile SingularAttribute<Contaspagar, Integer> idcontasreceber;
	public static volatile SingularAttribute<Contaspagar, String> conciliacao;
}
