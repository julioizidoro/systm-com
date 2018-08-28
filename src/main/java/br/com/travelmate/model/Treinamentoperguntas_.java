package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.244-0300")
@StaticMetamodel(Treinamentoperguntas.class)
public class Treinamentoperguntas_ {
	public static volatile SingularAttribute<Treinamentoperguntas, Integer> idtreinamentoperguntas;
	public static volatile SingularAttribute<Treinamentoperguntas, String> pergunta1;
	public static volatile SingularAttribute<Treinamentoperguntas, String> pergunta2;
	public static volatile SingularAttribute<Treinamentoperguntas, String> pergunta3;
	public static volatile SingularAttribute<Treinamentoperguntas, String> pergunta4;
	public static volatile SingularAttribute<Treinamentoperguntas, String> pergunta5;
	public static volatile SingularAttribute<Treinamentoperguntas, String> pergunta6;
	public static volatile SingularAttribute<Treinamentoperguntas, Mtp> mtp;
	public static volatile ListAttribute<Treinamentoperguntas, Treinamentorespostas> treinamentorespostasList;
}
