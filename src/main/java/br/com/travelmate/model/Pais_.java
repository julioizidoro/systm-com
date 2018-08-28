package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-06-15T12:21:00.234-0300")
@StaticMetamodel(Pais.class)
public class Pais_ {
	public static volatile SingularAttribute<Pais, Integer> idpais;
	public static volatile SingularAttribute<Pais, String> nome;
	public static volatile SingularAttribute<Pais, String> sigla;
	public static volatile SingularAttribute<Pais, Moedas> moedas;
	public static volatile SingularAttribute<Pais, Moedas> moedasVolutariado;
	public static volatile SingularAttribute<Pais, String> texto;
	public static volatile SingularAttribute<Pais, String> documentovisto;
	public static volatile ListAttribute<Pais, Paisproduto> paisprodutoList;
	public static volatile ListAttribute<Pais, Cidade> cidadeList;
	public static volatile SingularAttribute<Pais, Integer> modelo;
}
