public class App {
    public static void main(String[] args) throws Exception {
        Circulo c = new Circulo(15);
        Quadrado q = new Quadrado(12);
        TrianguloRetangulo t = new TrianguloRetangulo(3, 4, 5);

        FormaBidimensional[] formas = new FormaBidimensional[3]; //array ou vetor
        formas[0] = c;
        formas[1] = q;
        formas[2] = t;

        //usando a generalização
        for (FormaBidimensional forma : formas) {
            System.out.println("A área  do "+forma.getClass()+" é de "+forma.calcularArea());
        }
    }
}
