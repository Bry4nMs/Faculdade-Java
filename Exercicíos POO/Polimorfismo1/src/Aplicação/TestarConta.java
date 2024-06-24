package Aplicação;

import Entidades.*;

public class TestarConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Fernando", "99413-4151");
        Cliente cliente2 = new Cliente("Maria", "8415-2736");

        Conta conta1 = new ContaCorrente(1, cliente1);
        Conta conta2 = new ContaPoupanca(2, cliente2);

        conta1.depositar(100);
        System.out.println(conta1);
        conta1.sacar(30);
        System.out.println(conta1);

        conta2.depositar(200);
        System.out.println(conta2);
        conta2.sacar(110);
        System.out.println(conta2);

        ContaPoupanca poupanca = (ContaPoupanca) conta2;
        poupanca.atualizaSaldo(7.8);
        System.out.println(conta2);

        Cliente cliente3 = new Cliente("Julia", "8457-9823");

        Conta conta3 = new ContaCorrente(3, cliente3);

        conta3.depositar(1200);
        System.out.println(conta3);

        Cliente cliente4 = new Cliente("Andressa", "9413-4978");

        Conta conta4 = new ContaPoupanca(4, cliente4);
        System.out.println(conta4);

        conta3.transferir(570, conta4);
        System.out.println(conta3);
        System.out.println(conta4);

        Cliente cliente5 = new Cliente("Marcio", "99786-8547");

        Conta conta5 = new ContaSalario(5, cliente5);

        conta5.depositar(5240.50);
        System.out.println(conta5);
        conta5.sacar(2580);
        System.out.println(conta5);

        conta5.transferir(1240, conta4);
        System.out.println(conta4);
        System.out.println(conta5);

        conta5.transferir(420, conta1);
        System.out.println(conta1);
        System.out.print(conta5);
    }
}
