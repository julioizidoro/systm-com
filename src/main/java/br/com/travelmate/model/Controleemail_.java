package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.072-0300")
@StaticMetamodel(Controleemail.class)
public class Controleemail_ {
	public static volatile SingularAttribute<Controleemail, Integer> idcontroleemail;
	public static volatile SingularAttribute<Controleemail, Date> data;
	public static volatile SingularAttribute<Controleemail, String> hora;
	public static volatile SingularAttribute<Controleemail, String> assunto;
	public static volatile SingularAttribute<Controleemail, String> destinatarios;
	public static volatile SingularAttribute<Controleemail, String> corpo;
	public static volatile SingularAttribute<Controleemail, Usuario> usuario;
}
