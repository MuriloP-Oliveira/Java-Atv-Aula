import javax.swing.JOptionPane;

public class ContaBancaria {
	private double saldo;
	public ContaBancaria (double saldoInicial){
	 this.saldo = saldoInicial;
	}
	public double getSaldo(){
	return saldo;
	}
	protected void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	public void depositar (double quantia) {
		if (quantia > 0) {
			this.saldo +=quantia;
			JOptionPane.showMessageDialog(null, String.format("Depósito de R$ %.2f Realizado com sucesso!", quantia), "Deposito",JOptionPane.INFORMATION_MESSAGE); 
		} else {
			JOptionPane.showMessageDialog(null, "A quantia para depósito deve ser positiva.", "Erro de depósito", JOptionPane.ERROR_MESSAGE);
		}
	}
		
		public boolean sacar(double quantia) {
			if(quantia > 0) {
				if(quantia <=this.saldo) {
					this.saldo -= quantia;
					JOptionPane.showMessageDialog(null, String.format("Saque de R$.2f Feito, quantia"), "Saque", JOptionPane.INFORMATION_MESSAGE);
					return true;
				}else {
					JOptionPane.showMessageDialog(null, "Saldo Insuficiente para R$"+ String.format("%.2f", quantia)+".", "Erro de Saque", JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}else {
				JOptionPane.showMessageDialog(null, "a quantia deve ser positiva", "Erro de Saque", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
	}
