package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.196-0300")
@StaticMetamodel(Pacotetrecho.class)
public class Pacotetrecho_ {
	public static volatile SingularAttribute<Pacotetrecho, Integer> idpacotetrecho;
	public static volatile SingularAttribute<Pacotetrecho, String> descritivo;
	public static volatile ListAttribute<Pacotetrecho, Pacotepasseio> pacotepasseioList;
	public static volatile SingularAttribute<Pacotetrecho, Pacotes> pacotes;
	public static volatile ListAttribute<Pacotetrecho, Pacotecarro> pacotecarroList;
	public static volatile ListAttribute<Pacotetrecho, Pacotetransfer> pacotetransferList;
	public static volatile ListAttribute<Pacotetrecho, Pacotetrem> pacotetremList;
	public static volatile ListAttribute<Pacotetrecho, Pacotehotel> pacotehotelList;
	public static volatile ListAttribute<Pacotetrecho, Pacotecruzeiro> pacotecruzeiroList;
	public static volatile ListAttribute<Pacotetrecho, Pacoteingresso> pacoteingressoList;
	public static volatile ListAttribute<Pacotetrecho, Pacotepassagem> pacotepassagemList;
	public static volatile ListAttribute<Pacotetrecho, Pacotecircuito> pacotecircuitoList;
	public static volatile ListAttribute<Pacotetrecho, Pacoteservico> pacoteservicoList;
}
