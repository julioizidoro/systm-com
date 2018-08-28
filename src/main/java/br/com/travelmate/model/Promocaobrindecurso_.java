package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.222-0300")
@StaticMetamodel(Promocaobrindecurso.class)
public class Promocaobrindecurso_ {
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> idpromocaobrindecurso;
	public static volatile SingularAttribute<Promocaobrindecurso, Date> datavalidadeinicial;
	public static volatile SingularAttribute<Promocaobrindecurso, Date> datavalidadefinal;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> numerosemanainicial;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Promocaobrindecurso, Date> datamatricula;
	public static volatile SingularAttribute<Promocaobrindecurso, Date> dataacomodacaoinicial;
	public static volatile SingularAttribute<Promocaobrindecurso, Date> dataacomodacaofinal;
	public static volatile SingularAttribute<Promocaobrindecurso, Float> valorporsemana;
	public static volatile SingularAttribute<Promocaobrindecurso, String> turno;
	public static volatile SingularAttribute<Promocaobrindecurso, Date> datainicio;
	public static volatile SingularAttribute<Promocaobrindecurso, Date> datafinal;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> numerosemanacurso;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> numerosemanaacomodacao;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> ganhasemana;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> ganhadescontosemana;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> ganhadescontosemanaacomodacao;
	public static volatile SingularAttribute<Promocaobrindecurso, String> ganhadescricao;
	public static volatile SingularAttribute<Promocaobrindecurso, Integer> cargahoraria;
	public static volatile SingularAttribute<Promocaobrindecurso, String> tipocargahoraria;
	public static volatile SingularAttribute<Promocaobrindecurso, String> codigo;
	public static volatile ListAttribute<Promocaobrindecurso, Promocaobrindecursocidade> promocaobrindecursocidadeList;
}
