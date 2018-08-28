package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.152-0300")
@StaticMetamodel(Leadsituacao.class)
public class Leadsituacao_ {
	public static volatile SingularAttribute<Leadsituacao, Integer> idleadsituacao;
	public static volatile SingularAttribute<Leadsituacao, Date> data;
	public static volatile SingularAttribute<Leadsituacao, String> hora;
	public static volatile SingularAttribute<Leadsituacao, Integer> situacaoanterior;
	public static volatile SingularAttribute<Leadsituacao, Integer> situacaoatual;
	public static volatile SingularAttribute<Leadsituacao, Lead> lead;
}
