// Ex. 09 Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados;
import javax.swing.JOptionPane;
public class somaquadrados
{
    public static void main (String args[])
    {
        int x, y, soma;
        x= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para x: "));
        y= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para y: "));
        soma= ((x*x)+(y*y));
        System.out.println("O valor da soma dos quadrados equivale a: " +soma);
    }
}