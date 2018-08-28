package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.118-0300")
@StaticMetamodel(Fornecedorarquivo.class)
public class Fornecedorarquivo_ {
	public static volatile SingularAttribute<Fornecedorarquivo, Integer> idfornecedorarquivo;
	public static volatile SingularAttribute<Fornecedorarquivo, String> nomearquivo;
	public static volatile SingularAttribute<Fornecedorarquivo, Date> datavalidade;
	public static volatile SingularAttribute<Fornecedorarquivo, Fornecedorarquivotipo> fornecedorarquivotipo;
	public static volatile SingularAttribute<Fornecedorarquivo, Fornecedorcidade> fornecedorcidade;
}
