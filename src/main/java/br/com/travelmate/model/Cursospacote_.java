package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-23T09:50:32.810-0300")
@StaticMetamodel(Cursospacote.class)
public class Cursospacote_ {
	public static volatile SingularAttribute<Cursospacote, Integer> idcursospacote;
	public static volatile SingularAttribute<Cursospacote, Integer> numerosemanacurso;
	public static volatile SingularAttribute<Cursospacote, Float> valortotalcurso;
	public static volatile SingularAttribute<Cursospacote, Float> numerosemanaacomodacao;
	public static volatile SingularAttribute<Cursospacote, Float> valortotalpacote;
	public static volatile SingularAttribute<Cursospacote, String> descricao;
	public static volatile SingularAttribute<Cursospacote, Date> datainicovenda;
	public static volatile SingularAttribute<Cursospacote, Date> dataterminovenda;
	public static volatile SingularAttribute<Cursospacote, Date> datainiciocurso;
	public static volatile SingularAttribute<Cursospacote, Date> dataterminocurso;
	public static volatile SingularAttribute<Cursospacote, Float> valortotalacomodacao;
	public static volatile SingularAttribute<Cursospacote, Valorcoprodutos> valorcoprodutos_curso;
	public static volatile SingularAttribute<Cursospacote, Valorcoprodutos> valorcoprodutos_acomodacao;
	public static volatile SingularAttribute<Cursospacote, Fornecedorcidadeidioma> fornecedorcidadeidioma;
	public static volatile SingularAttribute<Cursospacote, Float> promocaoescola;
	public static volatile SingularAttribute<Cursospacote, Float> valorcambio;
	public static volatile SingularAttribute<Cursospacote, Float> valoravista;
	public static volatile SingularAttribute<Cursospacote, Float> comissaopremium;
	public static volatile SingularAttribute<Cursospacote, Float> comissaoexpress;
	public static volatile SingularAttribute<Cursospacote, String> descritivoacomodacao;
	public static volatile SingularAttribute<Cursospacote, String> taxaacomodacao;
	public static volatile SingularAttribute<Cursospacote, String> taxamatricula;
	public static volatile SingularAttribute<Cursospacote, String> taxamaterial;
	public static volatile SingularAttribute<Cursospacote, String> transfer;
	public static volatile SingularAttribute<Cursospacote, String> outras;
	public static volatile SingularAttribute<Cursospacote, String> comissao;
	public static volatile SingularAttribute<Cursospacote, String> pagamentoboleto;
	public static volatile SingularAttribute<Cursospacote, String> pagamentocartao;
	public static volatile SingularAttribute<Cursospacote, String> pagamentofinanciamento;
	public static volatile SingularAttribute<Cursospacote, String> idademinina;
	public static volatile SingularAttribute<Cursospacote, Produtos> produtos;
	public static volatile SingularAttribute<Cursospacote, String> provincia;
	public static volatile SingularAttribute<Cursospacote, String> duracao;
	public static volatile SingularAttribute<Cursospacote, String> passagemaerea;
	public static volatile SingularAttribute<Cursospacote, String> modalidade;
	public static volatile SingularAttribute<Cursospacote, Boolean> mostrarescola;
	public static volatile SingularAttribute<Cursospacote, Float> descontotm1;
	public static volatile SingularAttribute<Cursospacote, Float> descontotm2;
	public static volatile SingularAttribute<Cursospacote, Integer> ano1;
	public static volatile SingularAttribute<Cursospacote, Integer> ano2;
	public static volatile SingularAttribute<Cursospacote, Integer> anotarifario;
	public static volatile SingularAttribute<Cursospacote, String> projetovoluntariado;
	public static volatile SingularAttribute<Cursospacote, Boolean> especial;
	public static volatile ListAttribute<Cursospacote, Voluntariadopacote> voluntariadopacoteList;
	public static volatile SingularAttribute<Cursospacote, Float> valormoedaestrangeira;
	public static volatile SingularAttribute<Cursospacote, Float> descontotmreal1;
	public static volatile SingularAttribute<Cursospacote, Float> descontotmreal2;
}
