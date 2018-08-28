package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.260-0300")
@StaticMetamodel(Vendapendencia.class)
public class Vendapendencia_ {
	public static volatile SingularAttribute<Vendapendencia, Integer> idvendapendencia;
	public static volatile SingularAttribute<Vendapendencia, Date> dataproximocontato;
	public static volatile SingularAttribute<Vendapendencia, String> relato;
	public static volatile SingularAttribute<Vendapendencia, Vendas> vendas;
	public static volatile SingularAttribute<Vendapendencia, Vendamotivopendencia> vendamotivopendencia;
	public static volatile ListAttribute<Vendapendencia, Vendapendenciahistorico> vendapendenciahistoricoList;
}
