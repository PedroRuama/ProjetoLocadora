
package Util;

import Tabelas.Categoria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class categoriaDAO {
    
    private Session sessao;

    public categoriaDAO() {

        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void Salvar(Categoria categoria) {
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate(categoria);
        t.commit();
    }

    public void Editar(Categoria categoria) {
        Transaction t = sessao.beginTransaction();
        sessao.update(categoria);
        t.commit();
    }

    public void Excluir(Categoria categoria) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(categoria);
        t.commit();

    }

    public List<Categoria> ListaCategoria() {

        Query query = sessao.createQuery("from Categoria");
        List<Categoria> listcategoria = (List<Categoria>) query.list();
        return listcategoria;
    }

    
    
}
