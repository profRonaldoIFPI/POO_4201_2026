import java.util.Scanner;
public class TestaIdade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("Digite o nome: ");
            String nome = entrada.next();
            System.out.println("Digite a idade: ");
            int idade = entrada.nextInt();
            Pessoa p = new Pessoa(nome, idade);
            System.out.println(p.apresentar());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Neste ponto agente deve colocar coisas que não podem eixa de executar jamais.");
            entrada.close(); //libera o stream de entrada
            // conexao com SGBD é um bom exemplo de uso necessário do finally
        }
    }
}
