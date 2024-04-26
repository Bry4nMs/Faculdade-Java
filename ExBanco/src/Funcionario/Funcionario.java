package Funcionario;

import Pessoa.Pessoa;

    public class Funcionario extends Pessoa {
        protected Integer matricula;
        protected Double salario;

    public Funcionario(String nome, Integer matricula){
        super(nome);
        this.matricula = matricula;
    }
    public Funcionario(String nome, Integer telefone, Integer matricula, Double salario){
        super(nome, telefone);
        this.matricula = matricula;
        this.salario = salario;
    }

    public void aumentoSalarial(double percentual) {
            this.salario += (this.salario * percentual / 100);
    }

    public double salarioAnual(){
        return salario * 12;
    }

        public void setSalario(Double salario) {
            this.salario = salario;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", Matrícula: " + matricula +
                    ", Salario R$: " + salario +
                    ", Salário Anual R$: " + salarioAnual();
        }
    }
