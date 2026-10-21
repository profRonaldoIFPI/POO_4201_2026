public class App {
    public static void main(String[] args){
    //Questão 1
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Fernanda", 17);
         // ESCREVER SÓ ASSIM ("Fernanda", 17)
         p1.apresentar();
         p2.apresentar();
    //Questão 2
        
    //Questão 3
        Produto pd1 = new Produto("biela", 100.0, 12); //("biela", 100.0, 12)
        System.out.println(pd1.calcularValorTotal());
        Produto pd2 = new Produto("articulador", 50);
        System.out.println(pd2.calcularValorTotal());
    }
    //Questão 4
    //Questão 5
    //Questão 6
}
