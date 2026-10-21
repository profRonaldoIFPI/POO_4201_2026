import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    //parte 2 atividade 6 
        ArrayList <Funcionario> colaboradores = new ArrayList<>();

        Funcionario f = new Funcionario("José", 1800);
        Vendedor v = new Vendedor("Francico", 1800, 1000);
        
    //adicionando objetos ja existentes ao arraylist
        colaboradores.add(f);
        colaboradores.add(v);
    //criando e adicionando objetos ao arraylist   
        colaboradores.add(new Gerente("Raimundo", 1800, 2000));
         
    // generalização
        System.out.println("-----------|  Folha de pagamento |-----------");
        for (Funcionario funcionario : colaboradores) {
            System.out.println(funcionario.getClass());
            funcionario.exibirDados();
        }
        System.out.println("---------------------------------------------");
    }
}
