package Entidades;

public class ViagemATrabalho extends Viagem {
    private String nomeEmpresa;
    private double valorPago;

    public ViagemATrabalho(String descricao, String nomeEmpresa, double valorPago) {
        super(descricao);
        this.nomeEmpresa = nomeEmpresa;
        this.valorPago = valorPago;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Viagem a Trabalho " +
                "Empresa " + nomeEmpresa + '\'' +
                ", valor pago " + valorPago +
                super.toString();

    }
}