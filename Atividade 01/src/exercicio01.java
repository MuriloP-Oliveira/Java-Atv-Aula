import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		String salario = JOptionPane.showInputDialog(null,"Digite seu Salario: ");
		double valorSalario = Double.parseDouble(salario);
		
		double  ValorSalarioImposto;
		String SalarioReal = null;
		
		if(valorSalario < 1000.00) {
			SalarioReal = "Seu salario é: R$" +valorSalario;
		}
		
		else if(valorSalario >= 1000.00 && valorSalario <= 2200.00) {
			ValorSalarioImposto = valorSalario * 0.87;
			SalarioReal = "Seu salario com 13% de imposto é: R$" +ValorSalarioImposto;
		}
		
		else if(valorSalario >2200.00) {
			ValorSalarioImposto = valorSalario * 0.78;
			SalarioReal = "Seu salario com 22% de imposto é: R$" +ValorSalarioImposto;
		}
		JOptionPane.showMessageDialog(null, SalarioReal);
	}

}
