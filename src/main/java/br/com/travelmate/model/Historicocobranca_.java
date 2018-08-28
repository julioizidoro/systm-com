package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.142-0300")
@StaticMetamodel(Historicocobranca.class)
public class Historicocobranca_ {
	public static volatile SingularAttribute<Historicocobranca, Integer> idhistoricocobranca;
	public static volatile SingularAttribute<Historicocobranca, Date> data;
	public static volatile SingularAttribute<Historicocobranca, String> contato;
	public static volatile SingularAttribute<Historicocobranca, String> assunto;
	public static volatile SingularAttribute<Historicocobranca, Usuario> usuario;
	public static volatile SingularAttribute<Historicocobranca, Cobranca> cobranca;
}
