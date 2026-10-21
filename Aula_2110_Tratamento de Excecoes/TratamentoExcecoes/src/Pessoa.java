public class Pessoa {
    private int idade;
    public Pessoa(int idade){
        setIdade(idade);
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade<18){
            throw new IllegalArgumentException("Apenas 18+");
        } else {
            this.idade = idade; //+18
        }
    }
}
