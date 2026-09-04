// Ex.16 Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber;
import javax.swing.JOptionPane;
public class salario
{
    public static void main (String argues[])
    {
        int hs, vph, dep;
        double desc, sll, slb;
        hs= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        vph= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que é ganho por hora"));
        desc= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do desconto: "));
        dep= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));
        slb= (hs*vph);
        sll= (slb-(slb*(desc/100))+(100*dep));
        System.out.println("O valor do salário líquido equivale a: " +sll);
    }
}