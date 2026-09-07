// Ex. 17 Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média;
import javax.swing.JOptionPane;
public class combustivelgasto
{
	public static void main(String[] args)
	{
		double lts;
		int temp, vm, dist;
		temp= Integer.parseInt(JOptionPane.showInputDialog("Digite a tempo de duração do trajeto em segundos: "));
		vm= Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média durante o trajeto em m/s: "));
		dist= vm*temp;
		lts= (dist/12000.0);
		System.out.println("A quantidade de combustível gasta em litros, equivale a: " +lts+ "l");
	}

}
