import javax.swing.JOptionPane;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private int cargaHorariaSemanal;
    private int tempoDeCasa;

    public Professor(String nome, int idade, String endereco, String telefone, String email,
                     String disciplina, double salario, int cargaHorariaSemanal, int tempoDeCasa) {
        super(nome, idade, endereco, telefone, email);
        this.disciplina = disciplina;
        this.salario = salario;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.tempoDeCasa = tempoDeCasa;
    }

    public void exibirDados() {
        String dados = String.format(
            "--- Professor ---\n" +
            "Nome: %s\nIdade: %d\nEndereço: %s\nContato: %s | %s\n" +
            "----------------\n" +
            "Disciplina: %s\nSalário: R$ %.2f\nCarga Horária: %d horas\nTempo de Casa: %d anos",
            getNome(), getIdade(), getEndereco(), getTelefone(), getEmail(),
            this.disciplina, this.salario, this.cargaHorariaSemanal, this.tempoDeCasa
        );

        JOptionPane.showMessageDialog(null, dados, "Dados do Professor", JOptionPane.INFORMATION_MESSAGE);
    }
}