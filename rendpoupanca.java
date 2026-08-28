// Ex. 08 Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m;
import javax.swing.JOptionPane;
public class rendpoupanca
{
    public static void main (String args [])
    {
        double valor, rend;
        valor= Integer.parseInt(JOptionPane.showInputDialog("Defina um valor para o aporte: "));
        rend= (int) (valor+(valor*0.013));
        System.out.println ("O valor do rendimento em poupança vale: " +rend);
    }
}