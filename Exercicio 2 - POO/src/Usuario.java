public class Usuario {
    private String nome;
    private String email;
    RedeSocial[] redesSociais;

    public Usuario(String nome, String email, RedeSocial[] redeSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redeSociais;
    }
    public void mostraInfo(){
        System.out.println("Dados do usuário");
        System.out.println("nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("-----------------------------------------------");
    }
}
