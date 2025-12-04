import javax.swing.*;
/**
* Exemplo: Calculadora em Java com JOptionPane
* Salve como MainCalculadora.java
*/
class Calculadora {
 // Métodos estáticos para operações básicas
 public static double somar(double a, double b) {
 return a + b;
 }
 public static double subtrair(double a, double b) {
 return a - b;
 }
 public static double multiplicar(double a, double b) {
 return a * b;
 }
 public static double dividir(double a, double b) throws 
ArithmeticException {
 if (b == 0) {
 throw new ArithmeticException("Divisão por zero não é  permitida!");
 }
 return a / b;
 }
}

public class MainCalculadora {
 public static void main(String[] args) {
 while (true) {
 // Menu principal
 String menu = """
 CALCULADORA
 Escolha uma opção:
 1 - Soma
 2 - Subtração
 3 - Multiplicação
 4 - Divisão
 5 - Sair
 """;
 String opcao = JOptionPane.showInputDialog(null, menu, "Menu da Calculadora", JOptionPane.QUESTION_MESSAGE);
 // Se o usuário clicar em "Cancelar" ou "Fechar", encerra
 if (opcao == null) break;
 switch (opcao.trim()) {
 case "1" -> executarOperacao("Soma");
 case "2" -> executarOperacao("Subtração");
 case "3" -> executarOperacao("Multiplicação");
 case "4" -> executarOperacao("Divisão");
 case "5" -> {
 JOptionPane.showMessageDialog(null, "Encerrando a calculadora. Até mais!", "Sair", JOptionPane.INFORMATION_MESSAGE);
 System.exit(0);
 }
 default -> JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
 }
 }
 }
 private static void executarOperacao(String tipo) {
 try {
 String sNum1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:", tipo, JOptionPane.QUESTION_MESSAGE);
 if (sNum1 == null) return;
 double num1 = Double.parseDouble(sNum1.replace(",", "."));
 String sNum2 = JOptionPane.showInputDialog(null, "Digite o segundo número:", tipo, JOptionPane.QUESTION_MESSAGE);
 if (sNum2 == null) return;
 double num2 = Double.parseDouble(sNum2.replace(",", "."));
 double resultado = 0;
 switch (tipo) {
 case "Soma" -> resultado = Calculadora.somar(num1, num2);
 case "Subtração" -> resultado = Calculadora.subtrair(num1, num2);
 case "Multiplicação" -> resultado = Calculadora.multiplicar(num1, num2);
 case "Divisão" -> resultado = Calculadora.dividir(num1, num2);
 }
 JOptionPane.showMessageDialog(null,
 "Resultado da " + tipo + ":\n" + num1 + " e " + num2 + " = " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
 } catch (NumberFormatException e) {
 JOptionPane.showMessageDialog(null, "Erro: você deve digitar números válidos.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
 } catch (ArithmeticException e) {
 JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), 
"Erro de cálculo", JOptionPane.ERROR_MESSAGE);
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Erro inesperado: " + 
e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
 }
 }
}