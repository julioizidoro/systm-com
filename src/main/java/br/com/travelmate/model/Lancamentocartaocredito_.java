package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-09T10:00:11.919-0300")
@StaticMetamodel(Lancamentocartaocredito.class)
public class Lancamentocartaocredito_ {
	public static volatile SingularAttribute<Lancamentocartaocredito, Integer> idlancamentocartaocredito;
	public static volatile SingularAttribute<Lancamentocartaocredito, Date> datainclusao;
	public static volatile SingularAttribute<Lancamentocartaocredito, Date> datalancamento;
	public static volatile SingularAttribute<Lancamentocartaocredito, Usuario> usuario;
	public static volatile SingularAttribute<Lancamentocartaocredito, Vendas> vendas;
	public static volatile SingularAttribute<Lancamentocartaocredito, Boolean> lancado;
	public static volatile SingularAttribute<Lancamentocartaocredito, Date> dataproximocontato;
}
