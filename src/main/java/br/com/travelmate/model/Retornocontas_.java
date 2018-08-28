package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.234-0300")
@StaticMetamodel(Retornocontas.class)
public class Retornocontas_ {
	public static volatile SingularAttribute<Retornocontas, Integer> idretornocontas;
	public static volatile SingularAttribute<Retornocontas, String> codigoocorrencia;
	public static volatile SingularAttribute<Retornocontas, Retornoarquivo> retornoarquivo;
	public static volatile SingularAttribute<Retornocontas, Contasreceber> contasreceber;
}
