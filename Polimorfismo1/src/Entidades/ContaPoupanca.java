package Entidades;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, Cliente dono) {
        super(numero, dono);
    }

    public void atualizaSaldo(double percentual) {
        double aumento = this.getSaldo() * percentual / 100;
        this.setSaldo(this.getSaldo() + aumento);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    @Override
    public String toString() {
        return super.toString() + " - Tipo: Conta Poupança";
    }
}