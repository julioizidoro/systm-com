package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-24T11:07:40.161-0300")
@StaticMetamodel(Heorcamentopais.class)
public class Heorcamentopais_ {
	public static volatile SingularAttribute<Heorcamentopais, Integer> idheorcamentopais;
	public static volatile SingularAttribute<Heorcamentopais, String> curso;
	public static volatile SingularAttribute<Heorcamentopais, Date> datainicio;
	public static volatile SingularAttribute<Heorcamentopais, String> duracao;
	public static volatile SingularAttribute<Heorcamentopais, Float> valormoedaestrageira;
	public static volatile SingularAttribute<Heorcamentopais, Float> valorreais;
	public static volatile SingularAttribute<Heorcamentopais, Heorcamento> heorcamento;
	public static volatile SingularAttribute<Heorcamentopais, Cidade> cidade;
	public static volatile SingularAttribute<Heorcamentopais, Cambio> cambio;
}
