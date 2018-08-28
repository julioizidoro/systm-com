package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.310-0300")
@StaticMetamodel(Worksponsor.class)
public class Worksponsor_ {
	public static volatile SingularAttribute<Worksponsor, Integer> idworksponsor;
	public static volatile SingularAttribute<Worksponsor, String> estado;
	public static volatile SingularAttribute<Worksponsor, String> endereco;
	public static volatile SingularAttribute<Worksponsor, String> nomecontato01;
	public static volatile SingularAttribute<Worksponsor, String> emailcontato01;
	public static volatile SingularAttribute<Worksponsor, String> cargocontato01;
	public static volatile SingularAttribute<Worksponsor, String> nomecontato02;
	public static volatile SingularAttribute<Worksponsor, String> emailcontato02;
	public static volatile SingularAttribute<Worksponsor, String> cargocontato02;
	public static volatile SingularAttribute<Worksponsor, String> nomecontato03;
	public static volatile SingularAttribute<Worksponsor, String> emailcontato03;
	public static volatile SingularAttribute<Worksponsor, String> cargocontato03;
	public static volatile SingularAttribute<Worksponsor, String> recrutadora;
	public static volatile SingularAttribute<Worksponsor, String> telefone;
	public static volatile SingularAttribute<Worksponsor, Fornecedorcidade> fornecedorcidade;
	public static volatile ListAttribute<Worksponsor, Worksponsorarquivos> worksponsorarquivosList;
}
