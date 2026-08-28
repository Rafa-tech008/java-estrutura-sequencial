// Ex 03. Receba a base e a altura de um triângulo. Calcule e mostre sua área;
import javax.swing.JOptionPane;
public class areatriangulo
{
        public static void main (String args [])
        {
            int base, alt, area;
            base= Integer.parseInt (JOptionPane.showInputDialog("Valor da base: "));
            alt= Integer.parseInt (JOptionPane.showInputDialog("Valor da altura: "));
            area= ((base*alt)/2);
            System.out.println ("A área do quadrado equivale a: " +area);
        }
}