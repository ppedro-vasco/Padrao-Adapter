package Adapter;

public class MidiaAdapter extends MidiaAudioLivro{
    private IMidia midiaLivro;

    public MidiaAdapter(IMidia midiaLivro) {
        this.midiaLivro = midiaLivro;
    }

    public String recuperarMidia() {
        if (this.getTamanho() >= 900.0f)
            midiaLivro.setMidia("Livro com mais de 900 paginas");
        else
            if (this.getTamanho() >= 500.0f)
                midiaLivro.setMidia("Livro com mais de 500 paginas");
            else
                midiaLivro.setMidia("Livro com menos de 500 paginas");
        return midiaLivro.getMidia();
    }

    public void salvarMidia() {
        if (midiaLivro.getMidia().equals("Livro com mais de 900 paginas"))
            this.setTamanho(900.0f);
        else
        if (midiaLivro.getMidia().equals("Livro com mais de 900 paginas"))
            this.setTamanho(900.0f);
        else
            if (midiaLivro.getMidia().equals("Livro com menos de 500 paginas"));
                this.setTamanho(499.0f);
    }
}
