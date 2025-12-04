import javax.swing.JOptionPane; // Importa a classe JOptionPane, usada para exibir caixas de diálogo (interface visual).
import java.util.InputMismatchException; // Importa a exceção InputMismatchException (embora NumberFormatException seja mais relevante aqui, é mantida por contexto).
 
public class SistemaBancario { // Declara a classe principal e pública do sistema bancário.
 
    // Instâncias das contas (persistência simples em memória)
    private static ContaCorrente contaCorrente = new ContaCorrente(0.00, 500.00); // Cria uma instância estática de ContaCorrente com saldo inicial de R$ 0.00 e limite de R$ 500,00.
    private static ContaPoupanca contaPoupanca = new ContaPoupanca(0.00, 0.06); // Cria uma instância estática de ContaPoupanca com saldo inicial de R$ 0.00 e taxa de juros de 6% (0.06).
 
    public static void main(String[] args) { // O método principal (ponto de entrada) da aplicação.
        int opcao = -1; // Inicializa a variável 'opcao' para controlar a seleção do menu principal.
 
        while (opcao != 0) { // Inicia o loop principal do sistema; continua executando até que o usuário escolha a opção 0 (Sair).
            String menuPrincipal = "Sistema Bancário Java\n\n" + // Constrói o conteúdo de texto para o menu principal.
                                   "Escolha uma opção:\n" +
                                   "1. Conta Corrente\n" +
                                   "2. Conta Poupança\n" +
                                   "0. Sair";
            
            String entrada = JOptionPane.showInputDialog(null, menuPrincipal, "Menu Principal", JOptionPane.QUESTION_MESSAGE); // Exibe o menu principal e solicita a entrada do usuário.
            
            // Tratar o caso de o usuário cancelar ou fechar o diálogo
            if (entrada == null) { // Verifica se o usuário pressionou "Cancelar" ou fechou o diálogo (a entrada será null).
                opcao = 0; // Define a opção como 0 para sair do loop.
                continue; // Pula para a próxima iteração do loop (que terminará).
            }
            
            try { // Inicia um bloco try para lidar com possíveis erros de conversão de entrada.
                opcao = Integer.parseInt(entrada); // Tenta converter a entrada (String) para um número inteiro.
                
                switch (opcao) { // Avalia a opção numérica escolhida.
                    case 1: // Se a opção for 1.
                        gerenciarContaCorrente(); // Chama o método para gerenciar a Conta Corrente.
                        break; // Sai do switch.
                    case 2: // Se a opção for 2.
                        gerenciarContaPoupanca(); // Chama o método para gerenciar a Conta Poupança.
                        break; // Sai do switch.
                    case 0: // Se a opção for 0.
                        JOptionPane.showMessageDialog(null, "Obrigado por utilizar o Sistema Bancário!", "Sair", JOptionPane.INFORMATION_MESSAGE); // Exibe mensagem de despedida.
                        break; // Sai do switch.
                    default: // Se a opção for um número não listado.
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE); // Exibe mensagem de erro.
                }
            } catch (NumberFormatException e) { // Captura a exceção caso a entrada não possa ser convertida em inteiro (ex: digitou texto).
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número correspondente à opção.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE); // Exibe mensagem de erro de entrada.
            }
        } // Fim do loop principal.
    } // Fim do método main.
 
    private static void gerenciarContaCorrente() { // Declara o método estático e privado para gerenciar a Conta Corrente.
        int opcaoCC = -1; // Inicializa a variável para controlar a seleção do menu da Conta Corrente.
        while (opcaoCC != 0) { // Inicia o loop do menu da Conta Corrente.
            String saldoCC = String.format("R$ %.2f", contaCorrente.getSaldo()); // Formata o saldo atual da conta corrente para exibir duas casas decimais.
            String limiteCC = String.format("R$ %.2f", contaCorrente.getLimite()); // Formata o limite da conta corrente.
            String totalDisponivel = String.format("R$ %.2f", (contaCorrente.getSaldo() + contaCorrente.getLimite())); // Calcula e formata o total disponível (saldo + limite).
            
            String menuCC = "Conta Corrente\n" + // Constrói o conteúdo de texto para o menu da Conta Corrente.
                            "Saldo Atual: " + saldoCC + "\n" +
                            "Limite de Crédito: " + limiteCC + "\n" +
                            "Total Disponível: " + totalDisponivel + "\n\n" +
                            "Escolha uma operação:\n" +
                            "1. Depositar\n" +
                            "2. Sacar\n" +
                            "0. Voltar ao Menu Principal";
 
            String entrada = JOptionPane.showInputDialog(null, menuCC, "Conta Corrente", JOptionPane.QUESTION_MESSAGE); // Exibe o menu da Conta Corrente e solicita a entrada do usuário.
            
            if (entrada == null) { // Verifica se o usuário cancelou ou fechou o diálogo.
                opcaoCC = 0; // Define a opção como 0 para sair do loop.
                continue; // Pula para a próxima iteração.
            }
            
            try { // Inicia bloco try para conversão de opção.
                opcaoCC = Integer.parseInt(entrada); // Tenta converter a entrada para um número inteiro.
                double quantia; // Declara variável para a quantia de depósito/saque.
                
                switch (opcaoCC) { // Avalia a opção numérica escolhida.
                    case 1: // Se a opção for 1 (Depositar).
                        quantia = solicitarQuantia("Depósito", "Digite o valor para depósito na Conta Corrente:"); // Chama o método auxiliar para solicitar e validar a quantia.
                        if (quantia > 0) { // Verifica se a quantia é válida (maior que 0, pois -1 é usado para indicar erro/cancelamento).
                            contaCorrente.depositar(quantia); // Chama o método depositar da instância de ContaCorrente.
                        }
                        break; // Sai do switch.
                    case 2: // Se a opção for 2 (Sacar).
                        quantia = solicitarQuantia("Saque", "Digite o valor para saque na Conta Corrente:"); // Chama o método auxiliar para solicitar e validar a quantia.
                        if (quantia > 0) { // Verifica se a quantia é válida.
                            contaCorrente.sacar(quantia); // Chama o método sacar da instância de ContaCorrente.
                        }
                        break; // Sai do switch.
                    case 0: // Se a opção for 0 (Voltar).
                        break; // Sai do switch.
                    default: // Se a opção for um número não listado.
                        JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE); // Exibe mensagem de erro.
                }
            } catch (NumberFormatException e) { // Captura erro de formato na entrada da opção.
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número para a opção.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE); // Exibe mensagem de erro.
            }
        } // Fim do loop da Conta Corrente.
    } // Fim do método gerenciarContaCorrente.
 
    private static void gerenciarContaPoupanca() { // Declara o método estático e privado para gerenciar a Conta Poupança.
        int opcaoCP = -1; // Inicializa a variável para controlar a seleção do menu da Conta Poupança.
        while (opcaoCP != 0) { // Inicia o loop do menu da Conta Poupança.
            String saldoCP = String.format("R$ %.2f", contaPoupanca.getSaldo()); // Formata o saldo atual da conta poupança.
            String taxaJuros = String.format("%.2f%% (Anual)", contaPoupanca.getTaxaJuros() * 100); // Converte a taxa de juros para porcentagem e formata.
            
            String menuCP = "Conta Poupança\n" + // Constrói o conteúdo de texto para o menu da Conta Poupança.
                            "Saldo Atual: " + saldoCP + "\n" +
                            "Taxa de Juros: " + taxaJuros + "\n\n" +
                            "Escolha uma operação:\n" +
                            "1. Depositar\n" +
                            "2. Aplicar Juros\n" +
                            "0. Voltar ao Menu Principal";
 
            String entrada = JOptionPane.showInputDialog(null, menuCP, "Conta Poupança", JOptionPane.QUESTION_MESSAGE); // Exibe o menu da Conta Poupança e solicita a entrada do usuário.
 
            if (entrada == null) { // Verifica se o usuário cancelou ou fechou o diálogo.
                opcaoCP = 0; // Define a opção como 0 para sair do loop.
                continue; // Pula para a próxima iteração.
            }
 
            try { // Inicia bloco try para conversão de opção.
                opcaoCP = Integer.parseInt(entrada); // Tenta converter a entrada para um número inteiro.
                double quantia; // Declara variável para a quantia de depósito.
 
                switch (opcaoCP) { // Avalia a opção numérica escolhida.
                    case 1: // Se a opção for 1 (Depositar).
                        quantia = solicitarQuantia("Depósito", "Digite o valor para depósito na Conta Poupança:"); // Solicita e valida a quantia.
                        if (quantia > 0) { // Verifica se a quantia é válida.
                            contaPoupanca.depositar(quantia); // Chama o método depositar.
                        }
                        break; // Sai do switch.
                    case 2: // Se a opção for 2 (Aplicar Juros).
                        contaPoupanca.aplicarJuros(); // Chama o método aplicarJuros.
                        break; // Sai do switch.
                    case 0: // Se a opção for 0 (Voltar).
                        break; // Sai do switch.
                    default: // Se a opção for um número não listado.
                        JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE); // Exibe mensagem de erro.
                }
            } catch (NumberFormatException e) { // Captura erro de formato na entrada da opção.
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número para a opção.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE); // Exibe mensagem de erro.
            }
        } // Fim do loop da Conta Poupança.
    } // Fim do método gerenciarContaPoupanca.
    
    // Método auxiliar para solicitar e validar quantias (valores decimais)
    private static double solicitarQuantia(String titulo, String mensagem) { // Declara o método estático e privado para solicitar e validar valores monetários.
        String entrada = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE); // Exibe um diálogo de entrada para o valor.
        
        if (entrada == null) { // Verifica se o usuário cancelou ou fechou o diálogo.
            return -1; // Retorna -1 para indicar cancelamento.
        }
        
        try { // Inicia bloco try para conversão do valor.
            // Substitui vírgula por ponto para parsear corretamente o decimal
            return Double.parseDouble(entrada.replace(',', '.')); // Substitui vírgulas por pontos (para aceitar formato brasileiro) e tenta converter para double.
        } catch (NumberFormatException e) { // Captura a exceção caso a entrada não seja um número decimal válido.
            JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número decimal.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE); // Exibe mensagem de erro.
            return -1; // Retorna -1 para indicar erro de entrada.
        }
    } // Fim do método solicitarQuantia.
} // Fim da classe SistemaBancario.