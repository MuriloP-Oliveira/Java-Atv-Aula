package notaAluno;

public class Aluno {
    String nomeAluno;
    double notaExercicio;
    double notaTrabalho;
    double notaProva;

    public Aluno(String nomeAluno, double notaExercicio, double notaTrabalho, double notaProva) {
        this.nomeAluno = nomeAluno;
        this.notaExercicio = notaExercicio;
        this.notaTrabalho = notaTrabalho;
        this.notaProva = notaProva;
    }
    public String calculaMedia(double pe, double pt, double pp) {

        double somaPesos = pe + pt + pp;
        if (Math.abs(somaPesos - 1.0) > 0.001) {
            return "Erro: A soma dos pesos deve ser 1.0 (foi " + somaPesos + ")";
        } else {
            double mediaFinal = (this.notaExercicio * pe) + (this.notaTrabalho * pt) + (this.notaProva * pp);
            return String.format("%s - Média final: %.2f", this.nomeAluno, mediaFinal);
        }
    }
}
