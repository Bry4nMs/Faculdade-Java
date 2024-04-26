package Cliente;

import Pessoa.Pessoa;

public class Cliente extends Pessoa {
        protected Integer idade;
        protected Integer cpf;
        protected Status status;

        public Cliente(String nome, Integer telefone, Integer idade, Integer cpf){
            super(nome, telefone);
            this.idade = idade;
            this.cpf = cpf;
            this.status = Status.ATIVO;
        }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public static void desativar(Cliente cliente){
        if (cliente.status == Status.ATIVO) {
            cliente.setStatus(Status.INATIVO);
        }
    }

    public String mostrarDados() {
        return "Nome " + nome + " - Tel: " + telefone + " - Idade: " + idade + " anos - CPF: " + cpf + " - Status  " + getStatus() + "\n";
    }
}
