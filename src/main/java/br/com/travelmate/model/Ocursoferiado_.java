package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.166-0300")
@StaticMetamodel(Ocursoferiado.class)
public class Ocursoferiado_ {
	public static volatile SingularAttribute<Ocursoferiado, Integer> idocursoferiado;
	public static volatile SingularAttribute<Ocursoferiado, String> nome;
	public static volatile SingularAttribute<Ocursoferiado, Date> datainicial;
	public static volatile SingularAttribute<Ocursoferiado, Date> datafinal;
	public static volatile SingularAttribute<Ocursoferiado, Boolean> contacurso;
	public static volatile SingularAttribute<Ocursoferiado, Fornecedorcidade> fornecedorcidade;
}
