package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.173-0300")
@StaticMetamodel(Orcamentocurso.class)
public class Orcamentocurso_ {
	public static volatile SingularAttribute<Orcamentocurso, Integer> idorcamentoCurso;
	public static volatile SingularAttribute<Orcamentocurso, Date> data;
	public static volatile SingularAttribute<Orcamentocurso, Float> valorCambio;
	public static volatile SingularAttribute<Orcamentocurso, String> cambioAlterado;
	public static volatile SingularAttribute<Orcamentocurso, Float> valor;
	public static volatile SingularAttribute<Orcamentocurso, Float> totalmoedaestrangeira;
	public static volatile SingularAttribute<Orcamentocurso, String> idioma;
	public static volatile SingularAttribute<Orcamentocurso, String> nivelIdioma;
	public static volatile SingularAttribute<Orcamentocurso, String> curso;
	public static volatile SingularAttribute<Orcamentocurso, Date> dataInicio;
	public static volatile SingularAttribute<Orcamentocurso, Date> dataTermino;
	public static volatile SingularAttribute<Orcamentocurso, Integer> numeroSemanas;
	public static volatile SingularAttribute<Orcamentocurso, String> tipoDuracao;
	public static volatile SingularAttribute<Orcamentocurso, Integer> aulasSemana;
	public static volatile SingularAttribute<Orcamentocurso, String> tipoAcomodacao;
	public static volatile SingularAttribute<Orcamentocurso, Integer> duracaoAcomodacao;
	public static volatile SingularAttribute<Orcamentocurso, String> observacao;
	public static volatile SingularAttribute<Orcamentocurso, Integer> idCurso;
	public static volatile SingularAttribute<Orcamentocurso, String> refeicoes;
	public static volatile SingularAttribute<Orcamentocurso, String> tipoQuarto;
	public static volatile SingularAttribute<Orcamentocurso, String> materialDidatico;
	public static volatile SingularAttribute<Orcamentocurso, String> seguroSaude;
	public static volatile SingularAttribute<Orcamentocurso, String> transfer;
	public static volatile SingularAttribute<Orcamentocurso, String> passagemAerea;
	public static volatile SingularAttribute<Orcamentocurso, String> sedexInternacional;
	public static volatile SingularAttribute<Orcamentocurso, String> vistoConsular;
	public static volatile SingularAttribute<Orcamentocurso, String> outrasTaxas;
	public static volatile SingularAttribute<Orcamentocurso, String> situacao;
	public static volatile SingularAttribute<Orcamentocurso, String> tipobanheiro;
	public static volatile SingularAttribute<Orcamentocurso, String> turno;
	public static volatile ListAttribute<Orcamentocurso, Orcamentocursoformapagamento> orcamentocursoformapagamentoList;
	public static volatile SingularAttribute<Orcamentocurso, Cambio> cambio;
	public static volatile SingularAttribute<Orcamentocurso, Cliente> cliente;
	public static volatile SingularAttribute<Orcamentocurso, Integer> occliente;
	public static volatile SingularAttribute<Orcamentocurso, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Orcamentocurso, Fornecedorcidade> fornecedorcidade;
	public static volatile SingularAttribute<Orcamentocurso, Unidadenegocio> unidadenegocio;
	public static volatile SingularAttribute<Orcamentocurso, Usuario> usuario;
	public static volatile SingularAttribute<Orcamentocurso, Orcamentomanualseguro> orcamentomanualseguro;
	public static volatile SingularAttribute<Orcamentocurso, Boolean> enviadoemail;
	public static volatile SingularAttribute<Orcamentocurso, String> tipoorcamento;
}
