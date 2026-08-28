// Ex01. Coletar o lado de um quadrado, calcular e apresentar a área;
import javax.swing.JOptionPane;
public class areaquadrado
{
    public static void main (String args [])
    {
        int quad, area;
        quad= Integer.parseInt (JOptionPane.showInputDialog("Defina o valor do lado: "));
        area = quad * quad;
        System.out.println ("A área do quadrado é: " +area);
    }
}