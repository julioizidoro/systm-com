package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-22T14:41:59.750-0300")
@StaticMetamodel(Passagemaerea.class)
public class Passagemaerea_ {
	public static volatile ListAttribute<Passagemaerea, Passagempassageiro> passagempassageiroList;
	public static volatile SingularAttribute<Passagemaerea, Integer> idpassagemAerea;
	public static volatile SingularAttribute<Passagemaerea, String> localizador;
	public static volatile SingularAttribute<Passagemaerea, String> ciaAerea;
	public static volatile SingularAttribute<Passagemaerea, String> observacoes;
	public static volatile SingularAttribute<Passagemaerea, String> atendente;
	public static volatile SingularAttribute<Passagemaerea, Float> comissaoloja;
	public static volatile SingularAttribute<Passagemaerea, Date> dataviagem;
	public static volatile SingularAttribute<Passagemaerea, Date> datavolta;
	public static volatile SingularAttribute<Passagemaerea, String> trecho;
	public static volatile SingularAttribute<Passagemaerea, String> regras;
	public static volatile SingularAttribute<Passagemaerea, Float> adttarifa;
	public static volatile SingularAttribute<Passagemaerea, Float> adttaxas;
	public static volatile SingularAttribute<Passagemaerea, Float> adttaxaemissao;
	public static volatile SingularAttribute<Passagemaerea, Float> adtcomissao;
	public static volatile SingularAttribute<Passagemaerea, Float> chdtarifa;
	public static volatile SingularAttribute<Passagemaerea, Float> chdtaxas;
	public static volatile SingularAttribute<Passagemaerea, Float> chdtaxaemissao;
	public static volatile SingularAttribute<Passagemaerea, Float> chdcomissao;
	public static volatile SingularAttribute<Passagemaerea, Float> inftarifa;
	public static volatile SingularAttribute<Passagemaerea, Float> inftaxas;
	public static volatile SingularAttribute<Passagemaerea, Float> inftaxaemissao;
	public static volatile SingularAttribute<Passagemaerea, Float> infcomissao;
	public static volatile SingularAttribute<Passagemaerea, Vendas> vendas;
	public static volatile SingularAttribute<Passagemaerea, Integer> idusuario;
}
