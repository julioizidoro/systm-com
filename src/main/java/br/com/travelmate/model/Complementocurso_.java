package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-23T08:36:46.394-0300")
@StaticMetamodel(Complementocurso.class)
public class Complementocurso_ {
	public static volatile SingularAttribute<Complementocurso, Integer> idcomplementocurso;
	public static volatile SingularAttribute<Complementocurso, String> cargahoraria;
	public static volatile SingularAttribute<Complementocurso, String> tipocargahoraria;
	public static volatile SingularAttribute<Complementocurso, String> turno;
	public static volatile SingularAttribute<Complementocurso, Coprodutos> coprodutos;
	public static volatile SingularAttribute<Complementocurso, String> descricao;
}
