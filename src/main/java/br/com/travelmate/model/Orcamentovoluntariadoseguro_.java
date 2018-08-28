package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.182-0300")
@StaticMetamodel(Orcamentovoluntariadoseguro.class)
public class Orcamentovoluntariadoseguro_ {
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Integer> idorcamentovoluntariadoseguro;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Date> datainicial;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Date> datafinal;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Integer> numerodias;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Float> valor;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Float> valorrs;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Boolean> somarvalortotal;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Orcamentoprojetovoluntariado> orcamentoprojetovoluntariado;
	public static volatile SingularAttribute<Orcamentovoluntariadoseguro, Valoresseguro> valoresseguro;
}
