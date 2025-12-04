import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		String inputTanq = JOptionPane.showInputDialog(null, "Digite a quantidade do seu tanque: ");
		double tanque = Double.parseDouble(inputTanq);
		String abastecer = JOptionPane.showInputDialog("Deseja abastecer álcool ou gasolina: ");
		if (abastecer.equals("álcool")) {
			double preco = tanque * 5.00;
			JOptionPane.showMessageDialog(null, "A quantidade que você ira gastar para completar seu tanque é:  R$" +preco);
		}
		else if (abastecer.equals("gasolina")) {
			double preco = tanque * 6.60;
			JOptionPane.showMessageDialog(null, "A quantidade que você ira gastar para completar seu tanque é:  R$" +preco);
		}
		else {
			JOptionPane.showMessageDialog(null, "Opção errada");
		}
	}

}
