package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.233-0300")
@StaticMetamodel(Retornoarquivo.class)
public class Retornoarquivo_ {
	public static volatile SingularAttribute<Retornoarquivo, Integer> idretornoarquivo;
	public static volatile SingularAttribute<Retornoarquivo, Date> dataretorno;
	public static volatile SingularAttribute<Retornoarquivo, String> nomeaquivo;
	public static volatile SingularAttribute<Retornoarquivo, Usuario> usuario;
	public static volatile ListAttribute<Retornoarquivo, Retornocontas> retornocontasList;
}
