package Tabelas;
// Generated 02/08/2023 20:30:23 by Hibernate Tools 4.3.1



/**
 * Combustivel generated by hbm2java
 */
public class Combustivel  implements java.io.Serializable {


     private char tipo;
     private String combust;

    public Combustivel() {
    }

	
    public Combustivel(char tipo) {
        this.tipo = tipo;
    }
    public Combustivel(char tipo, String combust) {
       this.tipo = tipo;
       this.combust = combust;
    }
   
    public char getTipo() {
        return this.tipo;
    }
    
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public String getCombust() {
        return this.combust;
    }
    
    public void setCombust(String combust) {
        this.combust = combust;
    }




}


