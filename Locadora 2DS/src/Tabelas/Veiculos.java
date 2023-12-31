package Tabelas;
// Generated 02/08/2023 20:30:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Veiculos generated by hbm2java
 */
public class Veiculos  implements java.io.Serializable {


     private String placa;
     private String marca;
     private String modelo;
     private String cor;
     private Integer ano;
     private Character comb;
     private Integer cat;
     private Boolean statusAlocado;
     private Set oses = new HashSet(0);

    public Veiculos() {
    }

	
    public Veiculos(String placa) {
        this.placa = placa;
    }
    public Veiculos(String placa, String marca, String modelo, String cor, Integer ano, Character comb, Integer cat, Boolean statusAlocado, Set oses) {
       this.placa = placa;
       this.marca = marca;
       this.modelo = modelo;
       this.cor = cor;
       this.ano = ano;
       this.comb = comb;
       this.cat = cat;
       this.statusAlocado = statusAlocado;
       this.oses = oses;
    }
   
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getAno() {
        return this.ano;
    }
    
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public Character getComb() {
        return this.comb;
    }
    
    public void setComb(Character comb) {
        this.comb = comb;
    }
    public Integer getCat() {
        return this.cat;
    }
    
    public void setCat(Integer cat) {
        this.cat = cat;
    }
    public Boolean getStatusAlocado() {
        return this.statusAlocado;
    }
    
    public void setStatusAlocado(Boolean statusAlocado) {
        this.statusAlocado = statusAlocado;
    }
    public Set getOses() {
        return this.oses;
    }
    
    public void setOses(Set oses) {
        this.oses = oses;
    }




}


