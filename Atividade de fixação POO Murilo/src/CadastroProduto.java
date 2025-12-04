import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CadastroProduto extends JFrame {
	private JTextField campoNome;
	private JTextField campoQntde;
	private JButton botaoCadastrar;
	private JTextArea areaResultado;
	private ArrayList<Produto> listaProdutos = new ArrayList<>();
	
	public CadastroProduto() {
		setTitle("Cadastro de Produtos");
		setSize(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		campoNome = new JTextField(20);
		campoQntde = new JTextField(5);
		botaoCadastrar = new JButton("Cadastrar");
		areaResultado = new JTextArea(10,30);
		areaResultado.setEditable(false);
		
		add(new JLabel("Nome: "));
		add(campoNome);
		add(new JLabel("Quantidade: "));
		add(campoQntde);
		add(botaoCadastrar);
		add(new JScrollPane(areaResultado));
		
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campoNome.getText();
				int qntde = Integer.parseInt(campoQntde.getText());
				Produto p = new Produto(nome, qntde);
				listaProdutos.add(p);
				atualizarLista();
				campoNome.setText("");
				campoQntde.setText("");
			}
		});
	}
	private void atualizarLista() {
		areaResultado.setText("");
		for(Produto p: listaProdutos) {
			areaResultado.append(p.toString()+ "\n");
		}
	}
}
