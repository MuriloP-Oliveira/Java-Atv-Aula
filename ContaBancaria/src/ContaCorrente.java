import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria {
	private double limite;
	
	public ContaCorrente(double saldoInicial, double LimiteInicial) {
		super(saldoInicial);
		this.limite = LimiteInicial;
	}
	public double getLimite() {
		return limite;
	}
	public boolean sacar(double quantia) {
		if(quantia > 0 ) {
			if(quantia <=this.getSaldo() + this.limite) {
				this.setSaldo(this.getSaldo() - quantia);
				JOptionPane.showMessageDialog(null,String.format("Saque de R$ 5.2f realizado com sucesso!",quantia)+"\nNovo Saldo: R$ " + String.format("5.2f",this.getSaldo()),"Saque Conta Corrente",JOptionPane.INFORMATION_MESSAGE);
			return true;			
			}else {
				JOptionPane.showMessageDialog(null,"saldo e limite insuficiente.\n"+"Total disponível(saldo + limite): R$ "+ String.format("%2.f",(this.getSaldo() + this.limite)),"Erro de saque",JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}else {
			JOptionPane.showMessageDialog(null,"A quantia para saque deve ser positiva", "Erro de saque",JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
 
}

