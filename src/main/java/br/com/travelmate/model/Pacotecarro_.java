package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.183-0300")
@StaticMetamodel(Pacotecarro.class)
public class Pacotecarro_ {
	public static volatile SingularAttribute<Pacotecarro, Integer> idpacoteCarro;
	public static volatile SingularAttribute<Pacotecarro, String> localizador;
	public static volatile SingularAttribute<Pacotecarro, String> locaretirada;
	public static volatile SingularAttribute<Pacotecarro, Date> dataretirada;
	public static volatile SingularAttribute<Pacotecarro, String> horaritirada;
	public static volatile SingularAttribute<Pacotecarro, String> localdevolucao;
	public static volatile SingularAttribute<Pacotecarro, Date> datadevolucao;
	public static volatile SingularAttribute<Pacotecarro, String> horadevolucao;
	public static volatile SingularAttribute<Pacotecarro, String> categoria;
	public static volatile SingularAttribute<Pacotecarro, String> descritivo;
	public static volatile SingularAttribute<Pacotecarro, Cambio> cambio;
	public static volatile SingularAttribute<Pacotecarro, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacotecarro, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacotecarro, Float> tarifa;
	public static volatile SingularAttribute<Pacotecarro, Float> taxa;
	public static volatile SingularAttribute<Pacotecarro, Float> comissaofornecedor;
	public static volatile SingularAttribute<Pacotecarro, Float> valorcambio;
	public static volatile SingularAttribute<Pacotecarro, Date> datapagamentoparceiro;
}
