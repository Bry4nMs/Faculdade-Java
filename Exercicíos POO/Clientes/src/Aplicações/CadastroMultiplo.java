package Aplicações;
import Entidades.Cliente;

public class CadastroMultiplo {
    public static void main(String[] args) {

        Cliente[] cliente = new Cliente[5];

        cliente[0] = new Cliente("Maria");
        cliente[0].setIdade(20);
        cliente[0].setTelefone("99899-8899");

        cliente[1] = new Cliente("Pedro");
        cliente[1].setIdade(17);
        cliente[1].setTelefone("99397-8542");

        cliente[2] = new Cliente("Junior");
        cliente[2].setIdade(27);
        cliente[2].setTelefone("98416-5214");

        cliente[3] = new Cliente("Julie");
        cliente[3].setIdade(21);
        cliente[3].setTelefone("98520-1698");

        cliente[4] = new Cliente("Rodrigo");
        cliente[4].setIdade(36);
        cliente[4].setTelefone("99362-1627");

        for (int i=0;i<cliente.length;i++) {
            System.out.println(cliente[i]);

        }
    }
}
