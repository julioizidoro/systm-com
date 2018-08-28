package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.230-0300")
@StaticMetamodel(Regravenda.class)
public class Regravenda_ {
	public static volatile SingularAttribute<Regravenda, Integer> idregravenda;
	public static volatile SingularAttribute<Regravenda, Float> valorinicial;
	public static volatile SingularAttribute<Regravenda, Float> valorfinal;
	public static volatile SingularAttribute<Regravenda, Integer> numerosemanasinicial;
	public static volatile SingularAttribute<Regravenda, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Regravenda, String> programa;
	public static volatile SingularAttribute<Regravenda, Integer> pais;
	public static volatile SingularAttribute<Regravenda, Integer> fornecedor;
	public static volatile SingularAttribute<Regravenda, Integer> cidade;
	public static volatile SingularAttribute<Regravenda, Boolean> situacao;
	public static volatile SingularAttribute<Regravenda, Integer> ponto;
	public static volatile SingularAttribute<Regravenda, Boolean> escola;
	public static volatile SingularAttribute<Regravenda, Integer> pontomais;
	public static volatile SingularAttribute<Regravenda, Integer> pontomenos;
	public static volatile SingularAttribute<Regravenda, Produtos> produtos;
	public static volatile ListAttribute<Regravenda, Pontuacaovendas> pontuacaovendasList;
}
