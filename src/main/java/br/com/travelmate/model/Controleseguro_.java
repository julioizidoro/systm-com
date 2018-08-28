package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.076-0300")
@StaticMetamodel(Controleseguro.class)
public class Controleseguro_ {
	public static volatile SingularAttribute<Controleseguro, Integer> idcontroleSeguro;
	public static volatile SingularAttribute<Controleseguro, String> envioVoucher;
	public static volatile SingularAttribute<Controleseguro, String> observacao;
	public static volatile SingularAttribute<Controleseguro, String> finalizado;
	public static volatile SingularAttribute<Controleseguro, String> situacao;
	public static volatile SingularAttribute<Controleseguro, Date> dataemissao;
	public static volatile SingularAttribute<Controleseguro, Seguroviagem> seguroviagem;
	public static volatile SingularAttribute<Controleseguro, Date> dataembarque;
}
