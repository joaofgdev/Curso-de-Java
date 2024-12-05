// Classe base
public class FiguraGeometrica {
    // Método desenha() a ser sobrescrito pelas subclasses
    public void desenha() {
        System.out.println("Desenhando uma figura geométrica genérica.");
    }
}

// Subclasse Circulo
class Circulo extends FiguraGeometrica {
    @Override
    public void desenha() {
        System.out.println("Desenhando um círculo.");
    }
}

// Subclasse Quadrado
class Quadrado extends FiguraGeometrica {
    @Override
    public void desenha() {
        System.out.println("Desenhando um quadrado.");
    }
}

// Subclasse Triangulo
class Triangulo extends FiguraGeometrica {
    @Override
    public void desenha() {
        System.out.println("Desenhando um triângulo.");
    }
}

// Subclasse TrianguloEquilatero (herda de Triangulo)
class TrianguloEquilatero extends Triangulo {
    @Override
    public void desenha() {
        System.out.println("Desenhando um triângulo equilátero.");
    }
}

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        // Criando objetos de cada classe
        FiguraGeometrica figura = new FiguraGeometrica();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero();

        // Chamando os métodos desenha()
        figura.desenha();
        circulo.desenha();
        quadrado.desenha();
        triangulo.desenha();
        trianguloEquilatero.desenha();
    }
}

