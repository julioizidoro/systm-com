package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.189-0300")
@StaticMetamodel(Pacotepassagempassageiro.class)
public class Pacotepassagempassageiro_ {
	public static volatile SingularAttribute<Pacotepassagempassageiro, Integer> idpacotepassagempassageiro;
	public static volatile SingularAttribute<Pacotepassagempassageiro, String> nome;
	public static volatile SingularAttribute<Pacotepassagempassageiro, Date> datanascimento;
	public static volatile SingularAttribute<Pacotepassagempassageiro, String> rg;
	public static volatile SingularAttribute<Pacotepassagempassageiro, String> categoria;
	public static volatile SingularAttribute<Pacotepassagempassageiro, Float> valor;
	public static volatile SingularAttribute<Pacotepassagempassageiro, Pacotepassagem> pacotepassagem;
}
