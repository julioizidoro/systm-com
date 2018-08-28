package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.055-0300")
@StaticMetamodel(Cobranca.class)
public class Cobranca_ {
	public static volatile SingularAttribute<Cobranca, Integer> idcobranca;
	public static volatile SingularAttribute<Cobranca, String> fone;
	public static volatile SingularAttribute<Cobranca, String> fone2;
	public static volatile SingularAttribute<Cobranca, String> email;
	public static volatile SingularAttribute<Cobranca, Vendas> vendas;
	public static volatile ListAttribute<Cobranca, Historicocobranca> historicocobrancaList;
}
