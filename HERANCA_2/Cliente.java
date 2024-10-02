class Cliente extends Pessoa {



    private String nome;
    private String cpf;
    private String dataNasc;
    private String email;
    private String nCartaoFidelidade;
    private String telefone;
    

    // Construtor
    public Cliente(String nome, String cpf, String dataNasc, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNasc);  // Chama o construtor da classe mãe
        this.email = email;
        this.nCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    //Getters e Setters
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

    public void setDataNascimento(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNCartaoFidelidade() {
        return nCartaoFidelidade;
    }

    public void setNCartaoFidelidade(String nCartaoFidelidade) {
        this.nCartaoFidelidade = getNCartaoFidelidade();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    


    // Método status que retorna as informações da pessoa
    @Override
    public String status() {
        return super.status()+"email: "+ email+ ", cartao fidelidade: "+getNCartaoFidelidade()+", telefone: "+telefone;
    }


}