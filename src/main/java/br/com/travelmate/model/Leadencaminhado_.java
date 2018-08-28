package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.149-0300")
@StaticMetamodel(Leadencaminhado.class)
public class Leadencaminhado_ {
	public static volatile SingularAttribute<Leadencaminhado, Integer> idleadencaminhado;
	public static volatile SingularAttribute<Leadencaminhado, Date> data;
	public static volatile SingularAttribute<Leadencaminhado, String> hora;
	public static volatile SingularAttribute<Leadencaminhado, Lead> lead;
	public static volatile SingularAttribute<Leadencaminhado, Usuario> usuariode;
	public static volatile SingularAttribute<Leadencaminhado, Usuario> usuariopara;
}
