// Ex. 14 Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
import javax.swing.JOptionPane;
public class alimentacaodiaria
{
    public static void main (String argues [])
    {
        int food, dias;
        food= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de comida em gramas: "));
        dias= (food/50);
        System.out.println("A pessoa come " +food+ "g em " +dias+ " dias");
    }
}