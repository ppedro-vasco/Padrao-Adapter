package Adapter;

public class MidiaLivro implements IMidia{
        private String titulo;

        @Override
        public String getMidia() {
            return this.titulo;
        }
        @Override
        public void setMidia(String titulo) {
            this.titulo = titulo;
        }
}

