package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.292-0300")
@StaticMetamodel(Vendascomissao.class)
public class Vendascomissao_ {
	public static volatile SingularAttribute<Vendascomissao, Integer> idvendascomissao;
	public static volatile SingularAttribute<Vendascomissao, Float> valorbruto;
	public static volatile SingularAttribute<Vendascomissao, Float> valorfornecedor;
	public static volatile SingularAttribute<Vendascomissao, Float> comissaotm;
	public static volatile SingularAttribute<Vendascomissao, Float> taxatm;
	public static volatile SingularAttribute<Vendascomissao, Float> descontotm;
	public static volatile SingularAttribute<Vendascomissao, Float> descontoloja;
	public static volatile SingularAttribute<Vendascomissao, Float> comissaoemissor;
	public static volatile SingularAttribute<Vendascomissao, Float> comissaogerente;
	public static volatile SingularAttribute<Vendascomissao, Float> comissaoterceiros;
	public static volatile SingularAttribute<Vendascomissao, Float> comissaofraquia;
	public static volatile SingularAttribute<Vendascomissao, Float> desagio;
	public static volatile SingularAttribute<Vendascomissao, Float> incentivo;
	public static volatile SingularAttribute<Vendascomissao, Float> liquidovendas;
	public static volatile SingularAttribute<Vendascomissao, Float> liquidofranquia;
	public static volatile SingularAttribute<Vendascomissao, Date> previsaopagamento;
	public static volatile SingularAttribute<Vendascomissao, String> paga;
	public static volatile SingularAttribute<Vendascomissao, Produtos> produtos;
	public static volatile SingularAttribute<Vendascomissao, Usuario> usuario;
	public static volatile SingularAttribute<Vendascomissao, Vendas> vendas;
	public static volatile SingularAttribute<Vendascomissao, Terceiros> terceiros;
	public static volatile SingularAttribute<Vendascomissao, Date> datainicioprograma;
	public static volatile SingularAttribute<Vendascomissao, Float> juros;
	public static volatile SingularAttribute<Vendascomissao, Float> comissaofranquiabruta;
	public static volatile SingularAttribute<Vendascomissao, Float> valorcomissionavel;
	public static volatile SingularAttribute<Vendascomissao, Faturafranquias> faturaFranquias;
	public static volatile SingularAttribute<Vendascomissao, Float> descontofornecedor;
	public static volatile SingularAttribute<Vendascomissao, Float> custofinanceirofranquia;
	public static volatile SingularAttribute<Vendascomissao, Float> jurospagos;
}
