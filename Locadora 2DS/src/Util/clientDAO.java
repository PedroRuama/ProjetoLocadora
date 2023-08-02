/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Tabelas.Client;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class clientDAO {

    private Session sessao;

    public clientDAO() {
        this.sessao = HibernateUtil.getSessionFactory().openSession();

    }

    public void Salvar(Client client) {
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate(client);
        t.commit();
    }

    public void Editar(Client client) {
        Transaction t = sessao.beginTransaction();
        sessao.update(client);
        t.commit();
    }

    public void Excluir(Client client) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(client);
        t.commit();
    }

    public Client Buscar(int codigo) {
        Transaction t = sessao.beginTransaction();
        Tabelas.Client cliente = new Tabelas.Client();
        try {
            cliente = (Client) sessao.get(Client.class, codigo);
            t.commit();
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
        sessao.close();
        return cliente;
    }

    

    public List<Client> ListaClient() {
        Query query = sessao.createQuery("from Client");
        List<Client> listcliente = (List<Client>) query.list();
        return listcliente;

    }

    public List<Client> BuscarCliente(String texto) {
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
        List<Client> cli = (List<Client>) query.list();
        return cli;
    }

}
