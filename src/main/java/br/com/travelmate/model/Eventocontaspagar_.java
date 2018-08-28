package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.106-0300")
@StaticMetamodel(Eventocontaspagar.class)
public class Eventocontaspagar_ {
	public static volatile SingularAttribute<Eventocontaspagar, Integer> ideventocontaspagar;
	public static volatile SingularAttribute<Eventocontaspagar, String> tipoevento;
	public static volatile SingularAttribute<Eventocontaspagar, Date> data;
	public static volatile SingularAttribute<Eventocontaspagar, String> hora;
	public static volatile SingularAttribute<Eventocontaspagar, Contaspagar> contaspagar;
	public static volatile SingularAttribute<Eventocontaspagar, Usuario> usuario;
}
