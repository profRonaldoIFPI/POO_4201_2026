public class Quadrado extends FormaBidimensional {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override //reescrita ou sobrescrita
    public double calcularArea(){
        return lado*lado;
    }   
    @Override
    public double calcularPerimetro(){
        return lado*4;
    }
}
