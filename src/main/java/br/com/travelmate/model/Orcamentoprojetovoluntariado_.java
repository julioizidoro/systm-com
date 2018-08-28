package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.178-0300")
@StaticMetamodel(Orcamentoprojetovoluntariado.class)
public class Orcamentoprojetovoluntariado_ {
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Integer> idorcamentoprojetovoluntariado;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Date> dataorcamento;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Date> datainicial;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Date> datafinal;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, String> nsemanas;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Float> valorcambio;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Boolean> possuiacomodacao;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Boolean> possuitransfer;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Float> valorsemanaadicional;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Float> valorsemanaadicionalrs;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Float> valorprojeto;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Float> valorprojetors;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Float> valortotal;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Float> valortotalrs;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, String> obs;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Integer> nsemanaadicional;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Boolean> enviadoemail;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Voluntariadoprojetovalor> voluntariadoprojetovalor;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Usuario> usuario;
	public static volatile SingularAttribute<Orcamentoprojetovoluntariado, Cliente> cliente;
	public static volatile ListAttribute<Orcamentoprojetovoluntariado, Orcamentovoluntariadoformapagamento> orcamentovoluntariadoformapagamentoList;
	public static volatile ListAttribute<Orcamentoprojetovoluntariado, Orcamentovoluntariadodesconto> orcamentovoluntariadodescontoList;
	public static volatile ListAttribute<Orcamentoprojetovoluntariado, Orcamentovoluntariadoseguro> orcamentovoluntariadoseguroList;
}
