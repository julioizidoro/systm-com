package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.260-0300")
@StaticMetamodel(Vendamotivopendencia.class)
public class Vendamotivopendencia_ {
	public static volatile SingularAttribute<Vendamotivopendencia, Integer> idvendamotivopendencia;
	public static volatile SingularAttribute<Vendamotivopendencia, String> descricao;
	public static volatile ListAttribute<Vendamotivopendencia, Vendapendencia> vendapendenciaList;
}
