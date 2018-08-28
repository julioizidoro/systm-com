package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.229-0300")
@StaticMetamodel(Recinternacional.class)
public class Recinternacional_ {
	public static volatile SingularAttribute<Recinternacional, Integer> idrecinternacional;
	public static volatile SingularAttribute<Recinternacional, String> observacao;
	public static volatile SingularAttribute<Recinternacional, Date> datarecebimento;
	public static volatile SingularAttribute<Recinternacional, Date> dataenvio;
	public static volatile SingularAttribute<Recinternacional, Date> datavencimento;
	public static volatile SingularAttribute<Recinternacional, Float> valorreais;
	public static volatile SingularAttribute<Recinternacional, Float> valormeodaestrangeira;
	public static volatile SingularAttribute<Recinternacional, Float> tarifa;
	public static volatile SingularAttribute<Recinternacional, Float> valor;
	public static volatile SingularAttribute<Recinternacional, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Recinternacional, Vendas> vendas;
	public static volatile SingularAttribute<Recinternacional, Motivorecinternacional> motivorecinternacional;
	public static volatile SingularAttribute<Recinternacional, Banco> banco;
	public static volatile SingularAttribute<Recinternacional, Moedas> moedas;
	public static volatile SingularAttribute<Recinternacional, Usuario> usuario;
	public static volatile SingularAttribute<Recinternacional, Boolean> relatorio;
}
