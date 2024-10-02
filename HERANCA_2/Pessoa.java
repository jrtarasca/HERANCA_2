class Pessoa {

    private String nome;
    private String cpf;
    private String dataNasc;

    // Construtor com nome, cpf e data de nascimento
    public Pessoa(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    // Método status que retorna as informações da pessoa
    public String status() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataNasc;
    }
}
