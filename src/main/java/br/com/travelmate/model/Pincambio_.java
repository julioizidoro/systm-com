package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.212-0300")
@StaticMetamodel(Pincambio.class)
public class Pincambio_ {
	public static volatile SingularAttribute<Pincambio, Integer> idpinCambio;
	public static volatile SingularAttribute<Pincambio, Integer> consultor;
	public static volatile SingularAttribute<Pincambio, Date> dataEmissao;
	public static volatile SingularAttribute<Pincambio, Date> horaValidade;
	public static volatile SingularAttribute<Pincambio, String> numero;
	public static volatile SingularAttribute<Pincambio, String> utilizado;
	public static volatile SingularAttribute<Pincambio, Usuario> usuario;
}
