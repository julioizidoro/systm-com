package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.159-0300")
@StaticMetamodel(Mtp.class)
public class Mtp_ {
	public static volatile SingularAttribute<Mtp, Integer> idmtp;
	public static volatile SingularAttribute<Mtp, Date> data;
	public static volatile SingularAttribute<Mtp, String> host;
	public static volatile SingularAttribute<Mtp, String> hora;
	public static volatile SingularAttribute<Mtp, String> nota;
	public static volatile SingularAttribute<Mtp, String> instituicao;
	public static volatile SingularAttribute<Mtp, Departamento> departamento;
	public static volatile SingularAttribute<Mtp, Pais> pais;
	public static volatile SingularAttribute<Mtp, String> tipo;
	public static volatile SingularAttribute<Mtp, String> nomearquivo;
}
