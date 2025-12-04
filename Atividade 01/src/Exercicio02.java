import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		String inputNum1 = JOptionPane.showInputDialog(null, "Digite o primeiro lado de um triângulo: ");
		double ld1 = Double.parseDouble(inputNum1);
		
		String inputNum2 = JOptionPane.showInputDialog(null, "Digite o segundo lado de um triângulo: ");
		double ld2 = Double.parseDouble(inputNum2);

		String inputNum3 = JOptionPane.showInputDialog(null, "Digite o terceiro lado de um triângulo: ");
		double ld3 = Double.parseDouble(inputNum3);

		String TrianguloReal;
		
		if(ld1 == ld2 && ld2 == ld3 && ld3 == ld1) {
			TrianguloReal = "Os três lados são iguais, é um Triangulo Equilátero";
		}
		
		else if(ld1 == ld2 || ld2 == ld3 || ld3 == ld1) {
			TrianguloReal = "Tem dois lados são iguais, é um Triangulo Isósceles";
		}
		
		else {
			TrianguloReal = "Não tem lados iguais, é um Triangulo Escaleno";
		}
		JOptionPane.showMessageDialog(null, TrianguloReal);
	}
}

