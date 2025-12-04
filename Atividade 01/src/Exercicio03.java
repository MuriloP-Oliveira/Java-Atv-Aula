import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		String inputNum = JOptionPane.showInputDialog(null, "Digite seu IMC: ");
		double IMC = Double.parseDouble(inputNum);
		if(IMC < 18.5) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
		}
		else if(IMC >= 18.5 && IMC <24.99) {
			JOptionPane.showMessageDialog(null, "Você está com o peso recomendado");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você está acima do peso");
		}
	}

}
