import javax.swing.JOptionPane;

public class Exerecicio08 {

	public static void main(String[] args) {
		String inputNum = JOptionPane.showInputDialog(null, "Digite um número: ");
		double numero = Double.parseDouble(inputNum);
		
		if (numero > 20 && numero <90) {
			JOptionPane.showMessageDialog(null, "O número está entre 20 e 90");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "O número não está entre 20 e 90");
		}
	}

}
