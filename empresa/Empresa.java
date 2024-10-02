// Classe principal que simula a execução do programa
public class Empresa {
    public static void main(String[] args) {

        // Criação de objetos do tipo Pessoa Física
        PessoaFisica pf1 = new PessoaFisica("Joao Silva", "Rua A, 123", "12345678900", "joao.silva@gmail.com");
        PessoaFisica pf2 = new PessoaFisica("Mariana Costa", "Rua B, 456", "45678912300", "mariana.costa@gmail.com");
        PessoaFisica pf3 = new PessoaFisica("Roberto Brandao", "Rua C, 789", "78945612300",
                "roberto.brandao@gmail.com");

        // Criação de objetos do tipo Pessoa Jurídica
        PessoaJuridica emp1 = new PessoaJuridica("Tech Corp", "Av. Industrial, 456", "12345678000199",
                "contato@techcorp.com");
        PessoaJuridica emp2 = new PessoaJuridica("Peps Coke", "Av. Soda, 123", "90123456000177",
                "contato@pepscoke.com");
        PessoaJuridica emp3 = new PessoaJuridica("From Hardware", "Av. Steem, 789", "89012345000166",
                "contato@fromhardware.com");

        // Criação de objetos do tipo Funcionario
        Funcionario func1 = new Funcionario("Maria Souza", "Rua A, 123", "98765432100", 3500.00);
        Funcionario func2 = new Funcionario("Leonardo Fonceca", "Rua B, 456", "12345678900", 3500.00);
        Funcionario func3 = new Funcionario("Roberta Ferreira", "Rua C, 789", "45678912300", 3500.00);

        // Impressão das informações de Pessoa Física
        System.out.println("\n\nPessoa Fisica: " + pf1.getNome() + "\nEndereco: " + pf1.getEndereco() + "\nCPF: "
                + pf1.getCpf() + "\nE-mail: " + pf1.getEmail());

        System.out.println("\n\nPessoa Fisica: " + pf2.getNome() + "\nEndereco: " + pf2.getEndereco() + "\nCPF: "
                + pf2.getCpf() + "\nE-mail: " + pf2.getEmail());

        System.out.println("\n\nPessoa Fisica: " + pf3.getNome() + "\nEndereco: " + pf3.getEndereco() + "\nCPF: "
                + pf3.getCpf() + "\nE-mail: " + pf3.getEmail());

        System.out.println("\n\n##########################################################");

        // Impressão das informações de Pessoa Jurídica
        System.out.println("\n\nPessoa Juridica: " + emp1.getNome() + "\nEndereco: " + emp1.getEndereco() + "\nCNPJ: "
                + emp1.getCnpj() + "\nE-mail: " + emp1.getEmail());

        System.out.println("\n\nPessoa Juridica: " + emp2.getNome() + "\nEndereco: " + emp2.getEndereco() + "\nCNPJ: "
                + emp2.getCnpj() + "\nE-mail: " + emp2.getEmail());

        System.out.println("\n\nPessoa Juridica: " + emp3.getNome() + "\nEndereco: " + emp3.getEndereco() + "\nCNPJ: "
                + emp3.getCnpj() + "\nE-mail: " + emp3.getEmail());

        System.out.println("\n\n##########################################################");

        // Impressão das informações de Funcionários
        System.out.println("\n\nFuncionario: " + func1.getNome() + "\nEndereco: " + func1.getEndereco() + "\nCPF: "
                + func1.getCpf() + "\nSalário: " + func1.getSalario());

        System.out.println("\n\nFuncionario: " + func2.getNome() + "\nEndereco: " + func2.getEndereco() + "\nCPF: "
                + func2.getCpf() + "\nSalário: " + func2.getSalario());

        System.out.println("\n\nFuncionario: " + func3.getNome() + "\nEndereco: " + func3.getEndereco() + "\nCPF: "
                + func3.getCpf() + "\nSalário: " + func3.getSalario());
    }
}