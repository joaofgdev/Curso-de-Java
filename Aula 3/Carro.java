public class Carro {
    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    private String tipoCombustivel;
    private String cor;

    // Construtor com parâmetros
    public Carro(String marca, String modelo, int anoDeFabricacao, String tipoCombustivel, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
    }

    // Métodos set e get para cada atributo
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public class Main {
        public static void main(String[] args) {
            // Criando o primeiro carro com valores definidos diretamente
            Carro carro1 = new Carro("Toyota", "Corolla", 2022, "Gasolina", "Prata");
    
            // Exibindo detalhes do carro1
            System.out.println("Detalhes do carro1:");
            System.out.println("Marca: " + carro1.getMarca());
            System.out.println("Modelo: " + carro1.getModelo());
            System.out.println("Ano de Fabricação: " + carro1.getAnoDeFabricacao());
            System.out.println("Tipo de Combustível: " + carro1.getTipoCombustivel());
            System.out.println("Cor: " + carro1.getCor());
            System.out.println();
    
            // Criando um segundo carro com o construtor com parâmetros
            Carro carro2 = new Carro("Honda", "Civic", 2023, "Flex", "Preto");
    
            // Exibindo detalhes do carro2
            System.out.println("Detalhes do carro2:");
            System.out.println("Marca: " + carro2.getMarca());
            System.out.println("Modelo: " + carro2.getModelo());
            System.out.println("Ano de Fabricação: " + carro2.getAnoDeFabricacao());
            System.out.println("Tipo de Combustível: " + carro2.getTipoCombustivel());
            System.out.println("Cor: " + carro2.getCor());
        }
    }
    
    public class Auto {
        private String marca;
        private String modelo;
        private String cor;
        private int numportas;
    
        // Construtor com parâmetros
        public Auto(String marca, String modelo, String cor, int numportas) {
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.numportas = numportas;
        }
    
        // Métodos set e get para cada atributo
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public String getMarca() {
            return marca;
        }
    
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    
        public String getCor() {
            return cor;
        }
    
        public void setNumportas(int numportas) {
            this.numportas = numportas;
        }
    
        public int getNumportas() {
            return numportas;
        }
    }
    
}