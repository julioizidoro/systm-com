package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.132-0300")
@StaticMetamodel(Fornecedorpacotearquivoinvoice.class)
public class Fornecedorpacotearquivoinvoice_ {
	public static volatile SingularAttribute<Fornecedorpacotearquivoinvoice, Integer> idfornecedorpacotearquivoinvoice;
	public static volatile SingularAttribute<Fornecedorpacotearquivoinvoice, String> nomearquivo;
	public static volatile SingularAttribute<Fornecedorpacotearquivoinvoice, Date> dataanexado;
	public static volatile SingularAttribute<Fornecedorpacotearquivoinvoice, String> nomeftp;
	public static volatile SingularAttribute<Fornecedorpacotearquivoinvoice, Pacotesfornecedor> pacotesfornecedor;
}
