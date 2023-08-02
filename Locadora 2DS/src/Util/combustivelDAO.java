package Util;

import Tabelas.Combustivel;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class combustivelDAO {

    private Session sessao;

    public combustivelDAO() {

        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void Salvar(Combustivel combustivel) {
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate(combustivel);
        t.commit();
    }

    public void Editar(Combustivel combustivel) {
        Transaction t = sessao.beginTransaction();
        sessao.update(combustivel);
        t.commit();
    }

    public void Excluir(Combustivel combustivel) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(combustivel);
        t.commit();

    }

    public List<Combustivel> ListaCombustivel() {

        Query query = sessao.createQuery("from Combustivel");
        List<Combustivel> listcombustivel = (List<Combustivel>) query.list();
        return listcombustivel;
    }

 

}
