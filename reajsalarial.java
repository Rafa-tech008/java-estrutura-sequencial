// Ex.02 Coletar o lado de um quadrado, calcular e apresentar a área;
import javax.swing.JOptionPane;
public class reajsalarial
{
        public static void main (String args [])
        {
            int sal, reaj;
            sal= Integer.parseInt (JOptionPane.showInputDialog("Valor do salário: "));
            reaj= sal + ((sal*15)/100);
            System.out.println ("O novo salário equivale a: " +reaj);
        }
}