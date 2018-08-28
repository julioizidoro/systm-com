package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-03T08:57:07.498-0300")
@StaticMetamodel(Lead.class)
public class Lead_ {
	public static volatile SingularAttribute<Lead, Integer> idlead;
	public static volatile SingularAttribute<Lead, Date> dataenvio;
	public static volatile SingularAttribute<Lead, String> horaenvio;
	public static volatile SingularAttribute<Lead, Boolean> jaecliente;
	public static volatile SingularAttribute<Lead, Date> dataultimocontato;
	public static volatile SingularAttribute<Lead, Integer> situacao;
	public static volatile SingularAttribute<Lead, Date> dataproximocontato;
	public static volatile SingularAttribute<Lead, String> horaproximocontato;
	public static volatile SingularAttribute<Lead, String> motivocancelamento;
	public static volatile SingularAttribute<Lead, String> notas;
	public static volatile SingularAttribute<Lead, Cliente> cliente;
	public static volatile SingularAttribute<Lead, Pais> pais;
	public static volatile SingularAttribute<Lead, Produtos> produtos;
	public static volatile SingularAttribute<Lead, Publicidade> publicidade;
	public static volatile SingularAttribute<Lead, Tipocontato> tipocontato;
	public static volatile SingularAttribute<Lead, Unidadenegocio> unidadenegocio;
	public static volatile SingularAttribute<Lead, Usuario> usuario;
	public static volatile SingularAttribute<Lead, Motivocancelamento> motivocancelamento1;
	public static volatile SingularAttribute<Lead, Date> datarecebimento;
	public static volatile SingularAttribute<Lead, String> horarecebimento;
	public static volatile SingularAttribute<Lead, Leadposvenda> leadposvenda;
	public static volatile SingularAttribute<Lead, String> urlclient;
	public static volatile SingularAttribute<Lead, Integer> idcontrole;
	public static volatile SingularAttribute<Lead, String> nomeunidade;
}
