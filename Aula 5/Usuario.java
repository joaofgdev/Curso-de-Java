public class Usuario {
    public String login;
    public String senha;

    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

public class Hacker{
    public static void main(String[] args){
    Usuario user1 = new Usuario("jotafagundezz@gmail.com", "123456");

    System.out.println("Login original: " + user1.login);
    System.out.println("Senha original: " + user1.senha);

    user1.login = "haker@gmail.com";
    user1.senha = "123456hacker";

    System.out.println("Login novo: " + user1.login);
    System.out.println("Senha nova: "+ user1.senha);

}}}
