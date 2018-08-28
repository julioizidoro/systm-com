package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.206-0300")
@StaticMetamodel(Pasta1.class)
public class Pasta1_ {
	public static volatile SingularAttribute<Pasta1, Integer> idpasta1;
	public static volatile SingularAttribute<Pasta1, String> nome;
	public static volatile SingularAttribute<Pasta1, Integer> posicao;
	public static volatile ListAttribute<Pasta1, Arquivo5> arquivo5List;
	public static volatile ListAttribute<Pasta1, Arquivo3> arquivo3List;
	public static volatile ListAttribute<Pasta1, Pasta2> pasta2List;
	public static volatile ListAttribute<Pasta1, Arquivo4> arquivo4List;
	public static volatile SingularAttribute<Pasta1, Departamento> departamento;
	public static volatile ListAttribute<Pasta1, Arquivo1> arquivo1List;
	public static volatile ListAttribute<Pasta1, Arquivo2> arquivo2List;
	public static volatile ListAttribute<Pasta1, Pasta5> pasta5List;
	public static volatile ListAttribute<Pasta1, Pasta4> pasta4List;
	public static volatile ListAttribute<Pasta1, Pasta3> pasta3List;
	public static volatile SingularAttribute<Pasta1, Boolean> restrito;
}
