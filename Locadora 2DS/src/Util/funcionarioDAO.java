package Util;

import Tabelas.Departamento;
import Tabelas.Funcionario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class funcionarioDAO {

    private Session sessao;

    public funcionarioDAO() {

        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void Salvar(Funcionario funcionario) {
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate(funcionario);
        t.commit();
    }

    public void Editar(Funcionario funcionario) {
        Transaction t = sessao.beginTransaction();
        sessao.update(funcionario);
        t.commit();
    }

    public void Excluir(Funcionario funcionario) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(funcionario);
        t.commit();
    }

    public List<Departamento> ListaDepartamento() {
        Query query = sessao.createQuery("from Departamento");
        List<Departamento> listdepto = (List<Departamento>) query.list();
        return listdepto;
    }

    public Funcionario Buscar(int codigo) {
        Transaction t = sessao.beginTransaction();
        Tabelas.Funcionario funcionario = new Tabelas.Funcionario();
        try {
            funcionario = (Funcionario) sessao.get(Funcionario.class, codigo);
            t.commit();
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
        sessao.close();
        return funcionario;
    }

    public List<Funcionario> ListaFuncionario() {
        Query query = sessao.createQuery("from Funcionario");
        List<Funcionario> listfuncionario = (List<Funcionario>) query.list();
        return listfuncionario;

    }

    public List<Funcionario> BuscarFuncionario(String texto) {
        int numero = 0;
        try {
            numero = Integer.valueOf(texto);
        } catch (NumberFormatException e) {
            System.out.println("O " + texto + " não é um numero");
        }
        texto = "%" + texto + "%";
        Query query = sessao.createQuery("from Funcionario where matricula = :cod or nome like :detalhe");
        query.setInteger("cod", numero);
        query.setString("detalhe", texto);
        List<Funcionario> func = (List<Funcionario>) query.list();
        return func;
    }

}
