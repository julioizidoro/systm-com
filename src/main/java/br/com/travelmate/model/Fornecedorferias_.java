package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.128-0300")
@StaticMetamodel(Fornecedorferias.class)
public class Fornecedorferias_ {
	public static volatile SingularAttribute<Fornecedorferias, Integer> idfornecedorferias;
	public static volatile SingularAttribute<Fornecedorferias, Date> datainicial;
	public static volatile SingularAttribute<Fornecedorferias, Date> datafinal;
	public static volatile SingularAttribute<Fornecedorferias, Integer> numerodias;
	public static volatile SingularAttribute<Fornecedorferias, Fornecedorcidade> fornecedorcidade;
}
