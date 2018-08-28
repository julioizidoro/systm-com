package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-06-13T10:02:13.153-0300")
@StaticMetamodel(Notificacao.class)
public class Notificacao_ {
	public static volatile SingularAttribute<Notificacao, Integer> idnotificacao;
	public static volatile SingularAttribute<Notificacao, String> titulo;
	public static volatile SingularAttribute<Notificacao, String> unidade;
	public static volatile SingularAttribute<Notificacao, String> cliente;
	public static volatile SingularAttribute<Notificacao, String> fornecedor;
	public static volatile SingularAttribute<Notificacao, String> datainicio;
	public static volatile SingularAttribute<Notificacao, String> consultor;
	public static volatile SingularAttribute<Notificacao, String> tipovenda;
	public static volatile SingularAttribute<Notificacao, String> imagem;
	public static volatile SingularAttribute<Notificacao, Float> valorvenda;
	public static volatile SingularAttribute<Notificacao, Float> cambio;
	public static volatile SingularAttribute<Notificacao, String> moeda;
	public static volatile SingularAttribute<Notificacao, Date> data;
	public static volatile SingularAttribute<Notificacao, Boolean> limpar;
	public static volatile SingularAttribute<Notificacao, Usuario> usuario;
	public static volatile SingularAttribute<Notificacao, String> hora;
}
