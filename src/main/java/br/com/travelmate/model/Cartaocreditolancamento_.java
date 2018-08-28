package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.049-0300")
@StaticMetamodel(Cartaocreditolancamento.class)
public class Cartaocreditolancamento_ {
	public static volatile SingularAttribute<Cartaocreditolancamento, Integer> idcartaocreditolancamento;
	public static volatile SingularAttribute<Cartaocreditolancamento, Date> data;
	public static volatile SingularAttribute<Cartaocreditolancamento, String> descricao;
	public static volatile SingularAttribute<Cartaocreditolancamento, Float> valorinformado;
	public static volatile SingularAttribute<Cartaocreditolancamento, Float> valorlancado;
	public static volatile SingularAttribute<Cartaocreditolancamento, Float> valorcambio;
	public static volatile SingularAttribute<Cartaocreditolancamento, String> observacao;
	public static volatile SingularAttribute<Cartaocreditolancamento, Boolean> conferido;
	public static volatile SingularAttribute<Cartaocreditolancamento, Boolean> lancado;
	public static volatile SingularAttribute<Cartaocreditolancamento, Usuario> usuario;
	public static volatile SingularAttribute<Cartaocreditolancamento, Planoconta> planoconta;
	public static volatile SingularAttribute<Cartaocreditolancamento, Moedas> moedas;
	public static volatile SingularAttribute<Cartaocreditolancamento, Cartaocredito> cartaocredito;
	public static volatile SingularAttribute<Cartaocreditolancamento, String> estabelecimento;
	public static volatile SingularAttribute<Cartaocreditolancamento, String> numeroparcelas;
	public static volatile SingularAttribute<Cartaocreditolancamento, Boolean> valorrecorrente;
	public static volatile SingularAttribute<Cartaocreditolancamento, Boolean> habilitarmoeda;
	public static volatile ListAttribute<Cartaocreditolancamento, Cartaocreditolancamentocontas> cartaocreditolancamentocontasList;
}
