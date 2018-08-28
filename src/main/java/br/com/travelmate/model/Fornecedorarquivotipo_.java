package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.119-0300")
@StaticMetamodel(Fornecedorarquivotipo.class)
public class Fornecedorarquivotipo_ {
	public static volatile SingularAttribute<Fornecedorarquivotipo, Integer> idfornecedorarquivotipo;
	public static volatile SingularAttribute<Fornecedorarquivotipo, String> nome;
	public static volatile SingularAttribute<Fornecedorarquivotipo, Integer> numeroarquivos;
	public static volatile ListAttribute<Fornecedorarquivotipo, Fornecedorarquivo> fornecedorarquivoList;
}
