package Classes;

public class Usuario {

    private static String login;
    private static String password;

    public Usuario(String login, String password) { //contrutor
        setLogin(login);
        setSenha(password);
    }

    public String getLogin(String login) {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha(String senha) {
        return senha;
    }

    public void setSenha(String senha) {
        this.password = senha;
    }
}