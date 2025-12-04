import javax.swing.JOptionPane;

public class ContaPoupanca extends ContaBancaria{
	private double taxaJuros;
	public ContaPoupanca(double saldoInicial, double taxaJuros) {
		super(saldoInicial);
		this.taxaJuros = taxaJuros;
	}
	public void aplicarJuros() {
		double jurosAplicados = this.getSaldo() * (this.taxaJuros/12);
		this.setSaldo(this.getSaldo() + jurosAplicados);
		JOptionPane.showMessageDialog(null,String.format("Juros de R$ %.2f", this.getSaldo()), "Aplicação de Juros", JOptionPane.ERROR_MESSAGE);
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}

}
