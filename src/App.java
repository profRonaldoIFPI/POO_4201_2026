import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //parte 2 
        ArrayList <Funcionario> colaboradores = new ArrayList<>();

        Funcionario f = new Funcionario("José", 1800);
        Vendedor v = new Vendedor("Francico", 1800, 1000);

        colaboradores.add(f);
        colaboradores.add(v);
        colaboradores.add(new Gerente("Raimundo", 1800, 2000));
         
        // generalização
        // gerar folha de pagamento
        for (Funcionario funcionario : colaboradores) {
            System.out.println(funcionario.getClass());
            funcionario.exibirDados();
        }
    }
}
