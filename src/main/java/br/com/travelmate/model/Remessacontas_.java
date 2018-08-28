package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.232-0300")
@StaticMetamodel(Remessacontas.class)
public class Remessacontas_ {
	public static volatile SingularAttribute<Remessacontas, Integer> idremessacontas;
	public static volatile SingularAttribute<Remessacontas, String> codigoocorrencia;
	public static volatile SingularAttribute<Remessacontas, Remessaarquivo> remessaarquivo;
	public static volatile SingularAttribute<Remessacontas, Contasreceber> contasreceber;
}
