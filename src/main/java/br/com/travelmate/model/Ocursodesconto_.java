package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.165-0300")
@StaticMetamodel(Ocursodesconto.class)
public class Ocursodesconto_ {
	public static volatile SingularAttribute<Ocursodesconto, Integer> idocursodesconto;
	public static volatile SingularAttribute<Ocursodesconto, Float> valormoedaestrangeira;
	public static volatile SingularAttribute<Ocursodesconto, Float> valormoedanacional;
	public static volatile SingularAttribute<Ocursodesconto, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Ocursodesconto, Ocurso> ocurso;
}
