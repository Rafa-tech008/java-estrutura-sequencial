// Ex.05 Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes);
import javax.swing.JOptionPane;
public class equacaosegundograu
{
    public static void main (String args [])
    {
        int a, b, c, delta, r1, r2;
        a= Integer.parseInt(JOptionPane.showInputDialog("O valor de a na equação vale: "));
        b= Integer.parseInt(JOptionPane.showInputDialog("O valor de b na equação vale: "));
        c= Integer.parseInt(JOptionPane.showInputDialog("O valor de c na equação vale: "));
        delta= ((b*b)+4*a*c);
        r1= ((-b + Math.sqrt(delta))/(2*a));
}