// Classe que representa um Funcionário, derivada de CadastroBase
class Funcionario extends CadastroBase {
    private String cpf;
    private double salario;

    // Construtor que inicializa nome, endereço, CPF e salário
    public Funcionario(String nome, String endereco, String cpf, double salario) {
        super(nome, endereco); // Chama o construtor da classe base
        this.cpf = Util.formatarCpf(cpf); // CPF é formatado ao ser definido
        this.salario = salario;
    }

    // Métodos getter e setter para o atributo 'cpf'
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = Util.formatarCpf(cpf); // Formata CPF ao ser atualizado
    }

    // Métodos getter e setter para o atributo 'salario'
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
