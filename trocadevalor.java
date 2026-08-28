// Ex. 05 Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
import javax.swing.JOptionPane;
public class trocadevalor
{
    public static void main (String args[])
    {
        int x, y, x1, y1;
        x= Integer.parseInt (JOptionPane.showInputDialog("Digite um valor para x: "));
        y= Integer.parseInt (JOptionPane.showInputDialog("Digite um valor para y: "));
        x1= y;
        y1= x;
        System.out.println ("O novo valor de x equivale a: " +x1);
        System.out.println ("O novo valor de y equivale a: " +y1);        
    }
}