package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.150-0300")
@StaticMetamodel(Leadhistorico.class)
public class Leadhistorico_ {
	public static volatile SingularAttribute<Leadhistorico, Integer> idleadhistorico;
	public static volatile SingularAttribute<Leadhistorico, Date> datahistorico;
	public static volatile SingularAttribute<Leadhistorico, String> historico;
	public static volatile SingularAttribute<Leadhistorico, Date> dataproximocontato;
	public static volatile SingularAttribute<Leadhistorico, String> horaporximocontato;
	public static volatile SingularAttribute<Leadhistorico, String> tipoorcamento;
	public static volatile SingularAttribute<Leadhistorico, Integer> idorcamento;
	public static volatile SingularAttribute<Leadhistorico, Cliente> cliente;
	public static volatile SingularAttribute<Leadhistorico, Tipocontato> tipocontato;
}
