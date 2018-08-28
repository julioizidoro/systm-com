package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.135-0300")
@StaticMetamodel(Funcao.class)
public class Funcao_ {
	public static volatile SingularAttribute<Funcao, Integer> idfuncao;
	public static volatile SingularAttribute<Funcao, String> descricao;
	public static volatile SingularAttribute<Funcao, String> skype;
	public static volatile SingularAttribute<Funcao, String> whatsapp;
	public static volatile SingularAttribute<Funcao, Usuario> usuario;
}
