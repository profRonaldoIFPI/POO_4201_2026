/* O CÓDIGO QUE DEVERIA ESTAR NA QUESTÃO 6 */
import java.util.Scanner;
public class Q6 {
    public static void main(String arg[]){ //calculadora
        Scanner entrada = new Scanner(System.in);
        try{
            int a = entrada.nextInt();
            int b = entrada.nextInt();
            if (a >= 10) {
                throw new Exception("Apenas valores menores que 10.");
            }
            float c = a/b; //se b for 0 isso vai se uma ArithmeticException 
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Generica:"+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Especifica:"+e.getMessage());
        }
    }
}
/* A RESPOSTA:
    O multicath deve ser ordenado da exceção mais especifica para a mais genérica, pois do contrário as mais específicas não executam.
*/