// Ex.15 Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa;
import javax.swing.JOptionPane;
public class hipotenusa
{
    public static void main (String argues[])
    {
        double hip;
        int ct1, ct2, at;
        ct1= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cateto 01: "));
        ct2= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cateto 02: "));
        at= (ct1*ct1)+(ct2*ct2);
        hip= (int) Math.sqrt(at);
        System.out.println("O valor da hipotenusa equivale a: " +hip);
    }
}