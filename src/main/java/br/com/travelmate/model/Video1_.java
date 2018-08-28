package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.298-0300")
@StaticMetamodel(Video1.class)
public class Video1_ {
	public static volatile SingularAttribute<Video1, Integer> idvideo1;
	public static volatile SingularAttribute<Video1, String> descricao;
	public static volatile SingularAttribute<Video1, String> host;
	public static volatile SingularAttribute<Video1, Boolean> ativo;
	public static volatile SingularAttribute<Video1, Videopasta1> videopasta1;
	public static volatile SingularAttribute<Video1, String> nome;
	public static volatile SingularAttribute<Video1, Boolean> copiado;
	public static volatile SingularAttribute<Video1, Date> dataupload;
	public static volatile SingularAttribute<Video1, String> hora;
}
