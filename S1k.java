public class S1k {
    public static void main(String[] args) {
        int data = 190924; 
        int dia = data / 10000;
        int mes = (data / 100) % 100;
        int ano = data % 100;
        System.out.println("Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano);
    }
}