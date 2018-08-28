package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-06-01T04:12:39.427-0300")
@StaticMetamodel(Unidadenegocio.class)
public class Unidadenegocio_ {
	public static volatile SingularAttribute<Unidadenegocio, Integer> idunidadeNegocio;
	public static volatile SingularAttribute<Unidadenegocio, String> razaoSocial;
	public static volatile SingularAttribute<Unidadenegocio, String> nomeFantasia;
	public static volatile SingularAttribute<Unidadenegocio, String> tipoLogradouro;
	public static volatile SingularAttribute<Unidadenegocio, String> logradouro;
	public static volatile SingularAttribute<Unidadenegocio, String> numero;
	public static volatile SingularAttribute<Unidadenegocio, String> complemento;
	public static volatile SingularAttribute<Unidadenegocio, String> bairro;
	public static volatile SingularAttribute<Unidadenegocio, String> cidade;
	public static volatile SingularAttribute<Unidadenegocio, String> estado;
	public static volatile SingularAttribute<Unidadenegocio, String> cep;
	public static volatile SingularAttribute<Unidadenegocio, String> email;
	public static volatile SingularAttribute<Unidadenegocio, String> fone;
	public static volatile SingularAttribute<Unidadenegocio, String> cnpj;
	public static volatile SingularAttribute<Unidadenegocio, String> versao;
	public static volatile SingularAttribute<Unidadenegocio, Integer> digitosTelefone;
	public static volatile SingularAttribute<Unidadenegocio, Date> dataembarcadocurso;
	public static volatile SingularAttribute<Unidadenegocio, String> tipo;
	public static volatile SingularAttribute<Unidadenegocio, String> nomerelatorio;
	public static volatile SingularAttribute<Unidadenegocio, Boolean> cp;
	public static volatile SingularAttribute<Unidadenegocio, Boolean> situacao;
	public static volatile SingularAttribute<Unidadenegocio, Integer> mespagamento;
	public static volatile SingularAttribute<Unidadenegocio, Double> perconsultor;
	public static volatile SingularAttribute<Unidadenegocio, Boolean> parcelamentojoja;
	public static volatile SingularAttribute<Unidadenegocio, Float> percentualcurso;
	public static volatile SingularAttribute<Unidadenegocio, Banco> banco;
	public static volatile SingularAttribute<Unidadenegocio, Float> fundomarketing;
	public static volatile SingularAttribute<Unidadenegocio, Boolean> leadautomatica;
	public static volatile SingularAttribute<Unidadenegocio, String> sigla;
	public static volatile ListAttribute<Unidadenegocio, Leadresponsavel> leadresponsavelList;
	public static volatile SingularAttribute<Unidadenegocio, String> categoria;
	public static volatile SingularAttribute<Unidadenegocio, String> servidor;
	public static volatile SingularAttribute<Unidadenegocio, Boolean> tmturcadastro;
	public static volatile SingularAttribute<Unidadenegocio, Boolean> tmturativo;
}
