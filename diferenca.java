// Ex. 10 Receba 2 números reais. Calcule e mostre a diferença desses valores;
import javax.swing.JOptionPane;
public class diferenca
{
    public static void main (String args [])
    {
        int x, y, diff;
        x= Integer.parseInt(JOptionPane.showInputDialog("O valor para o termo 1, vale: "));
        y= Integer.parseInt(JOptionPane.showInputDialog("O valor para o termo 2, vale: "));
        diff= x-y;
        System.out.println("A diferença entre os termos equivale a: " +diff);
    }
}