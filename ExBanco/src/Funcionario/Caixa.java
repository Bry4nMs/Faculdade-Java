package Funcionario;

public class Caixa extends Funcionario{
    private String horario;

    public Caixa(String nome, Integer telefone, Integer matricula, Double salario, String horario) {
            super(nome,telefone,matricula,salario);
            this.horario = horario;
    }

    public Caixa(String nome, Integer matricula){
        super(nome, matricula);
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Horario " + horario;
    }
}
