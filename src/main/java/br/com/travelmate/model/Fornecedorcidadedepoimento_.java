package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.120-0300")
@StaticMetamodel(Fornecedorcidadedepoimento.class)
public class Fornecedorcidadedepoimento_ {
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, Integer> idfornecedorcidadedepoimento;
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, Date> data;
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, Boolean> apovado;
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, String> texto;
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, Usuario> usuario;
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, Cliente> cliente;
	public static volatile SingularAttribute<Fornecedorcidadedepoimento, Boolean> aceitacontato;
}
