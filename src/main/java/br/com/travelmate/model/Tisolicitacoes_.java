package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.239-0300")
@StaticMetamodel(Tisolicitacoes.class)
public class Tisolicitacoes_ {
	public static volatile SingularAttribute<Tisolicitacoes, Integer> idtisolicitacoes;
	public static volatile SingularAttribute<Tisolicitacoes, Date> datasolicitacao;
	public static volatile SingularAttribute<Tisolicitacoes, Date> dataconclusao;
	public static volatile SingularAttribute<Tisolicitacoes, String> descricao;
	public static volatile SingularAttribute<Tisolicitacoes, Boolean> concluido;
	public static volatile SingularAttribute<Tisolicitacoes, Date> dataprevisao;
	public static volatile SingularAttribute<Tisolicitacoes, String> situacao;
	public static volatile SingularAttribute<Tisolicitacoes, Boolean> liberar;
	public static volatile SingularAttribute<Tisolicitacoes, Usuario> usuario;
	public static volatile SingularAttribute<Tisolicitacoes, Usuario> usuarioExecutor;
	public static volatile ListAttribute<Tisolicitacoes, Tisolicitacoeshistorico> tisolicitacoeshistoricoList;
}
