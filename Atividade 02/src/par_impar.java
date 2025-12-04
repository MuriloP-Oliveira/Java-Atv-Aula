import javax.swing.JOptionPane;

public class par_impar {

	public static void main(String[] args) {
		int totalNumeros = 5;
		int contador = 1;
		
		JOptionPane.showMessageDialog(null, "Você irá digitar "+ totalNumeros + "Numeros.", "Par ou Impar", JOptionPane.INFORMATION_MESSAGE);
		while(contador <=totalNumeros) {
			String numeroStr = JOptionPane.showInputDialog(null, "Digite o "+ contador +"° numero", "Entrada de numero ("+contador+" de "+totalNumeros+")",JOptionPane.QUESTION_MESSAGE);
			Double numero = Double.parseDouble(numeroStr);
			contador ++;
			if (numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O numero que você digitou '"+numero+"' é Par");
			}
			else {
				JOptionPane.showMessageDialog(null, "O numero que você digitou '"+numero+"' é Impar");
			}
		}
	}

}
