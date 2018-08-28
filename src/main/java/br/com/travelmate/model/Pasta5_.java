package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.210-0300")
@StaticMetamodel(Pasta5.class)
public class Pasta5_ {
	public static volatile SingularAttribute<Pasta5, Integer> idpasta5;
	public static volatile SingularAttribute<Pasta5, String> nome;
	public static volatile ListAttribute<Pasta5, Arquivo5> arquivo5List;
	public static volatile SingularAttribute<Pasta5, Pasta4> pasta4;
	public static volatile SingularAttribute<Pasta5, Pasta1> pasta1;
	public static volatile SingularAttribute<Pasta5, Pasta2> pasta2;
	public static volatile SingularAttribute<Pasta5, Pasta3> pasta3;
	public static volatile SingularAttribute<Pasta5, Boolean> restrito;
}
