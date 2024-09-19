import javax.swing.JOptionPane;

public class S1d {
    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("Digite a primeira string:");
        String str2 = JOptionPane.showInputDialog("Digite a segunda string:");
        String str3 = JOptionPane.showInputDialog("Digite a terceira string:");
        int comprimentoTotal = str1.length() + str2.length() + str3.length();
        System.out.println("Soma dos comprimentos: " + comprimentoTotal);
    }
}