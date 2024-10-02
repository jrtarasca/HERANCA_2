class Gerente extends Pessoa {

    private String cpf;
    private String dataContratacao;
    private double salarioBase;
    private String departamento;

    // Construtor
    public Gerente(String nome, String cpf, String dataNasc, String dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNasc);  // Chama o construtor da classe mãe 
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Método status que retorna as informações do funcionário
    @Override
    public String status() {
        return super.status() + ", Data de Contratação: " + dataContratacao + ", Salário Base: " + salarioBase + ", Departamento: " + departamento;
    }
}
