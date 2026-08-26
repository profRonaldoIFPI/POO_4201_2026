public class Funcionario { //superclasse
//atributos
    private String nome;
    private double salarioBase;
//construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
// metodos
    public double calcularPagamento(){
        return salarioBase;
    }
    public void exibirDados(){
        System.out.println(
            "Nome:\t" + nome +
            "\tPagamento:\t" + this.calcularPagamento()
        );
    }
// getter e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }   
}
