public class Brinquedo {
    // Atributos da classe
    private String nome;
    private double velocidade;
    private double aceleracao;

    // Construtor padrão
    public Brinquedo() {
        this.nome = "Desconhecido";
        this.velocidade = 0.0;
        this.aceleracao = 0.0;
    }

    // Construtor com nome
    public Brinquedo(String nome) {
        this.nome = nome;
        this.velocidade = 0.0;
        this.aceleracao = 0.0;
    }

    // Método mover()
    public void mover() {
        System.out.println(nome + " está se movendo com velocidade de " + velocidade + " m/s.");
    }

    // Sobrecarga do método velocidade()
    public void velocidade(int vel) {
        this.velocidade = vel;
        System.out.println(nome + " agora tem velocidade de " + velocidade + " m/s (int).");
    }

    public void velocidade(double vel) {
        this.velocidade = vel;
        System.out.println(nome + " agora tem velocidade de " + velocidade + " m/s (double).");
    }

    public void velocidade(float vel, double ac) {
        this.velocidade = vel;
        this.aceleracao = ac;
        System.out.println(nome + " agora tem velocidade de " + velocidade + " m/s e aceleração de " + aceleracao + " m/s² (float, double).");
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criando objetos Brinquedo
        Brinquedo brinquedo1 = new Brinquedo();
        Brinquedo brinquedo2 = new Brinquedo("Carrinho");

        // Chamando métodos
        brinquedo1.mover();
        brinquedo1.velocidade(10); // int
        brinquedo1.mover();

        brinquedo2.mover();
        brinquedo2.velocidade(15.5); // double
        brinquedo2.mover();

        brinquedo2.velocidade(20.3f, 2.5); // float e double
        brinquedo2.mover();
    }
}
