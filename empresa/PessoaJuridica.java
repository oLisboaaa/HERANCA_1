// Classe que representa uma Pessoa Jurídica, derivada de CadastroBase
class PessoaJuridica extends CadastroBase {
    private String cnpj;
    private String email;

    // Construtor que inicializa nome, endereço, CNPJ e email
    public PessoaJuridica(String nome, String endereco, String cnpj, String email) {
        super(nome, endereco); // Chama o construtor da classe base
        this.cnpj = Util.formatarCnpj(cnpj); // CNPJ é formatado ao ser definido
        this.email = email;
    }

    // Métodos getter e setter para o atributo 'cnpj'
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = Util.formatarCnpj(cnpj); // Formata CNPJ ao ser atualizado
    }

    // Métodos getter e setter para o atributo 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
