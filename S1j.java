public class S1j {
    public static void main(String[] args) {
        String frase1 = "Olá Mundo";
        String frase2 = "Programação EM JAVA";
        String frase3 = "Vai corinthians";

        String metade1 = frase2.substring(0, frase2.length() / 2);
        String metade2 = frase3.substring(frase3.length() / 2);
        String metade3 = frase2.substring(frase2.length() / 2);
        String metade4 = frase1.substring(0, frase1.length() / 2);
        String metade5 = frase3.substring(0, frase3.length() / 2);
        String metade6 = frase1.substring(frase1.length() / 2);

        String embaralhada = metade1 + metade2 + metade3 + metade4 + metade5 + metade6;

        System.out.println("Frase embaralhada: " + embaralhada);
    }
}