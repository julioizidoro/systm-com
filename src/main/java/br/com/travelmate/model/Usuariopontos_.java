package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.250-0300")
@StaticMetamodel(Usuariopontos.class)
public class Usuariopontos_ {
	public static volatile SingularAttribute<Usuariopontos, Integer> idusuariopontos;
	public static volatile SingularAttribute<Usuariopontos, Integer> mes;
	public static volatile SingularAttribute<Usuariopontos, Integer> ano;
	public static volatile SingularAttribute<Usuariopontos, Integer> pontos;
	public static volatile SingularAttribute<Usuariopontos, Integer> pontoescola;
	public static volatile SingularAttribute<Usuariopontos, Integer> totalpontos;
	public static volatile SingularAttribute<Usuariopontos, Usuario> usuario;
	public static volatile ListAttribute<Usuariopontos, Pontuacaovendas> pontuacaovendasList;
}
