package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.170-0300")
@StaticMetamodel(Ocursoseguro.class)
public class Ocursoseguro_ {
	public static volatile SingularAttribute<Ocursoseguro, Integer> idocursoseguro;
	public static volatile SingularAttribute<Ocursoseguro, String> seguradora;
	public static volatile SingularAttribute<Ocursoseguro, Date> datainicial;
	public static volatile SingularAttribute<Ocursoseguro, Integer> numerodias;
	public static volatile SingularAttribute<Ocursoseguro, Date> datafinal;
	public static volatile SingularAttribute<Ocursoseguro, Float> valor;
	public static volatile SingularAttribute<Ocursoseguro, Float> valormoedaestrangeira;
	public static volatile SingularAttribute<Ocursoseguro, Ocurso> ocurso;
	public static volatile SingularAttribute<Ocursoseguro, Valoresseguro> valoresseguro;
	public static volatile SingularAttribute<Ocursoseguro, Boolean> somarvalortotal;
	public static volatile SingularAttribute<Ocursoseguro, Float> valorseguroorcamento;
	public static volatile SingularAttribute<Ocursoseguro, Boolean> segurocancelamento;
}
