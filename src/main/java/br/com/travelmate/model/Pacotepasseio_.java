package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.190-0300")
@StaticMetamodel(Pacotepasseio.class)
public class Pacotepasseio_ {
	public static volatile SingularAttribute<Pacotepasseio, Integer> idpacotepasseio;
	public static volatile SingularAttribute<Pacotepasseio, String> pais;
	public static volatile SingularAttribute<Pacotepasseio, String> cidade;
	public static volatile SingularAttribute<Pacotepasseio, Date> data;
	public static volatile SingularAttribute<Pacotepasseio, Integer> chd;
	public static volatile SingularAttribute<Pacotepasseio, Integer> inf;
	public static volatile SingularAttribute<Pacotepasseio, Integer> adt;
	public static volatile SingularAttribute<Pacotepasseio, String> descritivo;
	public static volatile SingularAttribute<Pacotepasseio, Float> tarifa;
	public static volatile SingularAttribute<Pacotepasseio, Float> taxa;
	public static volatile SingularAttribute<Pacotepasseio, Cambio> cambio;
	public static volatile SingularAttribute<Pacotepasseio, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacotepasseio, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacotepasseio, Float> valorcambio;
	public static volatile SingularAttribute<Pacotepasseio, Date> datapagamentoparceiro;
}
