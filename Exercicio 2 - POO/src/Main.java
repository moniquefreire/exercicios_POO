public class Main {
    public static <NullPointerExceptionException> void main(String[] args) {

        RedeSocial googlePlus = new GooglePlus("iloveinatel", 155);
        RedeSocial instagram = new Instagram("iloveinatel", 545);

        RedeSocial[] redesSociais = new RedeSocial[2];
        redesSociais[0] = googlePlus;
        redesSociais[1] = instagram;

        Usuario usuario = new Usuario("Usuário", "usuario@inatel.br", redesSociais);

        usuario.mostraInfo();
        for(int i = 0; i< redesSociais.length; i++) {

            try {
                redesSociais[i].postarFoto();
            } catch (MetodoExecutado e) {
                System.out.println(e.getMessage());
            }
            try {
                redesSociais[i].postarVideo();
            } catch (MetodoExecutado e) {
                System.out.println(e.getMessage());
            }
            try {
                redesSociais[i].postarComentario();
            } catch (MetodoExecutado e) {
                System.out.println(e.getMessage());
            }

        }
    }
}