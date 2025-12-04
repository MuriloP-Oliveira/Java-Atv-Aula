package calcularArea;

public class CalculaArea {
	private int altura;
	private int largura;
	
	public CalculaArea(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public int calcularArea() {
		return this.largura * this.altura;
	}
	
	public String getDimensoes() {
		return "Altura: " + this.altura + ", Largura: " + this.largura;
	}
}
