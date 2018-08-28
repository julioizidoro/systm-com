package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.082-0300")
@StaticMetamodel(Controleworkembarque.class)
public class Controleworkembarque_ {
	public static volatile SingularAttribute<Controleworkembarque, Integer> idcontroleworkembarque;
	public static volatile SingularAttribute<Controleworkembarque, String> ciaaerea;
	public static volatile SingularAttribute<Controleworkembarque, String> aeroportochegada;
	public static volatile SingularAttribute<Controleworkembarque, String> numerovoo;
	public static volatile SingularAttribute<Controleworkembarque, String> horachegada;
	public static volatile SingularAttribute<Controleworkembarque, Date> dataembarque;
	public static volatile SingularAttribute<Controleworkembarque, Date> datachegada;
	public static volatile SingularAttribute<Controleworkembarque, Date> dataretorno;
	public static volatile SingularAttribute<Controleworkembarque, Date> dataembarqueinicial;
	public static volatile SingularAttribute<Controleworkembarque, Date> dataembarquefinal;
	public static volatile SingularAttribute<Controleworkembarque, Date> dataretornoinicial;
	public static volatile SingularAttribute<Controleworkembarque, Date> dataretornofinal;
	public static volatile SingularAttribute<Controleworkembarque, String> situacaovisto;
	public static volatile SingularAttribute<Controleworkembarque, Date> datavisto;
	public static volatile SingularAttribute<Controleworkembarque, String> sevis;
	public static volatile SingularAttribute<Controleworkembarque, Controlework> controlework;
}
