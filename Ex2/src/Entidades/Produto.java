package Entidades;

public class Produto {

    private int codigoP;
    private String nomeP;
    private int quantidadeP;
    private String tipoP;
    private Double valorP;

    public Produto(int codigoP){
        this.codigoP = codigoP;
    }
    public Produto(int codigoP, String nomeP){
        this.codigoP = codigoP;
        this.nomeP = nomeP;
    }
    public Produto(int codigoP, String nomeP, int quantidadeP){
        this.codigoP = codigoP;
        this.nomeP = nomeP;
        this.quantidadeP = quantidadeP;
    }
    public Produto(int codigoP, String nomeP, int quantidadeP, String tipoP, Double valorP){
        this.codigoP = codigoP;
        this.nomeP = nomeP;
        this.quantidadeP = quantidadeP;
        this.tipoP = tipoP;
        this.valorP = valorP;
    }
    public void venderP(int qtdaVender){
        if(quantidadeP < qtdaVender){
            System.out.println("Produto não disponível");;
        }
        else{
            quantidadeP -= qtdaVender;
            double valorTotal = qtdaVender * valorP;
            System.out.println("Venda realizada com sucesso.\nTotal: R$ " + valorTotal +
                    "\nQuantidade restante no estoque é " + quantidadeP + ".");
        }
    }

    public void reestoque(int qtdaComprar, Double valor){
        quantidadeP += qtdaComprar;
        valorP = valor;
        System.out.printf("Foram comprados %d unidades de %s e novo valor R$ %.2f. \n", quantidadeP, this.nomeP, valorP);
    }

    public void reestoque(int qtdaComprar){
        quantidadeP += qtdaComprar;
        System.out.printf("Nova quantidade de %s é %d. \n", this.nomeP, quantidadeP);
    }

    @Override
    public String toString() {
        return "Codigo "
                + codigoP + "; " +
                "Nome " + nomeP +
                "; quantidade " + quantidadeP +
                "; tipo " + tipoP +
                "; valor do produto R$ " + String.format("%.2f", valorP) + " \n ";
    }
    public void inserir(String nomeP, int quantidadeP, String tipoP, Double valorP){
        this.nomeP = nomeP;
        this.quantidadeP = quantidadeP;
        this.tipoP = tipoP;
        this.valorP = valorP;
    }
    public void igual(Produto produto){
        if(produto.nomeP.equals(this.nomeP) && produto.tipoP.equals(this.tipoP)){
            System.out.printf("O produto [%d] é igual ao produto [%d]\n", produto.codigoP, this.codigoP);
        }
        else{
            System.out.printf("O produto [%d] não é igual ao produto [%d]\n", produto.codigoP, this.codigoP);
        }
    }

}
