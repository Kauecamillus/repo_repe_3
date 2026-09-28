package repeticao_3;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        int[] num = new int[15];
        for (int i = 0; i < num.length; i++) {
            String num1 = JOptionPane.showInputDialog(null,"Insira um número:");
            num[i] = Integer.parseInt(num1);
        }
        int maior = num[0];
        
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
        }
        JOptionPane.showMessageDialog(null, maior);
    }
}