package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.110-0300")
@StaticMetamodel(Faturaajustes.class)
public class Faturaajustes_ {
	public static volatile SingularAttribute<Faturaajustes, Integer> idFaturaajustes;
	public static volatile SingularAttribute<Faturaajustes, String> item;
	public static volatile SingularAttribute<Faturaajustes, Date> datalancamento;
	public static volatile SingularAttribute<Faturaajustes, String> descricao;
	public static volatile SingularAttribute<Faturaajustes, String> creditodebito;
	public static volatile SingularAttribute<Faturaajustes, Float> valor;
	public static volatile SingularAttribute<Faturaajustes, Unidadenegocio> unidadenegocio;
	public static volatile SingularAttribute<Faturaajustes, Usuario> usuario;
	public static volatile SingularAttribute<Faturaajustes, Integer> mes;
	public static volatile SingularAttribute<Faturaajustes, Integer> ano;
	public static volatile ListAttribute<Faturaajustes, Faturafaturaajuste> faturafaturaajusteList;
}
