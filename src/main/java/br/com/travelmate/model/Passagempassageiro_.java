package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.205-0300")
@StaticMetamodel(Passagempassageiro.class)
public class Passagempassageiro_ {
	public static volatile SingularAttribute<Passagempassageiro, Integer> idpassagempassageiro;
	public static volatile SingularAttribute<Passagempassageiro, String> nome;
	public static volatile SingularAttribute<Passagempassageiro, Date> datanascimento;
	public static volatile SingularAttribute<Passagempassageiro, String> rg;
	public static volatile SingularAttribute<Passagempassageiro, String> categoria;
	public static volatile SingularAttribute<Passagempassageiro, Float> valor;
	public static volatile SingularAttribute<Passagempassageiro, Passagemaerea> passagemaerea;
}
