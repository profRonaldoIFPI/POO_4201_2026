public abstract class Veiculo {
//stributos que serão herdados
    private String placa;
    private String modelo;
    private double valorBase;
//atributos qua não serão herdados
    private static int totalVeiculosCadastrados = 0;
    public static final double TAXA_AMBIENTAL = 0.02;// final quer dizer que o valor não pode ser mudado
//construtor
    public Veiculo(String placa, String modelo, double valorBase){
        this.placa = placa;
        this.modelo = modelo;
        this.valorBase = valorBase;
        totalVeiculosCadastrados++;
    }
// métodos
    public double calcularTaxaAmbiental(){
        return valorBase * TAXA_AMBIENTAL;
    }
    public abstract double calcularLicenciamento();
    
// getters e setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getValorBase() {
        return valorBase;
    }
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
//não vai ser herdado pelas subclasses
    public static int getTotalVeiculosCadastrados() { 
        return totalVeiculosCadastrados;
    }
}
