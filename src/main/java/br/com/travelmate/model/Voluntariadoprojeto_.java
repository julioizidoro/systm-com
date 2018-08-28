package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.307-0300")
@StaticMetamodel(Voluntariadoprojeto.class)
public class Voluntariadoprojeto_ {
	public static volatile SingularAttribute<Voluntariadoprojeto, Integer> idvoluntariadoprojeto;
	public static volatile SingularAttribute<Voluntariadoprojeto, String> descricao;
	public static volatile SingularAttribute<Voluntariadoprojeto, String> transfer;
	public static volatile ListAttribute<Voluntariadoprojeto, Voluntariadoprojetoacomodacao> voluntariadoprojetoacomodacaoList;
	public static volatile SingularAttribute<Voluntariadoprojeto, Fornecedorcidade> fornecedorcidade;
	public static volatile ListAttribute<Voluntariadoprojeto, Voluntariadoprojetovalor> voluntariadoprojetovalorList;
	public static volatile ListAttribute<Voluntariadoprojeto, Voluntariadoprojetocurso> voluntariadoprojetocursoList;
	public static volatile SingularAttribute<Voluntariadoprojeto, String> diasemanainicial;
	public static volatile SingularAttribute<Voluntariadoprojeto, String> diasemanafinal;
}
