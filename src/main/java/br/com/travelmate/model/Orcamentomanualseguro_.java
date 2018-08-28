package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.176-0300")
@StaticMetamodel(Orcamentomanualseguro.class)
public class Orcamentomanualseguro_ {
	public static volatile SingularAttribute<Orcamentomanualseguro, Integer> idorcamentomanualseguro;
	public static volatile SingularAttribute<Orcamentomanualseguro, Date> datainicio;
	public static volatile SingularAttribute<Orcamentomanualseguro, Integer> numerodias;
	public static volatile SingularAttribute<Orcamentomanualseguro, Date> datatermino;
	public static volatile SingularAttribute<Orcamentomanualseguro, Float> valor;
	public static volatile SingularAttribute<Orcamentomanualseguro, Orcamentocurso> orcamentocurso;
	public static volatile SingularAttribute<Orcamentomanualseguro, Valoresseguro> valoresseguro;
	public static volatile SingularAttribute<Orcamentomanualseguro, Boolean> somarvalortotal;
	public static volatile SingularAttribute<Orcamentomanualseguro, Boolean> segurocancelamento;
}
