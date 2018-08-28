package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.235-0300")
@StaticMetamodel(Seguroviagem.class)
public class Seguroviagem_ {
	public static volatile SingularAttribute<Seguroviagem, Integer> idseguroViagem;
	public static volatile SingularAttribute<Seguroviagem, String> seguradora;
	public static volatile SingularAttribute<Seguroviagem, String> plano;
	public static volatile SingularAttribute<Seguroviagem, Date> dataInicio;
	public static volatile SingularAttribute<Seguroviagem, Date> dataTermino;
	public static volatile SingularAttribute<Seguroviagem, Integer> numeroSemanas;
	public static volatile SingularAttribute<Seguroviagem, Float> valorSeguro;
	public static volatile SingularAttribute<Seguroviagem, Float> descontomatriz;
	public static volatile SingularAttribute<Seguroviagem, Float> descontoloja;
	public static volatile SingularAttribute<Seguroviagem, String> possuiSeguro;
	public static volatile SingularAttribute<Seguroviagem, String> nomeContatoEmergencia;
	public static volatile SingularAttribute<Seguroviagem, String> paisDestino;
	public static volatile SingularAttribute<Seguroviagem, String> foneContatoEmergencia;
	public static volatile SingularAttribute<Seguroviagem, Integer> idvendacurso;
	public static volatile SingularAttribute<Seguroviagem, String> obstm;
	public static volatile SingularAttribute<Seguroviagem, String> controle;
	public static volatile SingularAttribute<Seguroviagem, Boolean> segurocancelamento;
	public static volatile SingularAttribute<Seguroviagem, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Seguroviagem, Valoresseguro> valoresseguro;
	public static volatile SingularAttribute<Seguroviagem, Vendas> vendas;
	public static volatile SingularAttribute<Seguroviagem, Controleseguro> controleseguro;
}
