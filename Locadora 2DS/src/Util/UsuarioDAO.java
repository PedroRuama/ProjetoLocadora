
package Util;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class UsuarioDAO {
    public void VerificarUsuario(String login, String senha) {
        if(( senha.equals("123456")) && login.equals ("aulads")) {
            JOptionPane.showMessageDialog(null,"Usuario correto. Bem vindo ao sistema!");
        } 
        else{
            JOptionPane.showMessageDialog(null,"Usuario incorreto");
        }
    }
   }
