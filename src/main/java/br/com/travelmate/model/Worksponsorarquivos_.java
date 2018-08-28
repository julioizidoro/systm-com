package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.311-0300")
@StaticMetamodel(Worksponsorarquivos.class)
public class Worksponsorarquivos_ {
	public static volatile SingularAttribute<Worksponsorarquivos, Integer> idworksponsorarquivos;
	public static volatile SingularAttribute<Worksponsorarquivos, String> nome;
	public static volatile SingularAttribute<Worksponsorarquivos, String> nomeftp;
	public static volatile SingularAttribute<Worksponsorarquivos, Tipoarquivo> tipoarquivo;
	public static volatile SingularAttribute<Worksponsorarquivos, Worksponsor> worksponsor;
	public static volatile SingularAttribute<Worksponsorarquivos, String> descricao;
}
