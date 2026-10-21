public class Quadrado extends Forma2d {
    int lado;
    
    public Quadrado(int lado) {
        super.quantidaDeLados = 4;
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
    @Override
    public double calcularPerimetro(){
        return lado*4;
    }
}
