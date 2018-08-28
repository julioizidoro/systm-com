package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.240-0300")
@StaticMetamodel(Tisolicitacoeshistorico.class)
public class Tisolicitacoeshistorico_ {
	public static volatile SingularAttribute<Tisolicitacoeshistorico, Integer> idtisolicitacoeshistorico;
	public static volatile SingularAttribute<Tisolicitacoeshistorico, Date> data;
	public static volatile SingularAttribute<Tisolicitacoeshistorico, String> descricao;
	public static volatile SingularAttribute<Tisolicitacoeshistorico, String> tipo;
	public static volatile SingularAttribute<Tisolicitacoeshistorico, Tisolicitacoes> tisolicitacoes;
	public static volatile SingularAttribute<Tisolicitacoeshistorico, Usuario> usuario;
}
