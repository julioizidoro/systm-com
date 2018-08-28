package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.193-0300")
@StaticMetamodel(Pacoteservico.class)
public class Pacoteservico_ {
	public static volatile SingularAttribute<Pacoteservico, Integer> idpacoteservico;
	public static volatile SingularAttribute<Pacoteservico, String> descricao;
	public static volatile SingularAttribute<Pacoteservico, Float> tarifa;
	public static volatile SingularAttribute<Pacoteservico, Pacotetrecho> pacotetrecho;
}
