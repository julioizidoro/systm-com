package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.040-0300")
@StaticMetamodel(Banco.class)
public class Banco_ {
	public static volatile SingularAttribute<Banco, Integer> idbanco;
	public static volatile SingularAttribute<Banco, String> numero;
	public static volatile SingularAttribute<Banco, String> nome;
	public static volatile SingularAttribute<Banco, String> agencia;
	public static volatile SingularAttribute<Banco, String> conta;
	public static volatile SingularAttribute<Banco, String> chave;
	public static volatile SingularAttribute<Banco, String> senha;
	public static volatile SingularAttribute<Banco, String> gerente;
	public static volatile SingularAttribute<Banco, String> emailgerente;
	public static volatile SingularAttribute<Banco, String> digioagencia;
	public static volatile SingularAttribute<Banco, String> digitoconta;
	public static volatile SingularAttribute<Banco, String> carteira;
	public static volatile SingularAttribute<Banco, Float> valorjuros;
	public static volatile SingularAttribute<Banco, Float> valormulta;
}
