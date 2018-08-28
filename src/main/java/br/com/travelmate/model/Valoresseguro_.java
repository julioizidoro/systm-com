package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-10T15:25:36.870-0300")
@StaticMetamodel(Valoresseguro.class)
public class Valoresseguro_ {
	public static volatile SingularAttribute<Valoresseguro, Integer> idvaloresseguro;
	public static volatile SingularAttribute<Valoresseguro, String> plano;
	public static volatile SingularAttribute<Valoresseguro, Float> valornet;
	public static volatile SingularAttribute<Valoresseguro, Float> valorgross;
	public static volatile SingularAttribute<Valoresseguro, Float> comissaoexpress;
	public static volatile SingularAttribute<Valoresseguro, Float> comissaopremium;
	public static volatile SingularAttribute<Valoresseguro, String> situacao;
	public static volatile SingularAttribute<Valoresseguro, String> cobranca;
	public static volatile SingularAttribute<Valoresseguro, Float> valorsegurocancelamento;
	public static volatile SingularAttribute<Valoresseguro, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Valoresseguro, Moedas> moedas;
	public static volatile SingularAttribute<Valoresseguro, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Valoresseguro, String> tarifario;
	public static volatile SingularAttribute<Valoresseguro, Boolean> adiconal70;
	public static volatile SingularAttribute<Valoresseguro, Seguroplanos> seguroplanos;
	public static volatile SingularAttribute<Valoresseguro, Boolean> segurocancelamento;
}
