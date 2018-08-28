package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.067-0300")
@StaticMetamodel(Controlealteracoes.class)
public class Controlealteracoes_ {
	public static volatile SingularAttribute<Controlealteracoes, Integer> idcontrolealteracoes;
	public static volatile SingularAttribute<Controlealteracoes, Date> dataalteracao;
	public static volatile SingularAttribute<Controlealteracoes, Boolean> verificado;
	public static volatile SingularAttribute<Controlealteracoes, Vendas> vendas;
	public static volatile SingularAttribute<Controlealteracoes, Usuario> usuario;
	public static volatile ListAttribute<Controlealteracoes, Dadosalteracoes> dadosalteracoesList;
	public static volatile SingularAttribute<Controlealteracoes, Departamentoproduto> departamentoproduto;
}
