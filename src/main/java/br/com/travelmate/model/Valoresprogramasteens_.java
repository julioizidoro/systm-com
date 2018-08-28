package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.255-0300")
@StaticMetamodel(Valoresprogramasteens.class)
public class Valoresprogramasteens_ {
	public static volatile SingularAttribute<Valoresprogramasteens, Integer> idvaloresprogramasteens;
	public static volatile SingularAttribute<Valoresprogramasteens, String> inicio;
	public static volatile SingularAttribute<Valoresprogramasteens, Float> valornet;
	public static volatile SingularAttribute<Valoresprogramasteens, Float> valorgross;
	public static volatile SingularAttribute<Valoresprogramasteens, Float> comissaoexpress;
	public static volatile SingularAttribute<Valoresprogramasteens, Float> comissaopremium;
	public static volatile SingularAttribute<Valoresprogramasteens, String> situacao;
	public static volatile ListAttribute<Valoresprogramasteens, Programasteens> programasteensList;
	public static volatile SingularAttribute<Valoresprogramasteens, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Valoresprogramasteens, Moedas> moedas;
	public static volatile SingularAttribute<Valoresprogramasteens, Fornecedorcidade> fornecedorcidade;
}
