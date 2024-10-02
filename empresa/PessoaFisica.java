// Classe que representa uma Pessoa Física, derivada de CadastroBase
class PessoaFisica extends CadastroBase {
    private String cpf;
    private String email;

    // Construtor que inicializa nome, endereço, CPF e email
    public PessoaFisica(String nome, String endereco, String cpf, String email) {
        super(nome, endereco); // Chama o construtor da classe base
        this.cpf = Util.formatarCpf(cpf); // CPF é formatado ao ser definido
        this.email = email;
    }

    // Métodos getter e setter para o atributo 'cpf'
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = Util.formatarCpf(cpf); // Formata CPF ao ser atualizado
    }

    // Métodos getter e setter para o atributo 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
