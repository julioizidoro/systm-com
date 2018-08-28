package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-03T15:37:46.541-0300")
@StaticMetamodel(Cartaocredito.class)
public class Cartaocredito_ {
	public static volatile SingularAttribute<Cartaocredito, Integer> idcartaocredito;
	public static volatile SingularAttribute<Cartaocredito, String> nome;
	public static volatile SingularAttribute<Cartaocredito, String> numero;
	public static volatile SingularAttribute<Cartaocredito, String> validade;
	public static volatile SingularAttribute<Cartaocredito, String> bandeira;
	public static volatile SingularAttribute<Cartaocredito, String> cv;
	public static volatile SingularAttribute<Cartaocredito, Banco> banco;
	public static volatile SingularAttribute<Cartaocredito, Integer> datavencimento;
	public static volatile SingularAttribute<Cartaocredito, Integer> datafechamento;
	public static volatile SingularAttribute<Cartaocredito, Boolean> situacao;
	public static volatile SingularAttribute<Cartaocredito, Unidadenegocio> unidadenegocio;
}
