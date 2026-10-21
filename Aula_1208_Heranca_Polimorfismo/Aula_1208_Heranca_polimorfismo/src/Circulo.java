public class Circulo extends FormaBidimensional {
    private double raio;
    private final double PI = 3.1415; //CONSTANTE
    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override //reescrita ou sobrescrita
    public double calcularArea(){
        return PI*raio*raio;
    }   
    @Override
    public double calcularPerimetro(){
        return 2*PI*raio;
    }
}
