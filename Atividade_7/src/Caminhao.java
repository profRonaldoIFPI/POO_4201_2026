public class Caminhao extends Veiculo {
//Atributos
    private int quantidadeEixos;
//Construtor
    public Caminhao (String placa, String modelo, double valorBase, int quantidadeEixos){
        super(placa, modelo, valorBase);
        this.setQuantidadeEixos(quantidadeEixos);
    }
//Medodos
    @Override 
    public double calcularLicenciamento(){
        return super.getValorBase() * 0.08 + (quantidadeEixos * 200);
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
    public void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos>=2 && quantidadeEixos<=9){
            this.quantidadeEixos = quantidadeEixos;
        }
    }
    
}
