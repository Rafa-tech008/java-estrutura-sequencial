// Ex. 11 Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência;
import javax.swing.JOptionPane;
public class compcircunferencia
{
    public static void main (String argues [])
    {
        int raio, pi, comp;
        pi= 3;
        raio= Integer.parseInt(JOptionPane.showInputDialog("O valor do raio equivale a: "));
        comp= (2*raio*pi);
        System.out.println("Logo, o comprimento equivale a: " +comp);
    }
}