package calcularArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TelaCalculaArea extends JFrame {
	
	private JTextField campoAltura;
	private JTextField campoLargura;
	private JButton botaoCalcular;
	private JLabel labelResultado; 
	
	public TelaCalculaArea() {
		
		setTitle("Calculadora de Área");
		setSize(400, 200); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		campoAltura = new JTextField(10);
		campoLargura = new JTextField(10);
		botaoCalcular = new JButton("Calcular");
		labelResultado = new JLabel("Resultado: ---"); 
		
		add(new JLabel("Altura: "));
		add(campoAltura);
		add(new JLabel("Largura: "));
		add(campoLargura);
		add(botaoCalcular);
		add(labelResultado);
		
		
		botaoCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					int altura = Integer.parseInt(campoAltura.getText());
					int largura = Integer.parseInt(campoLargura.getText());
					
					CalculaArea calc = new CalculaArea(altura, largura);
					int area = calc.calcularArea();

					labelResultado.setText("Resultado: " + area);
					
				} catch (NumberFormatException ex) {
					labelResultado.setText("Erro: Digite números válidos!");
				}
			}
		});
	}
}
