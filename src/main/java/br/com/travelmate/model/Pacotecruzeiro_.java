package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.185-0300")
@StaticMetamodel(Pacotecruzeiro.class)
public class Pacotecruzeiro_ {
	public static volatile SingularAttribute<Pacotecruzeiro, Integer> idpacotecruzeiro;
	public static volatile SingularAttribute<Pacotecruzeiro, Date> datasaida;
	public static volatile SingularAttribute<Pacotecruzeiro, Date> datechegada;
	public static volatile SingularAttribute<Pacotecruzeiro, String> intinerario;
	public static volatile SingularAttribute<Pacotecruzeiro, String> tipocabine;
	public static volatile SingularAttribute<Pacotecruzeiro, String> categoria;
	public static volatile SingularAttribute<Pacotecruzeiro, String> descritivo;
	public static volatile SingularAttribute<Pacotecruzeiro, Float> tarifa;
	public static volatile SingularAttribute<Pacotecruzeiro, Float> taxa;
	public static volatile SingularAttribute<Pacotecruzeiro, Cambio> cambio;
	public static volatile SingularAttribute<Pacotecruzeiro, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacotecruzeiro, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacotecruzeiro, Float> valorcambio;
	public static volatile SingularAttribute<Pacotecruzeiro, Date> datapagamentoparceiro;
}
