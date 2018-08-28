package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.257-0300")
@StaticMetamodel(Valorestrainee.class)
public class Valorestrainee_ {
	public static volatile SingularAttribute<Valorestrainee, Integer> idvalorestrainee;
	public static volatile SingularAttribute<Valorestrainee, String> descricao;
	public static volatile SingularAttribute<Valorestrainee, Float> valorgross;
	public static volatile SingularAttribute<Valorestrainee, Float> valornet;
	public static volatile SingularAttribute<Valorestrainee, String> situacao;
	public static volatile SingularAttribute<Valorestrainee, Float> comissaopremium;
	public static volatile SingularAttribute<Valorestrainee, Float> comissaoexpress;
	public static volatile SingularAttribute<Valorestrainee, String> tipotrainee;
	public static volatile ListAttribute<Valorestrainee, Produtostrainee> produtostraineeList;
	public static volatile SingularAttribute<Valorestrainee, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Valorestrainee, Moedas> moedas;
	public static volatile SingularAttribute<Valorestrainee, Moedas> moedas1;
	public static volatile SingularAttribute<Valorestrainee, Produtosorcamento> produtosorcamento;
	public static volatile ListAttribute<Valorestrainee, Trainee> traineeList;
	public static volatile SingularAttribute<Valorestrainee, Produtostrainee> produtostrainee;
}
