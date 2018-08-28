package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.091-0300")
@StaticMetamodel(Credito.class)
public class Credito_ {
	public static volatile SingularAttribute<Credito, Integer> idcredito;
	public static volatile SingularAttribute<Credito, String> tipocredito;
	public static volatile SingularAttribute<Credito, Float> valorcredito;
	public static volatile SingularAttribute<Credito, Date> datautilizacao;
	public static volatile SingularAttribute<Credito, Usuario> usuario;
	public static volatile SingularAttribute<Credito, Cliente> cliente;
}
