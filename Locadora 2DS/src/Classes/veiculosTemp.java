/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author aluno
 */
public class veiculosTemp {

    private static String placa;
    private static String marca;
    private static String modelo;
    private static String cor;
    private static Integer ano;
    private static Character comb;
    private static Integer cat;
    private static Boolean statusAlocado;

    public veiculosTemp() {
    }

    public static String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        veiculosTemp.placa = placa;
    }
    
    public static String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        veiculosTemp.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        veiculosTemp.modelo = modelo;
    }

    public static String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        veiculosTemp.cor = cor;
    }

    public static Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        veiculosTemp.ano = ano;
    }

    public static Character getComb() {
        return comb;
    }

    public void setComb(Character comb) {
        veiculosTemp.comb = comb;
    }

    public static Integer getCat() {
        return cat;
    }

    public void setCat(Integer cat) {
        veiculosTemp.cat = cat;
    }

    public static Boolean getStatusAlocado() {
        return statusAlocado;
    }

    public void setStatusAlocado(Boolean statusAlocado) {
        veiculosTemp.statusAlocado = statusAlocado;
    }

}
