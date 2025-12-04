
public class Produto {
	private String nome;
	private int qntde;
	public Produto(String nome, int qntde) {
		this.nome = nome;
		this.qntde = qntde;
	}
	public String getNome() {
		return nome;
	}
	public int getQntde() {
		return qntde;
	}
	public String toString() {
		return nome + " - " + qntde + " Quantidade";
	}
}
