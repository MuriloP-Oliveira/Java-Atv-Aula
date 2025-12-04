import javax.swing.JOptionPane;
public class MainProduto {

    public static void main(String[] args) {
        
        try {

            
            String sCodigo = JOptionPane.showInputDialog(null, "Digite o código interno:", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);

            if (sCodigo == null) return; 
            
            String sNome = JOptionPane.showInputDialog(null, "Digite o nome do produto:", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
            if (sNome == null) return;

            String sQuantidade = JOptionPane.showInputDialog(null, "Digite a quantidade em estoque:", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
            if (sQuantidade == null) return;

            String sCusto = JOptionPane.showInputDialog(null, "Digite o valor de custo (Ex: 5.00):", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
            if (sCusto == null) return;

            String sVenda = JOptionPane.showInputDialog(null, "Digite o valor de venda (Ex: 8.00):", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
            if (sVenda == null) return;

            String sDescricao = JOptionPane.showInputDialog(null, "Digite a descrição:", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
            if (sDescricao == null) return;

            int codigo = Integer.parseInt(sCodigo);
            int qtd = Integer.parseInt(sQuantidade);
            double custo = Double.parseDouble(sCusto.replace(",", "."));
            double venda = Double.parseDouble(sVenda.replace(",", "."));

            Produto p1 = new Produto();

            p1.codigoInterno = codigo;
            p1.nome = sNome;
            p1.quantidade = qtd;
            p1.valorCusto = custo;
            p1.valorVenda = venda;
            p1.descricao = sDescricao;

            String mensagemSaida = String.format(
                """
                DADOS DO PRODUTO
                -------------------------
                Código interno: %d
                Nome: %s
                Quantidade: %d
                Valor de custo: R$ %.2f
                Valor de venda: R$ %.2f
                Descrição: %s
                """,
                p1.codigoInterno,
                p1.nome,
                p1.quantidade,
                p1.valorCusto,
                p1.valorVenda,
                p1.descricao
            );

            JOptionPane.showMessageDialog(null, 
                mensagemSaida, 
                "Produto Cadastrado com Sucesso!", 
                JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "Erro na entrada de dados!\nCódigo, Quantidade e Valores devem ser números válidos.", 
                "Erro de Formato", 
                JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Ocorreu um erro inesperado: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}