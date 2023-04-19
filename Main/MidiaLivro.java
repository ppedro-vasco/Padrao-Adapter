package Adapter;

public class MidiaLivro implements IMidia{
        private String nome;

        @Override
        public String getMidia() {
            return this.nome;
        }
        @Override
        public void setMidia(String nome) {
            this.nome = nome;
        }
}

