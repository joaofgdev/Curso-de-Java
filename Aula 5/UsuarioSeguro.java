// Classe UsuarioSeguro
public class UsuarioSeguro {
    private String login;
    private String senha;

    // Construtor
    public UsuarioSeguro(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // Métodos getters
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    // Métodos setters
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


public class Hacker {
    public static void main(String[] args) {
        // Criação do objeto UsuarioSeguro
        UsuarioSeguro user1 = new UsuarioSeguro("jotafagundezz@gmail.com", "123456");

        // Exibe os valores originais
        System.out.println("Login original: " + user1.getLogin());
        System.out.println("Senha original: " + user1.getSenha());

        // Tentativa de ataque frustrado (não há acesso direto aos atributos)
        // Exibe novamente os valores, que permanecem inalterados
        System.out.println("Login após ataque frustrado: " + user1.getLogin());
        System.out.println("Senha após ataque frustrado: " + user1.getSenha());
    }
}
}