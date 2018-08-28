package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.103-0300")
@StaticMetamodel(Departamento.class)
public class Departamento_ {
	public static volatile SingularAttribute<Departamento, Integer> iddepartamento;
	public static volatile SingularAttribute<Departamento, String> nome;
	public static volatile SingularAttribute<Departamento, String> imagem;
	public static volatile SingularAttribute<Departamento, Boolean> pasta;
	public static volatile SingularAttribute<Departamento, Boolean> lista;
	public static volatile SingularAttribute<Departamento, Usuario> usuario;
	public static volatile SingularAttribute<Departamento, Unidadenegocio> unidadenegocio;
	public static volatile ListAttribute<Departamento, Pasta1> pasta1List;
	public static volatile ListAttribute<Departamento, Departamentoproduto> departamentoprodutoList;
	public static volatile SingularAttribute<Departamento, Boolean> venda;
}
