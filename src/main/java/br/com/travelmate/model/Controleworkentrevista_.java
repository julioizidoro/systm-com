package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.084-0300")
@StaticMetamodel(Controleworkentrevista.class)
public class Controleworkentrevista_ {
	public static volatile SingularAttribute<Controleworkentrevista, Integer> idcontroleworkentrevista;
	public static volatile SingularAttribute<Controleworkentrevista, String> situacaoempreagador;
	public static volatile SingularAttribute<Controleworkentrevista, String> situacaosponsor;
	public static volatile SingularAttribute<Controleworkentrevista, Date> data;
	public static volatile SingularAttribute<Controleworkentrevista, String> hora;
	public static volatile SingularAttribute<Controleworkentrevista, Controlework> controlework;
	public static volatile SingularAttribute<Controleworkentrevista, Workempregador> workempregador;
	public static volatile SingularAttribute<Controleworkentrevista, Worksponsor> worksponsor;
}
