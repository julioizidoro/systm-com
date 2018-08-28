package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.305-0300")
@StaticMetamodel(Vistos.class)
public class Vistos_ {
	public static volatile SingularAttribute<Vistos, Integer> idvistos;
	public static volatile SingularAttribute<Vistos, Date> dataEntregaDocumentos;
	public static volatile SingularAttribute<Vistos, Float> valorEmissao;
	public static volatile SingularAttribute<Vistos, Float> taxaconsular;
	public static volatile SingularAttribute<Vistos, Float> taxaextra;
	public static volatile SingularAttribute<Vistos, Float> taxatm;
	public static volatile SingularAttribute<Vistos, String> paisDestino;
	public static volatile SingularAttribute<Vistos, String> categoria;
	public static volatile SingularAttribute<Vistos, String> controle;
	public static volatile SingularAttribute<Vistos, Date> dataembarque;
	public static volatile SingularAttribute<Vistos, Vendas> vendas;
	public static volatile SingularAttribute<Vistos, Float> descontomatriz;
	public static volatile SingularAttribute<Vistos, Float> descontoloja;
	public static volatile SingularAttribute<Vistos, Float> taxaloja;
	public static volatile SingularAttribute<Vistos, Usuario> usuario;
}
