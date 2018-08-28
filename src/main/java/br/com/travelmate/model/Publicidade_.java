package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-12T11:23:36.787-0300")
@StaticMetamodel(Publicidade.class)
public class Publicidade_ {
	public static volatile SingularAttribute<Publicidade, Integer> idpublicidade;
	public static volatile SingularAttribute<Publicidade, String> descricao;
	public static volatile ListAttribute<Publicidade, Cliente> clienteList;
	public static volatile SingularAttribute<Publicidade, Boolean> situacao;
	public static volatile SingularAttribute<Publicidade, Boolean> mostrar;
}
