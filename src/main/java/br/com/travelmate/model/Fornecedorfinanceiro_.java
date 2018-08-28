package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.129-0300")
@StaticMetamodel(Fornecedorfinanceiro.class)
public class Fornecedorfinanceiro_ {
	public static volatile SingularAttribute<Fornecedorfinanceiro, Integer> idfornecedorfinanceiro;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> nomebanco;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> numerobanco;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> agencia;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> conta;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> cnpj;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> emailfinanceiro;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> endereco;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> tipoconta;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> swiftcode;
	public static volatile SingularAttribute<Fornecedorfinanceiro, String> produto;
	public static volatile SingularAttribute<Fornecedorfinanceiro, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Fornecedorfinanceiro, Cidade> cidade;
	public static volatile ListAttribute<Fornecedorfinanceiro, Fornecedorfinanceiroproduto> fornecedorfinanceiroprodutoList;
}
