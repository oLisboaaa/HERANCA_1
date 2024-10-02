// Classe utilitária para formatação de CPF e CNPJ
class Util {
    // Método estático para formatar CPF (ex: 12345678900 -> 123.456.789-00)
    public static String formatarCpf(String cpf) {
        cpf = cpf.replaceAll("\\D", ""); // Remove todos os caracteres não numéricos
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos.");
        }
        // Aplica a máscara de formatação
        return cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    // Método estático para formatar CNPJ (ex: 12345678000199 -> 12.345.678/0001-99)
    public static String formatarCnpj(String cnpj) {
        cnpj = cnpj.replaceAll("\\D", ""); // Remove todos os caracteres não numéricos
        if (cnpj.length() != 14) {
            throw new IllegalArgumentException("CNPJ deve ter 14 dígitos.");
        }
        // Aplica a máscara de formatação
        return cnpj.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
    }
}
