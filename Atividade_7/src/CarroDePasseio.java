public class CarroDePasseio extends Veiculo{
//atributos
    private double potenciaMotor;
//construtor
    public CarroDePasseio(String placa, String modelo, double valorBase, double potenciaMotor){
        super(placa, modelo, valorBase); // construtor da superclasse
        this.potenciaMotor = potenciaMotor;
    }
//implementação do método abstrato herdado
    @Override 
    public double calcularLicenciamento(){
        return super.getValorBase() * 0.05 + (potenciaMotor * 15.0);
    }
}
