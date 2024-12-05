
// Classe Computador e seus componentes
class Computador {
    Teclado teclado;
    Monitor monitor;
    Memoria memoria;
    PlacaMae placaMae;

    public Computador(Teclado teclado, Monitor monitor, Memoria memoria, PlacaMae placaMae) {
        this.teclado = teclado;
        this.monitor = monitor;
        this.memoria = memoria;
        this.placaMae = placaMae;
    }
}

class Teclado {}
class Monitor {}
class Memoria {}
class PlacaMae {}

// Classe Livro e seus componentes
class Livro {
    Titulo titulo;
    Autor autor;
    Capitulo capitulo;
    Editora editora;

    public Livro(Titulo titulo, Autor autor, Capitulo capitulo, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulo = capitulo;
        this.editora = editora;
    }
}

class Titulo {}
class Autor {}
class Capitulo {}
class Editora {}

// Classe Monstro e seus componentes
class Monstro {
    Cabeca cabeca;
    Olho olho;
    Boca boca;
    Braco braco;
    Perna perna;

    public Monstro(Cabeca cabeca, Olho olho, Boca boca, Braco braco, Perna perna) {
        this.cabeca = cabeca;
        this.olho = olho;
        this.boca = boca;
        this.braco = braco;
        this.perna = perna;
    }
}

class Cabeca {}
class Olho {}
class Boca {}
class Braco {}
class Perna {}

// Exercício 3: Aplicação dos casos de composição

// Caso 1: Instanciação direta na classe Computador
class ComputadorCaso1 {
    PlacaMae placaMae = new PlacaMae();

    public ComputadorCaso1() {
        // Computador já possui uma Placa-Mãe
    }
}

// Caso 2: Passagem por parâmetro na classe Livro
class LivroCaso2 {
    Titulo titulo;
    Autor autor;

    public LivroCaso2(Titulo titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

// Caso 3: Instanciação no método na classe Monstro
class MonstroCaso3 {

    Cabeca criarCabeca() {
        return new Cabeca();
    }

    Boca criarBoca() {
        return new Boca();
    }
}
