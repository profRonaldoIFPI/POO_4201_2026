public class Post {
    String autor;
    String conteudo;
    int curtidas;

    int curtir(){
        return ++curtidas;
    }
    void editarPost(String conteudo){
        this.conteudo = conteudo;
    }
    void exibirPost(){
        System.out.println(autor+"("+curtidas+"):\n\t'"+conteudo+"'");
    }
}
