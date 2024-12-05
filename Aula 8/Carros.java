public class Carros {

    // Classe Transporte
    public static class Transporte {
        public int capacidade; // Atributo agora é público
    }

    // Classe Terrestre
    public static class Terrestre extends Transporte {
        public int numRodas; // Atributo agora é público
    }

    // Classe Automóvel
    public static class Automóvel extends Terrestre {
        public String modelo; // Atributo agora é público
    }

    public static void main(String[] args) {
        // Criação do objeto Automóvel
        Automóvel automovel = new Automóvel();

        // Configurando atributos diretamente
        automovel.capacidade = 5; // Acesso direto
        automovel.numRodas = 4;   // Acesso direto
        automovel.modelo = "Sedan"; // Acesso direto

        // Recuperando e exibindo atributos diretamente
        System.out.println("Capacidade: " + automovel.capacidade);
        System.out.println("Número de rodas: " + automovel.numRodas);
        System.out.println("Modelo: " + automovel.modelo);
    }
}
