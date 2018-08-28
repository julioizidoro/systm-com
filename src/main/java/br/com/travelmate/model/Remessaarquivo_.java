package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.231-0300")
@StaticMetamodel(Remessaarquivo.class)
public class Remessaarquivo_ {
	public static volatile SingularAttribute<Remessaarquivo, Integer> idremessaarquivo;
	public static volatile SingularAttribute<Remessaarquivo, Date> dataenvio;
	public static volatile SingularAttribute<Remessaarquivo, String> nomearquivo;
	public static volatile SingularAttribute<Remessaarquivo, Usuario> usuario;
	public static volatile ListAttribute<Remessaarquivo, Remessacontas> remessacontasList;
}
