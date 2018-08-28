package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.087-0300")
@StaticMetamodel(Copromocao.class)
public class Copromocao_ {
	public static volatile SingularAttribute<Copromocao, Integer> idcopromocao;
	public static volatile SingularAttribute<Copromocao, Date> datavalidade;
	public static volatile SingularAttribute<Copromocao, Integer> numerosemanainicial;
	public static volatile SingularAttribute<Copromocao, Integer> numerosemanafinal;
	public static volatile SingularAttribute<Copromocao, String> promocao;
	public static volatile SingularAttribute<Copromocao, String> observacao;
	public static volatile SingularAttribute<Copromocao, Fornecedorcidade> fornecedorcidade;
}
