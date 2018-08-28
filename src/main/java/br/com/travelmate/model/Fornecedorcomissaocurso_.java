package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.125-0300")
@StaticMetamodel(Fornecedorcomissaocurso.class)
public class Fornecedorcomissaocurso_ {
	public static volatile SingularAttribute<Fornecedorcomissaocurso, Integer> idfornecedorcomissao;
	public static volatile SingularAttribute<Fornecedorcomissaocurso, Double> percmatriz;
	public static volatile SingularAttribute<Fornecedorcomissaocurso, Double> percloja;
	public static volatile ListAttribute<Fornecedorcomissaocurso, Fornecedorcomissaocursoproduto> fornecedorcomissaocursoprodutoList;
	public static volatile SingularAttribute<Fornecedorcomissaocurso, Pais> pais;
	public static volatile SingularAttribute<Fornecedorcomissaocurso, Fornecedor> fornecedor;
}
