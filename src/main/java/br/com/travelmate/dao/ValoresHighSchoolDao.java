package br.com.travelmate.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.travelmate.connection.ConectionFactory;
import br.com.travelmate.model.Valoreshighschool;

public class ValoresHighSchoolDao {
    
    public Valoreshighschool salvar(Valoreshighschool valor) throws SQLException{
    	EntityManager manager;
       manager = ConectionFactory.getConnection();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
       valor = manager.merge(valor);
       tx.commit();
       manager.close();
       return valor;
   }
   
   public Valoreshighschool consultar(int idvalor) throws SQLException{
	   EntityManager manager;
      manager = ConectionFactory.getConnection();
      Query q = manager.createQuery("select v from Valoreshighschool  v where v.idvaloresHighSchool=" + idvalor);
      Valoreshighschool valor = null;
      if(q.getResultList().size()>0){
          valor =  (Valoreshighschool) q.getResultList().get(0);
      }
      manager.close();
      return valor;
   }
   
   public List<Valoreshighschool> listar(String sql) throws SQLException{
	   EntityManager manager;
       manager = ConectionFactory.getConnection();
       Query q = manager.createQuery(sql);
       List<Valoreshighschool> lista = q.getResultList();
       manager.close();
       return lista;
   }
   

}
