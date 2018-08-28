package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-21T13:45:22.301-0300")
@StaticMetamodel(Ocurso.class)
public class Ocurso_ {
	public static volatile SingularAttribute<Ocurso, Integer> idocurso;
	public static volatile SingularAttribute<Ocurso, String> nivelidioma;
	public static volatile SingularAttribute<Ocurso, Date> datainicio;
	public static volatile SingularAttribute<Ocurso, Date> datatermino;
	public static volatile SingularAttribute<Ocurso, Integer> numerosemanas;
	public static volatile SingularAttribute<Ocurso, Float> totalmoedaestrangeira;
	public static volatile SingularAttribute<Ocurso, Float> totalmoedanacional;
	public static volatile SingularAttribute<Ocurso, Float> desconto;
	public static volatile SingularAttribute<Ocurso, String> valorpassagem;
	public static volatile SingularAttribute<Ocurso, String> valorvisto;
	public static volatile SingularAttribute<Ocurso, Float> valorcambio;
	public static volatile SingularAttribute<Ocurso, Date> dataorcamento;
	public static volatile SingularAttribute<Ocurso, Cambio> cambio;
	public static volatile SingularAttribute<Ocurso, Fornecedorcidadeidioma> fornecedorcidadeidioma;
	public static volatile SingularAttribute<Ocurso, Idioma> idioma;
	public static volatile SingularAttribute<Ocurso, Produtosorcamento> produtosorcamento;
	public static volatile SingularAttribute<Ocurso, Usuario> usuario;
	public static volatile ListAttribute<Ocurso, Ocursodesconto> ocursodescontoList;
	public static volatile ListAttribute<Ocurso, Ocrusoprodutos> OcrusoprodutosList;
	public static volatile ListAttribute<Ocurso, Ocursoseguro> OcursoseguroList;
	public static volatile ListAttribute<Ocurso, Ocursoformapagamento> OcursoformapagamentoList;
	public static volatile SingularAttribute<Ocurso, Ocursopacote> ocursopacote;
	public static volatile SingularAttribute<Ocurso, String> observacao;
	public static volatile SingularAttribute<Ocurso, String> turno;
	public static volatile SingularAttribute<Ocurso, String> cargahoraria;
	public static volatile SingularAttribute<Ocurso, Integer> numerosemanastotal;
	public static volatile SingularAttribute<Ocurso, Integer> numerodiasferiado;
	public static volatile SingularAttribute<Ocurso, String> valoroutros;
	public static volatile SingularAttribute<Ocurso, Integer> numerosemanasbrinde;
	public static volatile SingularAttribute<Ocurso, Cliente> cliente;
	public static volatile SingularAttribute<Ocurso, Integer> occliente;
	public static volatile SingularAttribute<Ocurso, Boolean> modelo;
	public static volatile SingularAttribute<Ocurso, Boolean> enviadoemail;
	public static volatile SingularAttribute<Ocurso, Date> datavalidade;
	public static volatile SingularAttribute<Ocurso, Float> valoravista;
	public static volatile SingularAttribute<Ocurso, String> nomecarimbo;
	public static volatile SingularAttribute<Ocurso, Boolean> cambiocongelado;
	public static volatile SingularAttribute<Ocurso, Boolean> vitrine;
}
