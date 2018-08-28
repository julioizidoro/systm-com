package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.187-0300")
@StaticMetamodel(Pacotehotel.class)
public class Pacotehotel_ {
	public static volatile SingularAttribute<Pacotehotel, Integer> idpacoteHotel;
	public static volatile SingularAttribute<Pacotehotel, String> cidade;
	public static volatile SingularAttribute<Pacotehotel, String> pais;
	public static volatile SingularAttribute<Pacotehotel, Float> valormoedanacional;
	public static volatile SingularAttribute<Pacotehotel, Date> datacheckin;
	public static volatile SingularAttribute<Pacotehotel, String> horacheckin;
	public static volatile SingularAttribute<Pacotehotel, Date> datacheckout;
	public static volatile SingularAttribute<Pacotehotel, String> horacheckout;
	public static volatile SingularAttribute<Pacotehotel, String> tipoquarto;
	public static volatile SingularAttribute<Pacotehotel, String> categoria;
	public static volatile SingularAttribute<Pacotehotel, String> regime;
	public static volatile SingularAttribute<Pacotehotel, String> descritivo;
	public static volatile SingularAttribute<Pacotehotel, Float> tarifa;
	public static volatile SingularAttribute<Pacotehotel, Float> taxa;
	public static volatile SingularAttribute<Pacotehotel, Cambio> cambio;
	public static volatile SingularAttribute<Pacotehotel, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacotehotel, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacotehotel, Float> valorcambio;
	public static volatile SingularAttribute<Pacotehotel, Float> comissaofornecedor;
	public static volatile SingularAttribute<Pacotehotel, Date> datapagamentoparceiro;
}
