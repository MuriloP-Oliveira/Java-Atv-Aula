import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SistemaEscolar {
    private static ArrayList<Pessoa> cadastroPessoas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            String menu = "ESCOLA TECHFUTURE - Sistema de Cadastro\n\n" +
                          "1. Cadastrar Aluno\n" +
                          "2. Cadastrar Professor\n" +
                          "3. Cadastrar Funcionário\n" +
                          "4. Exibir Todos os Cadastros\n" +
                          "0. Sair";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                opcao = 0;
                continue;
            }

            try {
                opcao = Integer.parseInt(entrada);

                switch (opcao) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        cadastrarProfessor();
                        break;
                    case 3:
                        cadastrarFuncionario();
                        break;
                    case 4:
                        exibirCadastros();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void cadastrarAluno() {
        String nome = JOptionPane.showInputDialog("Nome do Aluno:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String endereco = JOptionPane.showInputDialog("Endereço:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String email = JOptionPane.showInputDialog("Email:");

        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String curso = JOptionPane.showInputDialog("Curso:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano Letivo:"));
        double media = Double.parseDouble(JOptionPane.showInputDialog("Média Geral:"));

        Aluno novoAluno = new Aluno(nome, idade, endereco, telefone, email, matricula, curso, ano, media);
        cadastroPessoas.add(novoAluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
    }

    private static void cadastrarProfessor() {
        String nome = JOptionPane.showInputDialog("Nome do Professor:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String endereco = JOptionPane.showInputDialog("Endereço:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String email = JOptionPane.showInputDialog("Email:");
        
        String disciplina = JOptionPane.showInputDialog("Disciplina:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
        int carga = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária Semanal:"));
        int tempoCasa = Integer.parseInt(JOptionPane.showInputDialog("Tempo de Casa (anos):"));

        Professor novoProf = new Professor(nome, idade, endereco, telefone, email, disciplina, salario, carga, tempoCasa);
        cadastroPessoas.add(novoProf);
        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
    }

    private static void cadastrarFuncionario() {
        String nome = JOptionPane.showInputDialog("Nome do Funcionário:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String endereco = JOptionPane.showInputDialog("Endereço:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String email = JOptionPane.showInputDialog("Email:");
        
        String cargo = JOptionPane.showInputDialog("Cargo:");
        String setor = JOptionPane.showInputDialog("Setor:");
        String turno = JOptionPane.showInputDialog("Turno (Manhã/Tarde/Noite):");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));

        Funcionario novoFunc = new Funcionario(nome, idade, endereco, telefone, email, cargo, setor, turno, salario);
        cadastroPessoas.add(novoFunc);
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
    }

    private static void exibirCadastros() {
        if (cadastroPessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada ainda.");
            return;
        }
        for (Pessoa p : cadastroPessoas) {
            p.exibirDados();
        }
    }
}