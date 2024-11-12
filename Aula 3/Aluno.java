public class Aluno {
    private String nome;
    private int idade;
    private String turma;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    // Construtor vazio
    public Aluno() {
    }

    // Construtor parametrizado
    public Aluno(String nome, int idade, String turma, double nota1, double nota2, double nota3, double nota4, double nota5) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }

    // Métodos set e get para cada atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public double getNota5() {
        return nota5;
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
    }

    // Método para imprimir informações do aluno
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Turma: " + turma);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + ", " + nota5);
        System.out.println("Média: " + calcularMedia());
        System.out.println();
    }
    public class Main {
        public static void main(String[] args) {
            // Objeto aluno1 criado com o construtor vazio e configurado com métodos set
            Aluno aluno1 = new Aluno();
            aluno1.setNome("Maria");
            aluno1.setIdade(16);
            aluno1.setTurma("3A");
            aluno1.setNota1(8.5);
            aluno1.setNota2(7.0);
            aluno1.setNota3(9.0);
            aluno1.setNota4(6.5);
            aluno1.setNota5(7.5);
            System.out.println("Informações de aluno1:");
            aluno1.imprimirInformacoes();
    
            // Objeto aluno2 criado com o construtor parametrizado
            Aluno aluno2 = new Aluno("Carlos", 17, "3B", 6.0, 8.0, 7.5, 9.0, 7.0);
            System.out.println("Informações de aluno2:");
            aluno2.imprimirInformacoes();
    
            // Objeto aluno3 criado com o construtor vazio e configurado com métodos set
            Aluno aluno3 = new Aluno();
            aluno3.setNome("Ana");
            aluno3.setIdade(16);
            aluno3.setTurma("2C");
            aluno3.setNota1(9.5);
            aluno3.setNota2(8.5);
            aluno3.setNota3(10.0);
            aluno3.setNota4(9.0);
            aluno3.setNota5(8.5);
            System.out.println("Informações de aluno3:");
            aluno3.imprimirInformacoes();
        }
    }
    
}

