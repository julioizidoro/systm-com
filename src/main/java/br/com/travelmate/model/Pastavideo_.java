package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.211-0300")
@StaticMetamodel(Pastavideo.class)
public class Pastavideo_ {
	public static volatile SingularAttribute<Pastavideo, Integer> idpastavideo;
	public static volatile SingularAttribute<Pastavideo, String> nome;
	public static volatile ListAttribute<Pastavideo, Video> videoList;
}
