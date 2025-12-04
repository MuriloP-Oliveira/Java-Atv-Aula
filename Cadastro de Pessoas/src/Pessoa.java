import javax.swing.JOptionPane;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private String email;

    public Pessoa(String nome, int idade, String endereco, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public abstract void exibirDados();

    public void fazerAniversario() {
        this.idade++;
        JOptionPane.showMessageDialog(null, "Parabéns! " + this.nome + " agora tem " + this.idade + " anos.", "Aniversário", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
}