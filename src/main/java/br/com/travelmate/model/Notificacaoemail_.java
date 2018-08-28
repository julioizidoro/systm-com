package br.com.travelmate.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:10:40.161-0300")
@StaticMetamodel(Notificacaoemail.class)
public class Notificacaoemail_ {
	public static volatile SingularAttribute<Notificacaoemail, Integer> idnotificacaoEmail;
	public static volatile SingularAttribute<Notificacaoemail, String> tipoAviso;
	public static volatile SingularAttribute<Notificacaoemail, Usuario> usuario;
	public static volatile SingularAttribute<Notificacaoemail, Produtos> produtos;
}
