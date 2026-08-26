public class Gerente extends Funcionario {
//atributos
    private double bonus;
//construtor
    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase); //construtor da superclasse
        this.bonus = bonus;
    }
    public Gerente(String nome){ //sobrecarga do construtor
        super(nome, 0.0);
        this.bonus = 0;
    }
//metodos
    @Override //SOBREESCREVER, REESCREVER 
    public double calcularPagamento(){  //polimorfirmo
        return super.getSalarioBase() + getBonus();
    }
//getter e setter
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double comissao) {
        this.bonus = comissao;
    }
}

