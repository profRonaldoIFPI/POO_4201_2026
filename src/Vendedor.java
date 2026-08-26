public class Vendedor extends Funcionario {
//atributos
    private double comissao;
//construtor
    public Vendedor(String nome, double salarioBase, double comissao){
        super(nome, salarioBase); //construtor da superclasse
        this.comissao = comissao;
    }
    public Vendedor(String nome){ //sobrecarga do construtor
        super(nome, 0.0);
        this.comissao = 0;
    }
//metodos
    @Override //SOBREESCREVER, REESCREVER 
    public double calcularPagamento(){  //polimorfirmo
        return super.getSalarioBase() + getComissao();
    }
//getter e setter
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
