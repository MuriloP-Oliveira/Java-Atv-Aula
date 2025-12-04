import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		String inputDinheiro = JOptionPane.showInputDialog(null, "Digite quantos dolares você tem: ");
		double dinheiro = Double.parseDouble(inputDinheiro);
		String inputDolar = JOptionPane.showInputDialog(null, "Digite a cotação do dolar hoje: ");
		double dolar = Double.parseDouble(inputDolar);
		
		double Real = dinheiro * dolar;
		
		JOptionPane.showMessageDialog(null, "A quantidade de dolares convertido para reais é:  R$" +Real);
	}

}
