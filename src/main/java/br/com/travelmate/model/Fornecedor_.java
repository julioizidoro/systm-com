package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.118-0300")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ {
	public static volatile SingularAttribute<Fornecedor, Integer> idfornecedor;
	public static volatile SingularAttribute<Fornecedor, String> nome;
	public static volatile SingularAttribute<Fornecedor, String> logo;
	public static volatile SingularAttribute<Fornecedor, Boolean> habilitarorcamento;
	public static volatile SingularAttribute<Fornecedor, String> site;
	public static volatile SingularAttribute<Fornecedor, Integer> anotarifario;
	public static volatile SingularAttribute<Fornecedor, Integer> anotarifariocurso;
	public static volatile SingularAttribute<Fornecedor, Fornecedorfinanceiro> fornecedorfinanceiro;
}
