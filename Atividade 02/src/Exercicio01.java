import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		String inputNum1 = JOptionPane.showInputDialog(null, "Digite o numero para dividir por 5: ");
		double num1 = Double.parseDouble(inputNum1);
		
		if (num1 % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O numero que você digitou '"+num1+"' é divisivel por 5");
		}
		else {
			JOptionPane.showMessageDialog(null, "O numero que você digitou '"+num1+"' não divisivel por 5");
		}
	}

}
