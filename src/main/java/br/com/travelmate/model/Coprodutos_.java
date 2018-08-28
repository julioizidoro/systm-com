package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.086-0300")
@StaticMetamodel(Coprodutos.class)
public class Coprodutos_ {
	public static volatile SingularAttribute<Coprodutos, Integer> idcoprodutos;
	public static volatile SingularAttribute<Coprodutos, String> tipo;
	public static volatile SingularAttribute<Coprodutos, String> descricao;
	public static volatile SingularAttribute<Coprodutos, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Coprodutos, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Coprodutos, Fornecedorcidadeidioma> fornecedorcidadeidioma;
	public static volatile SingularAttribute<Coprodutos, String> nome;
	public static volatile SingularAttribute<Coprodutos, String> turno;
	public static volatile SingularAttribute<Coprodutos, Boolean> pacote;
	public static volatile SingularAttribute<Coprodutos, Boolean> acomodacao;
	public static volatile SingularAttribute<Coprodutos, Boolean> transfer;
	public static volatile SingularAttribute<Coprodutos, Boolean> situacao;
	public static volatile SingularAttribute<Coprodutos, Boolean> suplementemenoridade;
	public static volatile SingularAttribute<Coprodutos, Boolean> apenaspacote;
	public static volatile SingularAttribute<Coprodutos, Integer> idade;
	public static volatile SingularAttribute<Coprodutos, String> advertencia;
	public static volatile SingularAttribute<Coprodutos, String> advertenciaseguro;
	public static volatile SingularAttribute<Coprodutos, Complementoacomodacao> complementoacomodacao;
	public static volatile SingularAttribute<Coprodutos, Complementocurso> complementocurso;
	public static volatile SingularAttribute<Coprodutos, Complementoacomodacaodiasemana> complementoacomodacaodiasemana;
}
