public class main {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

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

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
    
    // Método para exibir os detalhes do carro
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Objeto opalao
        Carro opalao = new Carro();
        opalao.setMarca("Chevrolet");
        opalao.setModelo("Opala");
        opalao.setAno(1980);
        opalao.setCor("Preto");
        
        System.out.println("Detalhes do carro opalao:");
        opalao.exibirDetalhes();
        
        System.out.println();

        // Objeto outroCarro
        Carro outroCarro = new Carro();
        outroCarro.setMarca("Ford");
        outroCarro.setModelo("Mustang");
        outroCarro.setAno(2022);
        outroCarro.setCor("Vermelho");

        System.out.println("Detalhes do carro outroCarro:");
        outroCarro.exibirDetalhes();
    }
}

