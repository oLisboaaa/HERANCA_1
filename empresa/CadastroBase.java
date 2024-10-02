// Classe base para cadastro de qualquer entidade com atributos comuns nome e endereço
class CadastroBase {
    private String nome;
    private String endereco;

    // Construtor que inicializa nome e endereço
    public CadastroBase(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos getter e setter para o atributo 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para o atributo 'endereco'
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
