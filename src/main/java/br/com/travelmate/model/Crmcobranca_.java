package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.091-0300")
@StaticMetamodel(Crmcobranca.class)
public class Crmcobranca_ {
	public static volatile SingularAttribute<Crmcobranca, Integer> idcrmcobranca;
	public static volatile SingularAttribute<Crmcobranca, String> prioridade;
	public static volatile SingularAttribute<Crmcobranca, Date> proximocontato;
	public static volatile SingularAttribute<Crmcobranca, String> situacao;
	public static volatile SingularAttribute<Crmcobranca, Date> datafinalizada;
	public static volatile SingularAttribute<Crmcobranca, Date> datavencimento;
	public static volatile SingularAttribute<Crmcobranca, Date> datainiciocobranca;
	public static volatile ListAttribute<Crmcobranca, Crmcobrancaconta> crmcobrancacontaList;
	public static volatile SingularAttribute<Crmcobranca, Vendas> vendas;
	public static volatile SingularAttribute<Crmcobranca, String> nota;
}
