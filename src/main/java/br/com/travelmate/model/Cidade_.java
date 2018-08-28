package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.051-0300")
@StaticMetamodel(Cidade.class)
public class Cidade_ {
	public static volatile SingularAttribute<Cidade, Integer> idcidade;
	public static volatile SingularAttribute<Cidade, String> nome;
	public static volatile SingularAttribute<Cidade, Boolean> ativa;
	public static volatile SingularAttribute<Cidade, Boolean> acomodacaoindepentende;
	public static volatile SingularAttribute<Cidade, Pais> pais;
	public static volatile ListAttribute<Cidade, Cidadepaisproduto> cidadepaisList;
}
