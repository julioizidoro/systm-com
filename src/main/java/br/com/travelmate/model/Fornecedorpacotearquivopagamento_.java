package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.132-0300")
@StaticMetamodel(Fornecedorpacotearquivopagamento.class)
public class Fornecedorpacotearquivopagamento_ {
	public static volatile SingularAttribute<Fornecedorpacotearquivopagamento, Integer> idfornecedorpacotearquivopagamento;
	public static volatile SingularAttribute<Fornecedorpacotearquivopagamento, String> nomearquivo;
	public static volatile SingularAttribute<Fornecedorpacotearquivopagamento, Date> dataanexado;
	public static volatile SingularAttribute<Fornecedorpacotearquivopagamento, String> nomeftp;
	public static volatile SingularAttribute<Fornecedorpacotearquivopagamento, Pacotesfornecedor> pacotesfornecedor;
}
