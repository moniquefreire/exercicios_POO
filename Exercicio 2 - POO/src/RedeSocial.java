import java.util.HashSet;
import java.util.Set;

public abstract class RedeSocial {

    static String postarFoto = "postarFoto";
    static String postarVideo = "postarVideo";
    static String postarComentario = "postarComentario";
    static Set<String> foto = new HashSet<>();
    static Set<String> video = new HashSet<>();
    static Set<String> comentario = new HashSet<>();

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
    public abstract void postarFoto() throws MetodoExecutado;
    public abstract void postarVideo() throws MetodoExecutado;
    public abstract void postarComentario() throws MetodoExecutado;
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação!");
    }
}
