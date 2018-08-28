package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.093-0300")
@StaticMetamodel(Crmcobrancaconta.class)
public class Crmcobrancaconta_ {
	public static volatile SingularAttribute<Crmcobrancaconta, Integer> idcrmcobrancaconta;
	public static volatile SingularAttribute<Crmcobrancaconta, Date> datainclusao;
	public static volatile SingularAttribute<Crmcobrancaconta, Boolean> paga;
	public static volatile SingularAttribute<Crmcobrancaconta, Contasreceber> contasreceber;
	public static volatile SingularAttribute<Crmcobrancaconta, Crmcobranca> crmcobranca;
}
