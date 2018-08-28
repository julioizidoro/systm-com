package br.com.travelmate.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.194-0300")
@StaticMetamodel(Pacotesfornecedor.class)
public class Pacotesfornecedor_ {
	public static volatile SingularAttribute<Pacotesfornecedor, Integer> idpacotesfornecedor;
	public static volatile SingularAttribute<Pacotesfornecedor, Date> datapagamento;
	public static volatile SingularAttribute<Pacotesfornecedor, Integer> idprodutotrecho;
	public static volatile SingularAttribute<Pacotesfornecedor, String> tipoprodutotrecho;
	public static volatile SingularAttribute<Pacotesfornecedor, Boolean> comprovante;
	public static volatile SingularAttribute<Pacotesfornecedor, Boolean> emailenviado;
	public static volatile SingularAttribute<Pacotesfornecedor, Float> valor;
	public static volatile SingularAttribute<Pacotesfornecedor, String> numeroreserva;
	public static volatile SingularAttribute<Pacotesfornecedor, Pacotes> pacotes;
	public static volatile SingularAttribute<Pacotesfornecedor, Fornecedor> fornecedor;
}
