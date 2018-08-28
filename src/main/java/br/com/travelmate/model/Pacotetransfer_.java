package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.196-0300")
@StaticMetamodel(Pacotetransfer.class)
public class Pacotetransfer_ {
	public static volatile SingularAttribute<Pacotetransfer, Integer> idpacotetransfer;
	public static volatile SingularAttribute<Pacotetransfer, String> de;
	public static volatile SingularAttribute<Pacotetransfer, String> para;
	public static volatile SingularAttribute<Pacotetransfer, Date> data;
	public static volatile SingularAttribute<Pacotetransfer, String> tipo;
	public static volatile SingularAttribute<Pacotetransfer, Float> tarifa;
	public static volatile SingularAttribute<Pacotetransfer, Float> taxa;
	public static volatile SingularAttribute<Pacotetransfer, Cambio> cambio;
	public static volatile SingularAttribute<Pacotetransfer, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacotetransfer, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacotetransfer, Float> valorcambio;
	public static volatile SingularAttribute<Pacotetransfer, String> deout;
	public static volatile SingularAttribute<Pacotetransfer, String> paraout;
	public static volatile SingularAttribute<Pacotetransfer, Date> dataout;
	public static volatile SingularAttribute<Pacotetransfer, Date> datapagamentoparceiro;
}
