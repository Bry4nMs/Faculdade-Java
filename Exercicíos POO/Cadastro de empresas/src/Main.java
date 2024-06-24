import java.util.ArrayList;
import javax.swing.JOptionPane;

class Produto {
    private String nome;
    private String tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    // Construtor
    public Produto(String nome, String tamanho, String tipo, String cor, String especificacao) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
        this.especificacao = especificacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Outros getters e setters para as demais propriedades

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", especificacao='" + especificacao + '\'' +
                '}';
    }
}

class Responsavel {
    private String nome;
    private String telefone;

    // Construtor
    public Responsavel(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Outros getters e setters para as demais propriedades

    @Override
    public String toString() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}

class Empresa {
    private String nome;
    private String cnpj;
    private Responsavel responsavel;
    private ArrayList<Produto> produtos;

    // Construtor
    public Empresa(String nome, String cnpj, Responsavel responsavel) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.produtos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Outros getters e setters para as demais propriedades

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", responsavel=" + responsavel +
                ", produtos=" + produtos +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Empresa> empresas = new ArrayList<>();
        char cadastrarEmpresa;

        do {
            cadastrarEmpresa = JOptionPane.showInputDialog("Cadastrar nova empresa (S/N)?").toUpperCase().charAt(0);

            if (cadastrarEmpresa == 'S') {
                String nome = JOptionPane.showInputDialog("Nome da empresa:");
                String cnpj = JOptionPane.showInputDialog("CNPJ da empresa:");
                String nomeResponsavel = JOptionPane.showInputDialog("Nome do responsável:");
                String telefoneResponsavel = JOptionPane.showInputDialog("Telefone do responsável:");

                Responsavel responsavel = new Responsavel(nomeResponsavel, telefoneResponsavel);
                Empresa empresa = new Empresa(nome, cnpj, responsavel);

                char cadastrarProduto;

                do {
                    cadastrarProduto = JOptionPane.showInputDialog("Cadastrar produto para a empresa (S/N)?").toUpperCase().charAt(0);

                    if (cadastrarProduto == 'S') {
                        String nomeProduto = JOptionPane.showInputDialog("Nome do produto:");
                        String tamanho = JOptionPane.showInputDialog("Tamanho do produto:");
                        String tipo = JOptionPane.showInputDialog("Tipo do produto:");
                        String cor = JOptionPane.showInputDialog("Cor do produto:");
                        String especificacao = JOptionPane.showInputDialog("Especificação do produto:");

                        Produto produto = new Produto(nomeProduto, tamanho, tipo, cor, especificacao);

                        empresa.adicionarProduto(produto);
                    }
                } while (cadastrarProduto == 'S');

                empresas.add(empresa);
            }
        } while (cadastrarEmpresa == 'S');

        for (Empresa empresa : empresas) {
            System.out.println(empresa);
        }
    }
}