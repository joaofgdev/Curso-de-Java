// Classe base Pessoa
class Pessoa {
    private String nome;
    private int idade;

    // Construtores sobrecarregados
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this(nome, 0); // Chama o construtor com idade padrão 0
    }

    public Pessoa() {
        this("Nome Padrão", 0); // Chama o construtor com valores padrão
    }

    public void mostraDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

// Classe Cliente que herda de Pessoa
class Cliente extends Pessoa {
    private String cpf;
    private String dataCadastro;

    // Construtores sobrecarregados
    public Cliente(String nome, int idade, String cpf, String dataCadastro) {
        super(nome, idade);
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public Cliente(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
        this.dataCadastro = "Data Padrão"; // Valor padrão
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("CPF: " + cpf + ", Data de Cadastro: " + dataCadastro);
    }
}

// Classe Funcionario que herda de Pessoa
class Funcionario extends Pessoa {
    private String matricula;
    private double salario;

    // Construtores sobrecarregados
    public Funcionario(String nome, int idade, String matricula, double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
        this.salario = 0.0; // Valor padrão
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Matrícula: " + matricula + ", Salário: " + salario);
    }
}

// Classe Gerente que herda de Funcionario
class Gerente extends Funcionario {
    private String departamento;

    // Construtores sobrecarregados
    public Gerente(String nome, int idade, String matricula, double salario, String departamento) {
        super(nome, idade, matricula, salario);
        this.departamento = departamento;
    }

    public Gerente(String nome, String departamento) {
        super(nome, "Matrícula Padrão");
        this.departamento = departamento;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Departamento: " + departamento);
    }
}

// Classe CadastroPessoas
class CadastroPessoas {
    private Pessoa[] pessoas;
    private int contador;

    public CadastroPessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        contador = 0;
    }

    public void cadastrarPessoa(Pessoa p) {
        if (contador < pessoas.length) {
            pessoas[contador] = p;
            contador++;
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    public void mostraCadastro() {
        for (int i = 0; i < contador; i++) {
            pessoas[i].mostraDados();
            System.out.println(); // Linha em branco para melhor visualização
        }
    }
}

// Classe principal para testar a implementação
public class Main {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas(5);

        // Cadastrando pessoas
        cadastro.cadastrarPessoa(new Cliente("Alice", 30, "123.456.789-00", "01/01/2023"));
        cadastro.cadastrarPessoa(new Funcionario("Bob", 25, "F123", 3000.00));
        cadastro.cadastrarPessoa(new Gerente("Charlie", 40, "G456", 5000.00, "Vendas"));

        // Mostrando cadastro
        cadastro.mostraCadastro();
    }
}