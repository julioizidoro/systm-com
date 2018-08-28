package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.145-0300")
@StaticMetamodel(Ladies.class)
public class Ladies_ {
	public static volatile SingularAttribute<Ladies, Integer> idladies;
	public static volatile SingularAttribute<Ladies, Date> dataInscricao;
	public static volatile SingularAttribute<Ladies, String> idioma;
	public static volatile SingularAttribute<Ladies, String> nivelIdioma;
	public static volatile SingularAttribute<Ladies, String> curso;
	public static volatile SingularAttribute<Ladies, Integer> aulasSemana;
	public static volatile SingularAttribute<Ladies, Integer> numeroSemanas;
	public static volatile SingularAttribute<Ladies, Date> dataInicio;
	public static volatile SingularAttribute<Ladies, Date> dataTermino;
	public static volatile SingularAttribute<Ladies, String> tipoAcomodacao;
	public static volatile SingularAttribute<Ladies, Date> dataChegadaAcomodacao;
	public static volatile SingularAttribute<Ladies, Date> dataPartidaAcomodacao;
	public static volatile SingularAttribute<Ladies, Integer> numeroSemanasAcomodacao;
	public static volatile SingularAttribute<Ladies, String> tipoQuarto;
	public static volatile SingularAttribute<Ladies, String> tipoRefeicao;
	public static volatile SingularAttribute<Ladies, String> adicionaisAcomodacao;
	public static volatile SingularAttribute<Ladies, String> cartaoVTM;
	public static volatile SingularAttribute<Ladies, String> numeroCartao;
	public static volatile SingularAttribute<Ladies, String> moedaCartao;
	public static volatile SingularAttribute<Ladies, String> solicitacaoVisto;
	public static volatile SingularAttribute<Ladies, String> nomeContatoEmergencia;
	public static volatile SingularAttribute<Ladies, String> foneContatoEmergencia;
	public static volatile SingularAttribute<Ladies, String> emailContatoEmergencia;
	public static volatile SingularAttribute<Ladies, String> relacaoContatoEmergencia;
	public static volatile SingularAttribute<Ladies, String> obstm;
	public static volatile SingularAttribute<Ladies, String> controle;
	public static volatile SingularAttribute<Ladies, Vendas> vendas;
	public static volatile SingularAttribute<Ladies, Fornecedor> fornecedor;
}
