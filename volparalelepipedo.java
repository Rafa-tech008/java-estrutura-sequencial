// Ex. 07 Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume;
import javax.swing.JOptionPane;
public class volparalelepipedo
{
    public static void main (String args [])
    {
       int comp, larg, alt, vol;
       comp= Integer.parseInt(JOptionPane.showInputDialog("O valor do comprimento equivale a: "));
       larg= Integer.parseInt(JOptionPane.showInputDialog("O valor da largura equivale a: "));
       alt= Integer.parseInt(JOptionPane.showInputDialog("O valor da altura equiavele a: "));
       vol= (comp*larg*alt);
       System.out.println ("O volume do paralelepípedo equivale a: " +vol);
    }
}