public class TrianguloRetangulo  extends FormaBidimensional {
    private double catetoA, catetoB, hipotenusa;
    public TrianguloRetangulo(double catetoA, double catetoB, double hipotenusa) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = hipotenusa;
    }
    @Override //reescrita ou sobrescrita
    public double calcularArea(){
        return  catetoA * catetoB / 2;
    }   
    @Override
    public double calcularPerimetro(){
        return catetoA + catetoB + hipotenusa;
    }
}