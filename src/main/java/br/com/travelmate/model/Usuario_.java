package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-06-01T04:12:39.439-0300")
@StaticMetamodel(Usuario.class)
public class Usuario_ {
	public static volatile SingularAttribute<Usuario, Integer> idusuario;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, String> login;
	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, String> tipo;
	public static volatile SingularAttribute<Usuario, String> situacao;
	public static volatile SingularAttribute<Usuario, String> email;
	public static volatile ListAttribute<Usuario, Vendascomissao> vendascomissaoList;
	public static volatile ListAttribute<Usuario, Vendas> vendasList;
	public static volatile SingularAttribute<Usuario, Grupoacesso> grupoacesso;
	public static volatile SingularAttribute<Usuario, Unidadenegocio> unidadenegocio;
	public static volatile ListAttribute<Usuario, Orcamentocurso> orcamentocursoList;
	public static volatile SingularAttribute<Usuario, Departamento> departamento;
	public static volatile SingularAttribute<Usuario, Boolean> vende;
	public static volatile SingularAttribute<Usuario, Boolean> foto;
	public static volatile SingularAttribute<Usuario, String> modoexibicao;
	public static volatile SingularAttribute<Usuario, Boolean> depoimentos;
	public static volatile SingularAttribute<Usuario, Date> dataaniversario;
	public static volatile SingularAttribute<Usuario, Date> datacomemorativa;
	public static volatile SingularAttribute<Usuario, Date> dataversao;
	public static volatile SingularAttribute<Usuario, Boolean> pertencematriz;
	public static volatile SingularAttribute<Usuario, Boolean> recebeleadautomatica;
	public static volatile SingularAttribute<Usuario, String> emailagenda;
	public static volatile ListAttribute<Usuario, Notificacaouploadusuario> notificacaoUploadNotificarList;
	public static volatile SingularAttribute<Usuario, Acessounidade> acessounidade;
	public static volatile SingularAttribute<Usuario, Cargo> cargo;
	public static volatile SingularAttribute<Usuario, Leadresponsavel> responsavel;
	public static volatile SingularAttribute<Usuario, Boolean> tmturcadastro;
	public static volatile SingularAttribute<Usuario, Boolean> tmturativo;
}
