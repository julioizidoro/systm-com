package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.068-0300")
@StaticMetamodel(Controleaupair.class)
public class Controleaupair_ {
	public static volatile SingularAttribute<Controleaupair, Integer> idcontroleAuPair;
	public static volatile SingularAttribute<Controleaupair, Date> dataembarque;
	public static volatile SingularAttribute<Controleaupair, String> estado;
	public static volatile SingularAttribute<Controleaupair, String> statusprocesso;
	public static volatile SingularAttribute<Controleaupair, Date> dataonline;
	public static volatile SingularAttribute<Controleaupair, Date> datamatch;
	public static volatile SingularAttribute<Controleaupair, Date> dataretormo;
	public static volatile SingularAttribute<Controleaupair, Date> dataminimaretorno;
	public static volatile SingularAttribute<Controleaupair, Boolean> comissaopaga;
	public static volatile SingularAttribute<Controleaupair, Float> valorcomissao;
	public static volatile SingularAttribute<Controleaupair, Date> datadescontocomissao;
	public static volatile SingularAttribute<Controleaupair, Vendas> vendas;
	public static volatile SingularAttribute<Controleaupair, Date> datapagamento;
	public static volatile SingularAttribute<Controleaupair, Float> descontocomissao;
	public static volatile SingularAttribute<Controleaupair, Boolean> childtraining;
}
