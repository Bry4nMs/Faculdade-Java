package Entidades;

public class Produto {

        public String name;
        public double preco;
        public int quantidade;

        public double totalestoque() {
                return preco * quantidade;
        }
        public void addproduto(int quantidade){
                this.quantidade += quantidade;
        }
        public void remproduto(int quantidade){
                this.quantidade -= quantidade;
        }

        @Override
        public String toString() {
                return "Nome do produto " + name +
                        ", preco " + preco +
                        ", quantidade " + quantidade
                        ;
        }
}


