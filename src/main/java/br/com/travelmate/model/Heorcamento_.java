package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-24T12:11:14.768-0300")
@StaticMetamodel(Heorcamento.class)
public class Heorcamento_ {
	public static volatile SingularAttribute<Heorcamento, Integer> idheorcamento;
	public static volatile SingularAttribute<Heorcamento, Date> dataemissao;
	public static volatile SingularAttribute<Heorcamento, String> horaemissao;
	public static volatile SingularAttribute<Heorcamento, String> observacao;
	public static volatile SingularAttribute<Heorcamento, Float> valorassessoria;
	public static volatile SingularAttribute<Heorcamento, Boolean> historicomedio;
	public static volatile SingularAttribute<Heorcamento, Boolean> passaporte;
	public static volatile SingularAttribute<Heorcamento, Boolean> historicosuperior;
	public static volatile SingularAttribute<Heorcamento, Boolean> score;
	public static volatile SingularAttribute<Heorcamento, String> sigla;
	public static volatile SingularAttribute<Heorcamento, Cliente> cliente;
	public static volatile SingularAttribute<Heorcamento, Usuario> usuario;
	public static volatile ListAttribute<Heorcamento, Heorcamentopais> heorcamentopaisList;
}
