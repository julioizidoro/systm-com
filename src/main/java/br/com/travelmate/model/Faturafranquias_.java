package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.114-0300")
@StaticMetamodel(Faturafranquias.class)
public class Faturafranquias_ {
	public static volatile SingularAttribute<Faturafranquias, Integer> idfaturafranquias;
	public static volatile SingularAttribute<Faturafranquias, Float> pagomatriz;
	public static volatile SingularAttribute<Faturafranquias, Float> liquidopagar;
	public static volatile SingularAttribute<Faturafranquias, Float> totalprodutos;
	public static volatile SingularAttribute<Faturafranquias, Float> percentualcomissao;
	public static volatile SingularAttribute<Faturafranquias, Boolean> fatura;
	public static volatile SingularAttribute<Faturafranquias, Integer> mes;
	public static volatile SingularAttribute<Faturafranquias, Integer> ano;
	public static volatile SingularAttribute<Faturafranquias, Boolean> apagarfatura;
	public static volatile SingularAttribute<Faturafranquias, Vendascomissao> vendascomissao;
}
