package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.131-0300")
@StaticMetamodel(Fornecedorinformacao.class)
public class Fornecedorinformacao_ {
	public static volatile SingularAttribute<Fornecedorinformacao, Integer> idfornecedorinformacao;
	public static volatile SingularAttribute<Fornecedorinformacao, String> latitude;
	public static volatile SingularAttribute<Fornecedorinformacao, String> longitude;
	public static volatile SingularAttribute<Fornecedorinformacao, String> descricao;
	public static volatile SingularAttribute<Fornecedorinformacao, Fornecedorcidade> fornecedorcidade;
}
