class Data {
    int dia;
    int mes;
    int ano;

    // Construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}

class Endereço {
    String rua;
    String cidade;
    String estado;

    // Construtor
    public Endereço(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }
}

class Contato {
    String email;
    String telefone;

    // Construtor
    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }
}

class Pessoa {
    String nome;
    Data dataNasc;
    Endereço endereço;
    Contato contato;

    // Construtor
    public Pessoa(String nome, Data dataNasc, Endereço endereço, Contato contato) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereço = endereço;
        this.contato = contato;
    }
}
