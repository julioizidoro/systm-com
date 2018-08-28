package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-03T14:23:24.716-0300")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Integer> idcliente;
	public static volatile SingularAttribute<Cliente, Date> dataInscricao;
	public static volatile SingularAttribute<Cliente, String> nome;
	public static volatile SingularAttribute<Cliente, Date> dataNascimento;
	public static volatile SingularAttribute<Cliente, String> paisNascimento;
	public static volatile SingularAttribute<Cliente, String> cidadeNascimento;
	public static volatile SingularAttribute<Cliente, String> rg;
	public static volatile SingularAttribute<Cliente, String> cpf;
	public static volatile SingularAttribute<Cliente, String> sexo;
	public static volatile SingularAttribute<Cliente, String> numeroPassaporte;
	public static volatile SingularAttribute<Cliente, Date> dataExpedicaoPassaporte;
	public static volatile SingularAttribute<Cliente, Date> validadePassaporte;
	public static volatile SingularAttribute<Cliente, String> tipologradouro;
	public static volatile SingularAttribute<Cliente, String> logradouro;
	public static volatile SingularAttribute<Cliente, String> numero;
	public static volatile SingularAttribute<Cliente, String> complemento;
	public static volatile SingularAttribute<Cliente, String> bairro;
	public static volatile SingularAttribute<Cliente, String> cidade;
	public static volatile SingularAttribute<Cliente, String> estado;
	public static volatile SingularAttribute<Cliente, String> cep;
	public static volatile SingularAttribute<Cliente, String> pais;
	public static volatile SingularAttribute<Cliente, String> foneResidencial;
	public static volatile SingularAttribute<Cliente, String> foneCelular;
	public static volatile SingularAttribute<Cliente, String> foneComercial;
	public static volatile SingularAttribute<Cliente, String> profissao;
	public static volatile SingularAttribute<Cliente, String> email;
	public static volatile SingularAttribute<Cliente, String> skype;
	public static volatile SingularAttribute<Cliente, String> facebook;
	public static volatile SingularAttribute<Cliente, String> nomeMae;
	public static volatile SingularAttribute<Cliente, String> profissaoMae;
	public static volatile SingularAttribute<Cliente, String> foneMae;
	public static volatile SingularAttribute<Cliente, String> nomePai;
	public static volatile SingularAttribute<Cliente, String> profissaoPai;
	public static volatile SingularAttribute<Cliente, String> fonePai;
	public static volatile SingularAttribute<Cliente, String> escolaridade;
	public static volatile SingularAttribute<Cliente, String> complementopublicidade;
	public static volatile SingularAttribute<Cliente, String> tipoCliente;
	public static volatile SingularAttribute<Cliente, Date> dataCadastro;
	public static volatile SingularAttribute<Cliente, Date> dataInicio;
	public static volatile SingularAttribute<Cliente, Date> dataTermino;
	public static volatile SingularAttribute<Cliente, String> estadoCivil;
	public static volatile SingularAttribute<Cliente, Boolean> liberarficha;
	public static volatile SingularAttribute<Cliente, String> tipovisto;
	public static volatile SingularAttribute<Cliente, Integer> avulsa;
	public static volatile SingularAttribute<Cliente, String> datainicioprograma;
	public static volatile SingularAttribute<Cliente, Publicidade> publicidade;
	public static volatile SingularAttribute<Cliente, Unidadenegocio> unidadenegocio;
	public static volatile ListAttribute<Cliente, Leadhistorico> leadhistoricoList;
	public static volatile SingularAttribute<Cliente, Integer> idioma;
}
