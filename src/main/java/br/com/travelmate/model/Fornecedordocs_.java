package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.127-0300")
@StaticMetamodel(Fornecedordocs.class)
public class Fornecedordocs_ {
	public static volatile SingularAttribute<Fornecedordocs, Integer> idfornecedordocs;
	public static volatile SingularAttribute<Fornecedordocs, String> nome;
	public static volatile SingularAttribute<Fornecedordocs, String> tipo;
	public static volatile SingularAttribute<Fornecedordocs, String> nomeftp;
	public static volatile SingularAttribute<Fornecedordocs, Date> datavalidade;
	public static volatile SingularAttribute<Fornecedordocs, Date> datainicio;
	public static volatile SingularAttribute<Fornecedordocs, Boolean> restrito;
	public static volatile SingularAttribute<Fornecedordocs, String> descricao;
	public static volatile SingularAttribute<Fornecedordocs, Fornecedor> fornecedor;
	public static volatile ListAttribute<Fornecedordocs, Fornecedorcidadedocs> fornecedorcidadedocsList;
	public static volatile SingularAttribute<Fornecedordocs, Date> dataupload;
	public static volatile SingularAttribute<Fornecedordocs, String> hora;
}
