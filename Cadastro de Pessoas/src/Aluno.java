import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private int anoLetivo;
    private double mediaGeral;

    public Aluno(String nome, int idade, String endereco, String telefone, String email, 
                 String matricula, String curso, int anoLetivo, double mediaGeral) {
        super(nome, idade, endereco, telefone, email); 
        this.matricula = matricula;
        this.curso = curso;
        this.anoLetivo = anoLetivo;
        this.mediaGeral = mediaGeral;
    }

    @Override
    public void exibirDados() {
        String dados = String.format(
            "--- Aluno ---\n" +
            "Nome: %s\nIdade: %d\nEndereço: %s\nContato: %s | %s\n" +
            "----------------\n" +
            "Matrícula: %s\nCurso: %s\nAno Letivo: %d\nMédia Geral: %.2f",
            getNome(), getIdade(), getEndereco(), getTelefone(), getEmail(),
            this.matricula, this.curso, this.anoLetivo, this.mediaGeral
        );
        
        JOptionPane.showMessageDialog(null, dados, "Dados do Aluno", JOptionPane.INFORMATION_MESSAGE);
    }
}