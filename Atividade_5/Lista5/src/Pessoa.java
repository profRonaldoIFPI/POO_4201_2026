public class Pessoa {
//atributos
    String nome;
    int idade;
//métodos construtores 
    public Pessoa(){} // padrão
    public Pessoa(String nome, int idade){ //parametrizado
        this.nome = nome;
        this.idade = idade;
    }
/*
Como há 2 métosdos contrutores isso é uma sobrecarga de métodos [overload]
*/

//métodos
    public void apresentar(){
        System.out.println("Olá, meu nome é "+nome+" e tenho "+idade+" anos.");
    }
}