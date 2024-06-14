package Entidades;

public class ContaSalario extends ContaCorrente {
    private static final double TAXA_SALARIO = 0.01;

    public ContaSalario(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA_SALARIO);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - TAXA_SALARIO);
    }
    @Override
    public String toString() {
        return super.toString() + " - Salário";
    }
}