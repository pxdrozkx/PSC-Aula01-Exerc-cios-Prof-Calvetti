public class S1l {
    public static void main(String[] args) {
        String data = "19/09/24"; 
        String[] partes = data.split("/");
        System.out.println("Dia: " + partes[0] + ", Mes: " + partes[1] + ", Ano: " + partes[2]);
    }
}