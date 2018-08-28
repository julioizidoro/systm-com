package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.111-0300")
@StaticMetamodel(Faturacomprovante.class)
public class Faturacomprovante_ {
	public static volatile SingularAttribute<Faturacomprovante, Integer> idfaturacomprovante;
	public static volatile SingularAttribute<Faturacomprovante, Date> data;
	public static volatile SingularAttribute<Faturacomprovante, String> nome;
	public static volatile SingularAttribute<Faturacomprovante, Usuario> usuario;
	public static volatile SingularAttribute<Faturacomprovante, Fatura> fatura;
}
