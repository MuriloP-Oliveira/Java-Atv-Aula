import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CadastroFuncionarios {

    public static void main(String[] args) {
        final int TotalFuncionarios = 5;
        double somaSalarios = 0.0;
        double maiorSalario = 0.0;
        String nomeMaiorSalario = "";

        JOptionPane.showMessageDialog(null,"Você irá cadastrar " + TotalFuncionarios + " funcionários.",
                "Início do Cadastro",JOptionPane.INFORMATION_MESSAGE);
        for (int i = 1; i <= TotalFuncionarios; i++) {
            String nomeAtual = JOptionPane.showInputDialog(null, "Digite o nome do(a) " + i + "º funcionário(a):");
            String idadeStr = JOptionPane.showInputDialog(null, "Digite a idade de " + nomeAtual + ":");
            String salarioStr = JOptionPane.showInputDialog(null, "Digite o salário de " + nomeAtual + ":");
            double salarioAtual = Double.parseDouble(salarioStr);
            if (salarioAtual > maiorSalario) {
                maiorSalario = salarioAtual;
                nomeMaiorSalario = nomeAtual;
            }
            somaSalarios+=salarioAtual;
        }
        double mediaSalarial = somaSalarios / TotalFuncionarios;
        DecimalFormat formatadorMonetario = new DecimalFormat("R$ #,##0.00");

        String mensagemResultado = "--- Relatório Final ---\n\n" + "Funcionário com MAIOR Salário:\n" +
                "Nome: " + nomeMaiorSalario + "\n" + "Salário: " + formatadorMonetario.format(maiorSalario) +
                "\n\nMédia Salarial de todos os funcionários:\n" + formatadorMonetario.format(mediaSalarial);

        JOptionPane.showMessageDialog(null,mensagemResultado, "Análise Concluída",JOptionPane.INFORMATION_MESSAGE);
    }
}