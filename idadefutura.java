// Ex.12 Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos;
import javax.swing.JOptionPane;
public class idadefutura
{
    public static void main (String argues [])
    {
        int dn, ana, anf, id;
        dn= Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu: "));
        ana= Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que estamos: "));
        id=(ana-dn);
        anf=(id+17);
        System.out.println("Após 17 anos, você terá " +anf+ " anos");
    }
}