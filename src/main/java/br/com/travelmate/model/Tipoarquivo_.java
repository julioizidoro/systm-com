package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-14T09:19:56.611-0300")
@StaticMetamodel(Tipoarquivo.class)
public class Tipoarquivo_ {
	public static volatile SingularAttribute<Tipoarquivo, Integer> idtipoArquivo;
	public static volatile SingularAttribute<Tipoarquivo, String> descricao;
	public static volatile SingularAttribute<Tipoarquivo, String> unidade;
	public static volatile ListAttribute<Tipoarquivo, Arquivos> arquivosList;
	public static volatile SingularAttribute<Tipoarquivo, String> enviarcliente;
	public static volatile SingularAttribute<Tipoarquivo, Boolean> pertencefinanceiro;
	public static volatile SingularAttribute<Tipoarquivo, String> explicacao;
}
