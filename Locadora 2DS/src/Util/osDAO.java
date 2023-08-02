package Util;

import Tabelas.Os;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class osDAO {
    
    private Session sessao;
    
    public osDAO () {
        
         this.sessao = HibernateUtil.getSessionFactory().openSession(); 
    } 
    
     public void Salvar (Os os){
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate(os);
        t.commit();
    }
    
     public void Editar(Os os){
        Transaction t = sessao.beginTransaction();
        sessao.update(os);
        t.commit();
    }
     
      public void Excluir(Os os){
        Transaction t = sessao.beginTransaction();
        sessao.delete(os);
        t.commit();
    
      }
}
