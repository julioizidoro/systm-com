package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.081-0300")
@StaticMetamodel(Controlework.class)
public class Controlework_ {
	public static volatile SingularAttribute<Controlework, Integer> idcontroleWork;
	public static volatile SingularAttribute<Controlework, Date> dataIniciojoboffer;
	public static volatile SingularAttribute<Controlework, Date> dataTerminojoboffer;
	public static volatile SingularAttribute<Controlework, Date> dataretorno;
	public static volatile SingularAttribute<Controlework, Boolean> documentacao;
	public static volatile SingularAttribute<Controlework, Boolean> applicationsponsor;
	public static volatile SingularAttribute<Controlework, Boolean> invoicepaga;
	public static volatile SingularAttribute<Controlework, String> statusprocesso;
	public static volatile SingularAttribute<Controlework, String> modalidade;
	public static volatile SingularAttribute<Controlework, String> skype;
	public static volatile SingularAttribute<Controlework, String> observacoes;
	public static volatile SingularAttribute<Controlework, Controleworkembarque> controleworkembarque;
	public static volatile SingularAttribute<Controlework, Controleworksponsor> controleworksponsor;
	public static volatile SingularAttribute<Controlework, Controleworkempregaor> controleworkempregaor;
	public static volatile SingularAttribute<Controlework, Vendas> vendas;
	public static volatile ListAttribute<Controlework, Controleworkentrevista> controleworkentrevistaList;
}
