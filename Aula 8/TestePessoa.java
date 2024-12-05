// Classe base
class Pessoa {
    private String nome;
    private String cpf;
    private String dataNasc;

    public Pessoa(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public void mostrarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNasc);
    }
}

// Classe Funcionário que herda de Pessoa
class Funcionario extends Pessoa {
    private String matricula;
    private double salario;

    public Funcionario(String nome, String cpf, String dataNasc, String matricula, double salario) {
        super(nome, cpf, dataNasc); // Chama o construtor da classe Pessoa
        this.matricula = matricula;
        this.salario = salario;
    }

    public void mostrarFuncionario() {
        mostrarPessoa(); // Chama o método da classe Pessoa
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: " + salario);
    }
}

// Classe ChefeDepartamento que herda de Funcionario
class ChefeDepartamento extends Funcionario {
    private String departamento;

    public ChefeDepartamento(String nome, String cpf, String dataNasc, String matricula, double salario, String departamento) {
        super(nome, cpf, dataNasc, matricula, salario); // Chama o construtor da classe Funcionario
        this.departamento = departamento;
    }

    public void mostrarChefe() {
        mostrarFuncionario(); // Chama o método da classe Funcionario
        System.out.println("Departamento: " + departamento);
    }
}

// Classe Aluno que herda de Pessoa
class Aluno extends Pessoa {
    private String matriculaAluno;
    private String curso;

    public Aluno(String nome, String cpf, String dataNasc, String matriculaAluno, String curso) {
        super(nome, cpf, dataNasc); // Chama o construtor da classe Pessoa
        this.matriculaAluno = matriculaAluno;
        this.curso = curso;
    }

    public void mostrarAluno() {
        mostrarPessoa(); // Chama o método da classe Pessoa
        System.out.println("Matrícula do Aluno: " + matriculaAluno);
        System.out.println("Curso: " + curso);
    }
}

// Classe TestaTudo com o método main
public class TestePessoa {
    public static void main(String[] args) {
        // Instanciando objetos
        Pessoa pessoa = new Pessoa("João da Silva", "123.456.789-00", "01/01/2000");
        Funcionario funcionario = new Funcionario("Maria Oliveira", "987.654.321-00", "02/02/1985", "F123", 3000.00);
        ChefeDepartamento chefe = new ChefeDepartamento("Carlos Santos", "456.789.123-00", "03/03/1975", "F456", 5000.00, "Recursos Humanos");
        Aluno aluno = new Aluno("Ana Paula", "321.654.987-00", "04/04/2002", "A789", "Engenharia");

        // Exibindo os valores dos atributos
        System.out.println("=== Pessoa ===");
        pessoa.mostrarPessoa();
        System.out.println("\n=== Funcionário ===");
        funcionario.mostrarFuncionario();
        System.out.println("\n=== Chefe de Departamento ===");
        chefe.mostrarChefe();
        System.out.println("\n=== Aluno ===");
        aluno.mostrarAluno();
    }
}