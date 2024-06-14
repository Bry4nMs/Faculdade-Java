package Entidades;

    public class Livro {
        private String titulo;
        private int codigo;
        private Pessoa autor;
        private String editora;
        private int edicao;
        private int ano;
        private String local;
        private String genero;

        private static int quantidadeLivros = 0;
        private static int[] quantidadePorGenero = new int[5]; // Considerando até 5 gêneros diferentes

        public Livro(int codigo, String titulo, Pessoa autor, String editora, int edicao, int ano, String local, String genero) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.autor = autor;
            this.editora = editora;
            this.edicao = edicao;
            this.ano = ano;
            this.local = local;
            this.genero = genero;
            quantidadeLivros++;
            incrementarGenero(genero);
        }

        // Métodos gets e sets
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public Pessoa getAutor() {
            return autor;
        }

        public void setAutor(Pessoa autor) {
            this.autor = autor;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }

        public int getEdicao() {
            return edicao;
        }

        public void setEdicao(int edicao) {
            this.edicao = edicao;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public static int getQuantidadeLivros() {
            return quantidadeLivros;
        }

        public static int[] getQuantidadePorGenero() {
            return quantidadePorGenero;
        }

        private void incrementarGenero(String genero) {
            switch (genero.toLowerCase()) {
                case "ficção":
                    quantidadePorGenero[0]++;
                    break;
                case "historia":
                    quantidadePorGenero[1]++;
                    break;
                case "aventura":
                    quantidadePorGenero[2]++;
                    break;
                case "romance":
                    quantidadePorGenero[3]++;
                    break;
                case "sci-fi":
                    quantidadePorGenero[4]++;
                    break;
                default:

                    break;
            }
        }

        public String getReferencia() {
            return String.format("%s %s. %dªa. edição. %s: %s, %d.", autor.getNomeFormatado(), titulo, edicao, local, editora, ano);
        }
    }
