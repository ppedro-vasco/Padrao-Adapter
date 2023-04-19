package Adapter;

public class MidiaAdapter extends MidiaAudioLivro{
    private IMidia midiaLivro;

    public MidiaAdapter(IMidia midiaLivro) {
        this.midiaLivro = midiaLivro;
    }

    public String recuperarMidia() {
        if (this.getNome() == "audio livro")
            midiaLivro.setMidia("Livro digital");
        else
            if (this.getNome().equals("livro"))
                midiaLivro.setMidia("Livro impresso");
        return midiaLivro.getMidia();
    }

    public void salvarMidia() {
        if (midiaLivro.getMidia().equals("Livro digital"))
            this.setNome("audio livro - mp3");
        else
        if (midiaLivro.getMidia().equals("Livro impresso"))
            this.setNome("livro - impresso");
    }
}
