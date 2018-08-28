package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.094-0300")
@StaticMetamodel(Crmcobrancahistorico.class)
public class Crmcobrancahistorico_ {
	public static volatile SingularAttribute<Crmcobrancahistorico, Integer> idcrmcobrancahistorico;
	public static volatile SingularAttribute<Crmcobrancahistorico, Date> data;
	public static volatile SingularAttribute<Crmcobrancahistorico, String> tipocontato;
	public static volatile SingularAttribute<Crmcobrancahistorico, String> historico;
	public static volatile SingularAttribute<Crmcobrancahistorico, Date> proximocontato;
	public static volatile SingularAttribute<Crmcobrancahistorico, Cliente> cliente;
	public static volatile SingularAttribute<Crmcobrancahistorico, Usuario> usuario;
}
