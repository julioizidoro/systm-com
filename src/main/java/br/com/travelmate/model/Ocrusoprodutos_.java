package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-03T11:22:32.658-0300")
@StaticMetamodel(Ocrusoprodutos.class)
public class Ocrusoprodutos_ {
	public static volatile SingularAttribute<Ocrusoprodutos, Integer> idocrusoprodutos;
	public static volatile SingularAttribute<Ocrusoprodutos, String> nome;
	public static volatile SingularAttribute<Ocrusoprodutos, String> descricao;
	public static volatile SingularAttribute<Ocrusoprodutos, Integer> tipo;
	public static volatile SingularAttribute<Ocrusoprodutos, String> nomegrupo;
	public static volatile SingularAttribute<Ocrusoprodutos, Double> numerosemanas;
	public static volatile SingularAttribute<Ocrusoprodutos, Float> valorpromocional;
	public static volatile SingularAttribute<Ocrusoprodutos, Float> valororiginal;
	public static volatile SingularAttribute<Ocrusoprodutos, Boolean> possuipromocao;
	public static volatile SingularAttribute<Ocrusoprodutos, String> codigo;
	public static volatile SingularAttribute<Ocrusoprodutos, Ocurso> ocurso;
	public static volatile SingularAttribute<Ocrusoprodutos, Valorcoprodutos> valorcoprodutos;
	public static volatile SingularAttribute<Ocrusoprodutos, Boolean> somavalortotal;
	public static volatile SingularAttribute<Ocrusoprodutos, String> tipoproduto;
}
