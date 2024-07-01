package ExtruturasExcepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23769909");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8)
            throw new CepInvalidException();
            return "23.7699-09";
    }
}
