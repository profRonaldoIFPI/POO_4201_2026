public class ValidadorIdade {
//atributos
    private int idade;
//construtor
    public ValidadorIdade(int idade){
        this.setIdade(idade);
    }
//metodos
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        if (idade < 18){
            throw new IllegalArgumentException("Idade não permitida: menor de idade");
        } else {
            this.idade = idade;
            System.out.println("Acesso liberado.");
        }
    }
}
