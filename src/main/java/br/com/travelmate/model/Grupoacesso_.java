package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.136-0300")
@StaticMetamodel(Grupoacesso.class)
public class Grupoacesso_ {
	public static volatile SingularAttribute<Grupoacesso, Integer> idgrupoAcesso;
	public static volatile SingularAttribute<Grupoacesso, String> descricao;
	public static volatile SingularAttribute<Grupoacesso, Acesso> acesso;
	public static volatile ListAttribute<Grupoacesso, Usuario> usuarioList;
}
