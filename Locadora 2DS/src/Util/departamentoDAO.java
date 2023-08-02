package Util;

import Tabelas.Departamento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class departamentoDAO {

    private Session sessao;

    public departamentoDAO() {

        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void Salvar(Departamento departamento) {
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate(departamento);
        t.commit();
    }

    public void Editar(Departamento departamento) {
        Transaction t = sessao.beginTransaction();
        sessao.update(departamento);
        t.commit();
    }

    public void Excluir(Departamento departamento) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(departamento);
        t.commit();

    }

    public List<Departamento> ListaDepartamento() {

        Query query = sessao.createQuery("from Departamento");
        List<Departamento> listdepto = (List<Departamento>) query.list();
        return listdepto;
    }
}
