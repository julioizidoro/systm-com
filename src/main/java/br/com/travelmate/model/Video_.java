package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.297-0300")
@StaticMetamodel(Video.class)
public class Video_ {
	public static volatile SingularAttribute<Video, Integer> idvideo;
	public static volatile SingularAttribute<Video, String> nome;
	public static volatile SingularAttribute<Video, String> descricao;
	public static volatile SingularAttribute<Video, String> url;
	public static volatile SingularAttribute<Video, Pastavideo> pastavideo;
}
