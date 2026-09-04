// Ex. 14 Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo;
import javax.swing.JOptionPane;
public class terceiroangulo
{
    public static void main (String argues [])
    {
        int a1, a2, a3;
        a1= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor equivalente ao ângulo 01: "));
        a2= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor equivalente ao ângulo 02: "));
        a3= (180-a1-a2);
        System.out.println("O terceiro ângulo vale: " +a3+ "º");
    }
}