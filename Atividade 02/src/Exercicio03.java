import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		if (nome.startsWith("A") || nome.startsWith("a")) {
			JOptionPane.showMessageDialog(null, "Seu nome é"+nome);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Nome não começa com a.");
		}
	}

}
