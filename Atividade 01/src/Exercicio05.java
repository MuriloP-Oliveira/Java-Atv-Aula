import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		String inputpreco = JOptionPane.showInputDialog(null, "Digite o preço do produto: ");
		double preco = Double.parseDouble(inputpreco);
		String inputimp = JOptionPane.showInputDialog(null, "Digite o acréscimo do produto: ");
		double porcento = Double.parseDouble(inputimp);
		double porcentoReal = porcento / 100;
		double imposto = 1 + porcentoReal;
		double precoReal = preco * imposto;
		JOptionPane.showMessageDialog(null, "O preço do produto é:  R$" +precoReal);
	}

}
