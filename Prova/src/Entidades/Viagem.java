package Entidades;

import java.util.ArrayList;
import java.util.List;


public class Viagem {
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private List<Local> locais;

    public Viagem(String descricao) {
        this.descricao = descricao;
        this.locais = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public List<Local> getLocais() {
        return locais;
    }

    public void adicionarLocal(Local local) {
        this.locais.add(local);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Descricao da viagem: ").append(descricao).append('\'');
        sb.append(" - Data do ínicio ").append(dataInicio).append('\'');
        sb.append(" - Data do fim:").append(dataFim).append('\'');
        sb.append("\n Locais: ");
        for (Local local : locais) {
            sb.append("\n").append(local.toString());
        }
        return sb.toString();
    }
}