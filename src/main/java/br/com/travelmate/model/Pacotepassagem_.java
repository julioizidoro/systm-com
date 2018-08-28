package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.188-0300")
@StaticMetamodel(Pacotepassagem.class)
public class Pacotepassagem_ {
	public static volatile SingularAttribute<Pacotepassagem, Integer> idpacotepassagem;
	public static volatile SingularAttribute<Pacotepassagem, String> localizador;
	public static volatile SingularAttribute<Pacotepassagem, String> ciaAerea;
	public static volatile SingularAttribute<Pacotepassagem, Date> dataEmbarque;
	public static volatile SingularAttribute<Pacotepassagem, Date> dataVolta;
	public static volatile SingularAttribute<Pacotepassagem, String> observacoes;
	public static volatile SingularAttribute<Pacotepassagem, String> intinerario;
	public static volatile SingularAttribute<Pacotepassagem, Date> dataEmissao;
	public static volatile SingularAttribute<Pacotepassagem, Float> adttarifa;
	public static volatile SingularAttribute<Pacotepassagem, Float> adttaxas;
	public static volatile SingularAttribute<Pacotepassagem, Float> adttaxaemissao;
	public static volatile SingularAttribute<Pacotepassagem, Float> adtcomissao;
	public static volatile SingularAttribute<Pacotepassagem, Float> chdtarifa;
	public static volatile SingularAttribute<Pacotepassagem, Float> chdtaxas;
	public static volatile SingularAttribute<Pacotepassagem, Float> chdtaxaemissao;
	public static volatile SingularAttribute<Pacotepassagem, Float> chdcomissao;
	public static volatile SingularAttribute<Pacotepassagem, Float> inftarifa;
	public static volatile SingularAttribute<Pacotepassagem, Float> inftaxas;
	public static volatile SingularAttribute<Pacotepassagem, Float> inftaxaemissao;
	public static volatile SingularAttribute<Pacotepassagem, Float> infcomissao;
	public static volatile SingularAttribute<Pacotepassagem, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Pacotepassagem, Pacotetrecho> pacotetrecho;
	public static volatile SingularAttribute<Pacotepassagem, Float> comissaofornecedor;
	public static volatile SingularAttribute<Pacotepassagem, Date> datapagamentoparceiro;
}
