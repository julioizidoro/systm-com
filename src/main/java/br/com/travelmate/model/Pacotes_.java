package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.191-0300")
@StaticMetamodel(Pacotes.class)
public class Pacotes_ {
	public static volatile SingularAttribute<Pacotes, Integer> idpacotes;
	public static volatile SingularAttribute<Pacotes, String> descricao;
	public static volatile SingularAttribute<Pacotes, Date> datainicio;
	public static volatile SingularAttribute<Pacotes, Date> datetermino;
	public static volatile SingularAttribute<Pacotes, String> controle;
	public static volatile SingularAttribute<Pacotes, String> operacao;
	public static volatile SingularAttribute<Pacotes, Float> valorgross;
	public static volatile SingularAttribute<Pacotes, Float> valornet;
	public static volatile SingularAttribute<Pacotes, Float> comissao;
	public static volatile SingularAttribute<Pacotes, Float> comissaofornecedor;
	public static volatile SingularAttribute<Pacotes, Float> comissaoloja;
	public static volatile SingularAttribute<Pacotes, Cliente> cliente;
	public static volatile SingularAttribute<Pacotes, Unidadenegocio> unidadenegocio;
	public static volatile SingularAttribute<Pacotes, Usuario> usuario;
	public static volatile SingularAttribute<Pacotes, Vendas> vendas;
	public static volatile ListAttribute<Pacotes, Pacotetrecho> pacotetrechoList;
}
