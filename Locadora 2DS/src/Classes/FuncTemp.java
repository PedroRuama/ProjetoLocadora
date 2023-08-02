/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class FuncTemp {

    private static int matricula;
    private static String nome;
    private static Integer depto;
    private static BigDecimal salario;
    private static Date admissao;
    private static Integer filho;
    private static String sexo;
    private static Boolean ativo;

    public FuncTemp() {
    }

    public static int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        FuncTemp.matricula = matricula;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        FuncTemp.nome = nome;
    }

    public static Integer getDepto() {
        return depto;
    }

    public void setDepto(Integer depto) {
        FuncTemp.depto = depto;
    }

    public static BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        FuncTemp.salario = salario;
    }

    public static Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        FuncTemp.admissao = admissao;
    }

    public static Integer getFilho() {
        return filho;
    }

    public void setFilho(Integer filho) {
        FuncTemp.filho = filho;
    }

    public static String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        FuncTemp.sexo = sexo;
    }

    public static Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        FuncTemp.ativo = ativo;
    }

    
}
