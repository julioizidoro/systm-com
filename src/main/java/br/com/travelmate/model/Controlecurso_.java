package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.070-0300")
@StaticMetamodel(Controlecurso.class)
public class Controlecurso_ {
	public static volatile SingularAttribute<Controlecurso, Integer> idcontroleCursos;
	public static volatile SingularAttribute<Controlecurso, Integer> work;
	public static volatile SingularAttribute<Controlecurso, Date> dataEmbarque;
	public static volatile SingularAttribute<Controlecurso, Date> dataEnvioInscricaoEscola;
	public static volatile SingularAttribute<Controlecurso, Date> pagamentoAcomodacao;
	public static volatile SingularAttribute<Controlecurso, Float> valorAcomodacao;
	public static volatile SingularAttribute<Controlecurso, Date> previsaoPagamentoAcomodacao;
	public static volatile SingularAttribute<Controlecurso, String> visto;
	public static volatile SingularAttribute<Controlecurso, String> kitViagem;
	public static volatile SingularAttribute<Controlecurso, String> orientacaoPreEmbarque;
	public static volatile SingularAttribute<Controlecurso, String> loasObs;
	public static volatile SingularAttribute<Controlecurso, String> situacao;
	public static volatile SingularAttribute<Controlecurso, String> possuiAcomidacao;
	public static volatile SingularAttribute<Controlecurso, String> docanexado;
	public static volatile SingularAttribute<Controlecurso, String> docs;
	public static volatile SingularAttribute<Controlecurso, String> prioridade;
	public static volatile SingularAttribute<Controlecurso, Curso> curso;
	public static volatile SingularAttribute<Controlecurso, Vendas> vendas;
	public static volatile SingularAttribute<Controlecurso, String> obsvisto;
	public static volatile SingularAttribute<Controlecurso, Boolean> urgenciavisto;
	public static volatile SingularAttribute<Controlecurso, Date> datachegadabrasil;
}
