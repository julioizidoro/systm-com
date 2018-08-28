package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.047-0300")
@StaticMetamodel(Cargo.class)
public class Cargo_ {
	public static volatile SingularAttribute<Cargo, Integer> idcargo;
	public static volatile SingularAttribute<Cargo, String> nome;
	public static volatile ListAttribute<Cargo, Usuario> usuarioList;
}
