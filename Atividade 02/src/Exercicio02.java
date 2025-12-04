import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		String inputNum1 = JOptionPane.showInputDialog(null, "Digite seu ano de nascimento: ");
		double num1 = Double.parseDouble(inputNum1);
		String inputAno = JOptionPane.showInputDialog(null, "Digite o ano atual: ");
		double ano = Double.parseDouble(inputAno);
		
		double idade = ano - num1;
		if (idade < 0) {
			JOptionPane.showMessageDialog(null, "ERRO!! você digitou um ano invalido");
		}
		else {
		JOptionPane.showMessageDialog(null, "Sua idade é "+ idade);
		}
	}
}
