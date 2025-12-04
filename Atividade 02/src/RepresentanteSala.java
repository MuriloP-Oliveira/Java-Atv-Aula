import javax.swing.JOptionPane;

public class RepresentanteSala {

	public static void main(String[] args) {
		//Murilo Pereira e Oliveira

	        String candidato1 = JOptionPane.showInputDialog("Digite o nome do Candidato 1:");
	        String candidato2 = JOptionPane.showInputDialog("Digite o nome do Candidato 2:");
	        String candidato3 = JOptionPane.showInputDialog("Digite o nome do Candidato 3:");

	        int votosCandidato1 = 0;
	        int votosCandidato2 = 0;
	        int votosCandidato3 = 0;
	        int totalVotos = 0;

	        while (true) {
	            String menuVotacao = "Vote para Representante de Sala (ou 'fim' para encerrar a votação):\n\n" +
	                                 "1 - " + candidato1 + "\n" +
	                                 "2 - " + candidato2 + "\n" +
	                                 "3 - " + candidato3 + "\n\n" +
	                                 "Digite o número do seu candidato:";
	            
	            String votoStr = JOptionPane.showInputDialog(menuVotacao);
	            if (votoStr != null && votoStr.equalsIgnoreCase("fim")) {
	                break;
	            }
	            try {
	                int voto = Integer.parseInt(votoStr);
	                switch (voto) {
	                    case 1:
	                        votosCandidato1++;
	                        totalVotos++;
	                        JOptionPane.showMessageDialog(null, "Voto para " + candidato1 + " registrado!");
	                        break;
	                    case 2:
	                        votosCandidato2++;
	                        totalVotos++;
	                        JOptionPane.showMessageDialog(null, "Voto para " + candidato2 + " registrado!");
	                        break;
	                    case 3:
	                        votosCandidato3++;
	                        totalVotos++;
	                        JOptionPane.showMessageDialog(null, "Voto para " + candidato3 + " registrado!");
	                        break;
	                    default:
	                        // Se o número não for 1, 2 ou 3.
	                        JOptionPane.showMessageDialog(null, "Opção inválida! Voto não computado.", "Erro", JOptionPane.WARNING_MESSAGE);
	                        break;
	                }
	            } catch (NumberFormatException e) {
	                if (votoStr != null) {
	                    JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite apenas o número do candidato.", "Erro", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        }

	        if (totalVotos == 0) {
	            JOptionPane.showMessageDialog(null, "Nenhum voto foi registrado. A votação foi encerrada sem resultados.");
	        } else {
	            double porc1 = ((double) votosCandidato1 / totalVotos) * 100;
	            double porc2 = ((double) votosCandidato2 / totalVotos) * 100;
	            double porc3 = ((double) votosCandidato3 / totalVotos) * 100;
	            String resultado = "--- RESULTADOS DA VOTAÇÃO ---\n\n" +
	                               "Total de Votos: " + totalVotos + "\n\n" +
	                               String.format("%s: %d votos (%.2f%%)\n", candidato1, votosCandidato1, porc1) +
	                               String.format("%s: %d votos (%.2f%%)\n", candidato2, votosCandidato2, porc2) +
	                               String.format("%s: %d votos (%.2f%%)\n", candidato3, votosCandidato3, porc3);
	            String vencedor;
	            if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
	                vencedor = "O vencedor é: " + candidato1;
	            } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
	                vencedor = "O vencedor é: " + candidato2;
	            } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
	                vencedor = "O vencedor é: " + candidato3;
	            } else {
	                if (votosCandidato1 == votosCandidato2 && votosCandidato1 == votosCandidato3) {
	                    vencedor = "Houve um empate triplo entre " + candidato1 + ", " + candidato2 + " e " + candidato3 + "!";
	                } else if (votosCandidato1 == votosCandidato2) {
	                    vencedor = "Houve um empate entre " + candidato1 + " e " + candidato2 + "!";
	                } else if (votosCandidato1 == votosCandidato3) {
	                    vencedor = "Houve um empate entre " + candidato1 + " e " + candidato3 + "!";
	                } else {
	                    vencedor = "Houve um empate entre " + candidato2 + " e " + candidato3 + "!";
	                }
	            }
	            JOptionPane.showMessageDialog(null, resultado + "\n\n--- CONCLUSÃO ---\n" + vencedor);
	        }
	    }
	}
