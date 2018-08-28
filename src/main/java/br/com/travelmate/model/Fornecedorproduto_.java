package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.134-0300")
@StaticMetamodel(Fornecedorproduto.class)
public class Fornecedorproduto_ {
	public static volatile SingularAttribute<Fornecedorproduto, Integer> idfornecedorProduto;
	public static volatile SingularAttribute<Fornecedorproduto, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Fornecedorproduto, Produtos> produtos;
}
