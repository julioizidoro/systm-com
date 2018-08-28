package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.296-0300")
@StaticMetamodel(Versoes.class)
public class Versoes_ {
	public static volatile SingularAttribute<Versoes, Integer> idversoes;
	public static volatile SingularAttribute<Versoes, Date> data;
	public static volatile SingularAttribute<Versoes, String> descricao;
	public static volatile SingularAttribute<Versoes, String> modulo;
	public static volatile SingularAttribute<Versoes, Usuario> usuario;
}
