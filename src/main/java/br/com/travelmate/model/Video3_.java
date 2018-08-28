package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.300-0300")
@StaticMetamodel(Video3.class)
public class Video3_ {
	public static volatile SingularAttribute<Video3, Integer> idvideo3;
	public static volatile SingularAttribute<Video3, String> descricao;
	public static volatile SingularAttribute<Video3, String> host;
	public static volatile SingularAttribute<Video3, Boolean> ativo;
	public static volatile SingularAttribute<Video3, Videopasta1> videopasta1;
	public static volatile SingularAttribute<Video3, Videopasta2> videopasta2;
	public static volatile SingularAttribute<Video3, Videopasta3> videopasta3;
	public static volatile SingularAttribute<Video3, String> nome;
	public static volatile SingularAttribute<Video3, Boolean> copiado;
	public static volatile SingularAttribute<Video3, Date> dataupload;
	public static volatile SingularAttribute<Video3, String> hora;
}
