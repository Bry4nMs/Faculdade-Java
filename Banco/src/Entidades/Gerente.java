package Entidades;

public class Gerente extends Funcionario {
    private Double bonificacao;
    private String tipo;
    public Gerente(String nome, Integer telefone, Integer matricula, Double salario, Double bonificacao, String tipo){
        super(nome, telefone, matricula, salario);
        this.bonificacao = bonificacao;
        this.tipo = tipo;
    }
    public Gerente(String nome, Integer matricula){
        super(nome, matricula);
    }

    @Override
    public double salarioAnual(){
        return super.salarioAnual() + this.bonificacao * 12;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String mostrarDados(){
        return "Nome: " + nome + ", Telefone: " + telefone + ", Matrícula: " + matricula + ", Salário R$: " + salario +
                ", Bonificacao R$: " + bonificacao + ", Salário anual R$: " + salarioAnual() + ", Tipo " + tipo;
    }
}