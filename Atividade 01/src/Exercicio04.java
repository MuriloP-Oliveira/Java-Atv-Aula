import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		String inputAno = JOptionPane.showInputDialog(null, "Digite seu ano de nacimento: ");
		double ano = Double.parseDouble(inputAno);
		double idade;
		idade = 2025 - ano;
		if (idade < 18) {
			JOptionPane.showMessageDialog(null, "Você não é obrigado a votar");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Você é obrigado a votar");
		}

	}

}
