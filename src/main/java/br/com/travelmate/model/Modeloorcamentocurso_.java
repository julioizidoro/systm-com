package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.155-0300")
@StaticMetamodel(Modeloorcamentocurso.class)
public class Modeloorcamentocurso_ {
	public static volatile SingularAttribute<Modeloorcamentocurso, Integer> idorcamentoCurso;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> nome;
	public static volatile SingularAttribute<Modeloorcamentocurso, Float> valorCambio;
	public static volatile SingularAttribute<Modeloorcamentocurso, Float> valor;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> curso;
	public static volatile SingularAttribute<Modeloorcamentocurso, Date> data;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> tipoDuracao;
	public static volatile SingularAttribute<Modeloorcamentocurso, Integer> aulasSemana;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> tipoAcomodacao;
	public static volatile SingularAttribute<Modeloorcamentocurso, Integer> duracaoAcomodacao;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> observacao;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> refeicoes;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> tipoQuarto;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> materialDidatico;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> seguroSaude;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> transfer;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> passagemAerea;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> sedexInternacional;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> vistoConsular;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> outrasTaxas;
	public static volatile SingularAttribute<Modeloorcamentocurso, Date> dataValidade;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> duracao;
	public static volatile SingularAttribute<Modeloorcamentocurso, String> situacao;
	public static volatile SingularAttribute<Modeloorcamentocurso, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Modeloorcamentocurso, Cambio> cambio;
	public static volatile SingularAttribute<Modeloorcamentocurso, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Modeloorcamentocurso, Unidadenegocio> unidadenegocio;
	public static volatile SingularAttribute<Modeloorcamentocurso, Usuario> usuario;
	public static volatile ListAttribute<Modeloorcamentocurso, Modeloorcamentocursoforma> modeloorcamentocursoformaList;
	public static volatile ListAttribute<Modeloorcamentocurso, Modeloprodutoorcamentocurso> modeloprodutoorcamentocursoList;
}
