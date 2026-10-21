public class Pessoa { //planos de como os objetos serão
    //ATRIBUTOS (DADOS)
    String nome;
    String endereco;
    String cpf;
    String email;
    //MÉTODO CONSTRUTOR

    public Pessoa(String nome, String endereco, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    //MÉTODOS   (CÓDIGO)
    void apresentarSe(){
        System.out.println("Oi, meu nome é " + nome +".");
    }
}