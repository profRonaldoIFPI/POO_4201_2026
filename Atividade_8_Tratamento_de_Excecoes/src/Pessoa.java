public class Pessoa {
    String nome;
    int idade;
    Pessoa(String nome, int idade) throws IllegalArgumentException{
        this.nome = nome;
        setIdade(idade);
    }
    void setIdade(int idade)  throws IllegalArgumentException{
        ValidadorIdade validador = new ValidadorIdade(idade);
        this.idade = validador.getIdade();
    }
    String apresentar(){
        return "Oi eu sou "+this.nome+" e tenho "+this.idade+" anos.";
    }
}
