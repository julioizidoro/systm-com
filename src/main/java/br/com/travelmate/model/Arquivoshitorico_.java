package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-07T14:31:31.370-0300")
@StaticMetamodel(Arquivoshitorico.class)
public class Arquivoshitorico_ {
	public static volatile SingularAttribute<Arquivoshitorico, Integer> idarquivoshitorico;
	public static volatile SingularAttribute<Arquivoshitorico, Date> data;
	public static volatile SingularAttribute<Arquivoshitorico, String> hora;
	public static volatile SingularAttribute<Arquivoshitorico, String> descricao;
	public static volatile SingularAttribute<Arquivoshitorico, Arquivos> arquivos;
	public static volatile SingularAttribute<Arquivoshitorico, Usuario> usuario;
}
