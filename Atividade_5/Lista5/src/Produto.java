public class Produto {
//atributos
    String nome;
    double preco;
    int quantidade;
//construtoeres (com sobrecarga)
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto (String nome, double preco){
        this(nome, preco,0);
    /*
        this() é uma referencia ao proprio construtor
    */
    }
//métodos
    double calcularValorTotal(){
        return preco * quantidade;
    }
}
