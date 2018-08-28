package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.243-0300")
@StaticMetamodel(Treinamentoacesso.class)
public class Treinamentoacesso_ {
	public static volatile SingularAttribute<Treinamentoacesso, Integer> idtreinamentoacesso;
	public static volatile SingularAttribute<Treinamentoacesso, Date> data;
	public static volatile SingularAttribute<Treinamentoacesso, String> hora;
	public static volatile SingularAttribute<Treinamentoacesso, Mtp> mtp;
	public static volatile SingularAttribute<Treinamentoacesso, Usuario> usuario;
}
