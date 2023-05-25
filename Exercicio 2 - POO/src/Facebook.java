public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() throws MetodoExecutado {
        if(foto.add(postarFoto))
            System.out.println("Postou foto no Facebook!");
        else{
            throw new MetodoExecutado("O método " + postarFoto + " já foi executado!");
        }
    }
    @Override
    public void postarVideo() throws MetodoExecutado {
        if(video.add(postarVideo))
            System.out.println("Postou vídeo no Facebook!");
        else{
            throw new MetodoExecutado("O método " + postarVideo + " já foi executado!");
        }
    }
    @Override
    public void postarComentario() throws MetodoExecutado {
        if(comentario.add(postarComentario))
            System.out.println("Postou comentário no Facebook!");
        else{
            throw new MetodoExecutado("O método " + postarComentario + " já foi executado!");
        }
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Facebook!");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Facebook!");
    }

}
