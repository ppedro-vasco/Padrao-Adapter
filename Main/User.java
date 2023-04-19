package Adapter;

public class User {
    IMidia midia;
    MidiaAdapter persistencia;

    public User(){
        midia = new MidiaLivro();
        persistencia = new MidiaAdapter(midia);
    }

    public void setMidia(String titulo){
        midia.setMidia(titulo);
        persistencia.salvarMidia();
    }

    public String getMida(){
        return persistencia.recuperarMidia();
    }

    public String getNome(){
        return persistencia.getNome();
    }
}
