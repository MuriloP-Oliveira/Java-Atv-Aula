import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;
    private String turno;
    private double salario;

    public Funcionario(String nome, int idade, String endereco, String telefone, String email,
                       String cargo, String setor, String turno, double salario) {
        super(nome, idade, endereco, telefone, email);
        this.cargo = cargo;
        this.setor = setor;
        this.turno = turno;
        this.salario = salario;
    }

    public void exibirDados() {
        String dados = String.format(
            "--- Funcionário ---\n" +
            "Nome: %s\nIdade: %d\nEndereço: %s\nContato: %s | %s\n" +
            "----------------\n" +
            "Cargo: %s\nSetor: %s\nTurno: %s\nSalário: R$ %.2f",
            getNome(), getIdade(), getEndereco(), getTelefone(), getEmail(),
            this.cargo, this.setor, this.turno, this.salario
        );

        JOptionPane.showMessageDialog(null, dados, "Dados do Funcionário", JOptionPane.INFORMATION_MESSAGE);
    }
}