package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.261-0300")
@StaticMetamodel(Vendapendenciahistorico.class)
public class Vendapendenciahistorico_ {
	public static volatile SingularAttribute<Vendapendenciahistorico, Integer> idvendapendenciahistorico;
	public static volatile SingularAttribute<Vendapendenciahistorico, Date> datahistorico;
	public static volatile SingularAttribute<Vendapendenciahistorico, String> contato;
	public static volatile SingularAttribute<Vendapendenciahistorico, String> assunto;
	public static volatile SingularAttribute<Vendapendenciahistorico, Vendapendencia> vendapendencia;
	public static volatile SingularAttribute<Vendapendenciahistorico, Usuario> usuario;
}
