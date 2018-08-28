package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.162-0300")
@StaticMetamodel(Occliente.class)
public class Occliente_ {
	public static volatile SingularAttribute<Occliente, Integer> idoccliente;
	public static volatile SingularAttribute<Occliente, String> nome;
	public static volatile SingularAttribute<Occliente, String> email;
	public static volatile SingularAttribute<Occliente, String> foneresidencial;
	public static volatile SingularAttribute<Occliente, String> fonecelular;
	public static volatile SingularAttribute<Occliente, Date> datanascimento;
	public static volatile SingularAttribute<Occliente, String> sexo;
	public static volatile SingularAttribute<Occliente, String> idioma;
	public static volatile SingularAttribute<Occliente, String> nivelidioma;
	public static volatile SingularAttribute<Occliente, Publicidade> publicidade;
	public static volatile SingularAttribute<Occliente, Unidadenegocio> unidadenegocio;
}
