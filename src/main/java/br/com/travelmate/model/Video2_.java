package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.299-0300")
@StaticMetamodel(Video2.class)
public class Video2_ {
	public static volatile SingularAttribute<Video2, Integer> idvideo2;
	public static volatile SingularAttribute<Video2, String> descricao;
	public static volatile SingularAttribute<Video2, String> host;
	public static volatile SingularAttribute<Video2, Boolean> ativo;
	public static volatile SingularAttribute<Video2, Videopasta1> videopasta1;
	public static volatile SingularAttribute<Video2, Videopasta2> videopasta2;
	public static volatile SingularAttribute<Video2, String> nome;
	public static volatile SingularAttribute<Video2, Boolean> copiado;
	public static volatile SingularAttribute<Video2, Date> dataupload;
	public static volatile SingularAttribute<Video2, String> hora;
}
