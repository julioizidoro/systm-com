package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.119-0300")
@StaticMetamodel(Fornecedorcidade.class)
public class Fornecedorcidade_ {
	public static volatile SingularAttribute<Fornecedorcidade, Integer> idfornecedorcidade;
	public static volatile SingularAttribute<Fornecedorcidade, String> classificacao;
	public static volatile SingularAttribute<Fornecedorcidade, Integer> peso;
	public static volatile SingularAttribute<Fornecedorcidade, Cidade> cidade;
	public static volatile SingularAttribute<Fornecedorcidade, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Fornecedorcidade, Produtos> produtos;
	public static volatile ListAttribute<Fornecedorcidade, Valoresseguro> valoresseguroList;
	public static volatile SingularAttribute<Fornecedorcidade, String> texto;
	public static volatile SingularAttribute<Fornecedorcidade, String> imagem;
	public static volatile SingularAttribute<Fornecedorcidade, Integer> numestrelas;
	public static volatile SingularAttribute<Fornecedorcidade, Boolean> toptmstar;
	public static volatile SingularAttribute<Fornecedorcidade, Fornecedorcidadeguia> fornecedorcidadeguiaList;
	public static volatile ListAttribute<Fornecedorcidade, Fornecedorcidadedepoimento> fornecedorcidadedepoimentoList;
	public static volatile SingularAttribute<Fornecedorcidade, Boolean> ativo;
	public static volatile SingularAttribute<Fornecedorcidade, Boolean> work;
}
