import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		String inputNum1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
		double num1 = Double.parseDouble(inputNum1);
		
		String inputNum2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
		double num2 = Double.parseDouble(inputNum2);
		
		double maior = num1;
		double menor = num2;
		
		if(num1 < num2) {
			maior = num2;
			menor = num1;
		}
		double quadDoMenor = Math.pow(menor, 2);
		if (maior <= 0) {
			JOptionPane.showMessageDialog(null, "O quadrado do menor numero é "+ quadDoMenor +" e não é possivel calcular a raiz quadrada do maior numero");
		}
		else {
			double raizDoMaior = Math.sqrt(maior);
		JOptionPane.showMessageDialog(null, "O quadrado do menor numero é "+ quadDoMenor +" e a raiz quadrada do maior numero é "+ raizDoMaior);
		}
	}
}
