// Ex. 04 Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
import javax.swing.JOptionPane;
public class convtemperatura
{
    public static void main (String argues[])
    {
        int cels, fahr;
        cels= Integer.parseInt (JOptionPane.showInputDialog("Digite um valor em Celsius: "));
        fahr= (((9*cels)+160)/5);
        System.out.println ("O valor em fahrenheit equivale a: " +fahr);
    }
}
