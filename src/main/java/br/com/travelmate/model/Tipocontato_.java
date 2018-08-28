package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.239-0300")
@StaticMetamodel(Tipocontato.class)
public class Tipocontato_ {
	public static volatile SingularAttribute<Tipocontato, Integer> idtipocontato;
	public static volatile SingularAttribute<Tipocontato, String> tipo;
	public static volatile ListAttribute<Tipocontato, Leadhistorico> leadhistoricoList;
	public static volatile ListAttribute<Tipocontato, Lead> leadList;
}
