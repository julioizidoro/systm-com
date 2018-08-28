package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.153-0300")
@StaticMetamodel(Logvenda.class)
public class Logvenda_ {
	public static volatile SingularAttribute<Logvenda, Integer> idlogvenda;
	public static volatile SingularAttribute<Logvenda, Date> data;
	public static volatile SingularAttribute<Logvenda, String> hora;
	public static volatile SingularAttribute<Logvenda, String> situacao;
	public static volatile SingularAttribute<Logvenda, String> operacao;
	public static volatile SingularAttribute<Logvenda, Vendas> vendas;
	public static volatile SingularAttribute<Logvenda, Usuario> usuario;
}
