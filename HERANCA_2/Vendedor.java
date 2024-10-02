class Vendedor extends Pessoa {

    private String cpf;
    private String dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    // Construtor
    public Vendedor(String nome, String cpf, String dataNasc, String dataContratacao, String string, String string2, String string3, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNasc);  // Chama o construtor da classe mãe 
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
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

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    // Método para calcular o salário total
    public double calcularSalarioTotal(double vendas) {
        return salarioBase + (vendas * (percentualComissao / 100));
    }

    @Override
    public String status() {
        return super.status() + ", Data de Contratação: " + dataContratacao + ", Salário Base: " + salarioBase + ", Percentual de Comissão: " + percentualComissao;
    }
}
