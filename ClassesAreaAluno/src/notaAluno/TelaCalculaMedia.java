package notaAluno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCalculaMedia extends JFrame {
	 private JTextField campoNome;
	 private JTextField campoNotaExercicio;
	 private JTextField campoNotaTrabalho;
	 private JTextField campoNotaProva;
	 private JTextField campoPesoExercicio;
	 private JTextField campoPesoTrabalho;
	 private JTextField campoPesoProva;
	 private JButton botaoCalcular;
	 private JLabel labelResultado;

	    public TelaCalculaMedia() {
	        setTitle("Cálculo de Média Ponderada");
	        setSize(350, 350);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); 

	        add(new JLabel("Nome Aluno:"));
	        campoNome = new JTextField(25);
	        add(campoNome);

	        add(new JLabel("Nota Exercício:"));
	        campoNotaExercicio = new JTextField(10);
	        add(campoNotaExercicio);

	        add(new JLabel("Nota Trabalho:"));
	        campoNotaTrabalho = new JTextField(10);
	        add(campoNotaTrabalho);

	        add(new JLabel("Nota Prova:"));
	        campoNotaProva = new JTextField(10);
	        add(campoNotaProva);

	        add(new JLabel("Peso Exercício (ex: 0.2):"));
	        campoPesoExercicio = new JTextField(10);
	        add(campoPesoExercicio);

	        add(new JLabel("Peso Trabalho (ex: 0.3):"));
	        campoPesoTrabalho = new JTextField(10);
	        add(campoPesoTrabalho);

	        add(new JLabel("Peso Prova (ex: 0.5):"));
	        campoPesoProva = new JTextField(10);
	        add(campoPesoProva);

	        botaoCalcular = new JButton("Calcular Média");
	        add(botaoCalcular);

	        labelResultado = new JLabel("Resultado: ---");
	        labelResultado.setFont(new Font("Arial", Font.BOLD, 14)); 
	        add(labelResultado);

	        botaoCalcular.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    String nome = campoNome.getText();
	                    double notaEx = Double.parseDouble(campoNotaExercicio.getText());
	                    double notaTr = Double.parseDouble(campoNotaTrabalho.getText());
	                    double notaPr = Double.parseDouble(campoNotaProva.getText());
	                    double pesoEx = Double.parseDouble(campoPesoExercicio.getText());
	                    double pesoTr = Double.parseDouble(campoPesoTrabalho.getText());
	                    double pesoPr = Double.parseDouble(campoPesoProva.getText());
	                    Aluno aluno = new Aluno(nome, notaEx, notaTr, notaPr);
	                    String resultado = aluno.calculaMedia(pesoEx, pesoTr, pesoPr);
	                    labelResultado.setText(resultado);

	                } catch (NumberFormatException ex) {
	                    labelResultado.setText("Erro: Preencha todos os campos com números válidos.");
	                }
	            }
	        });
	    }
}
