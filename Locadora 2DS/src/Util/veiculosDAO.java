package Util;

import Tabelas.Veiculos;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class veiculosDAO {

    private Session sessao;

    public veiculosDAO() {

        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void Salvar(Veiculos veiculos) {
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate(veiculos);
        t.commit();
    }

    public void Editar(Veiculos veiculos) {
        Transaction t = sessao.beginTransaction();
        sessao.update(veiculos);
        t.commit();
    }

    public void Excluir(Veiculos veiculos) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(veiculos);
        t.commit();
    }

    public Veiculos Buscar(int codigo) {
        Transaction t = sessao.beginTransaction();
        Tabelas.Veiculos veiculos = new Tabelas.Veiculos();
        try {
            veiculos = (Veiculos) sessao.get(Veiculos.class, codigo);
            t.commit();
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
        sessao.close();
        return veiculos;
    }

    public List<Veiculos> ListaVeiculos() {
        Query query = sessao.createQuery("from Veiculos");
        List<Veiculos> listveiculos = (List<Veiculos>) query.list();
        return listveiculos;

    }

    public List<Veiculos> BuscarCliente(String texto) {
        int numero = 0;
        try {
            numero = Integer.valueOf(texto);
        } catch (NumberFormatException e) {
            System.out.println("O " + texto + " não é um numero");
        }
        texto = "%" + texto + "%";
        Query query = sessao.createQuery("from Client where cpf = :cod or nome like :detalhe");
        query.setInteger("cod", numero);
        query.setString("detalhe", texto);
        List<Veiculos> vei = (List<Veiculos>) query.list();
        return vei;
    }

}

