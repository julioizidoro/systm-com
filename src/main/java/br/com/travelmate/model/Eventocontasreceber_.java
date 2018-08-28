package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.107-0300")
@StaticMetamodel(Eventocontasreceber.class)
public class Eventocontasreceber_ {
	public static volatile SingularAttribute<Eventocontasreceber, Integer> ideventoscontasreceber;
	public static volatile SingularAttribute<Eventocontasreceber, String> tipoevento;
	public static volatile SingularAttribute<Eventocontasreceber, Date> data;
	public static volatile SingularAttribute<Eventocontasreceber, String> hora;
	public static volatile SingularAttribute<Eventocontasreceber, Contasreceber> contasreceber;
	public static volatile SingularAttribute<Eventocontasreceber, Usuario> usuario;
}
