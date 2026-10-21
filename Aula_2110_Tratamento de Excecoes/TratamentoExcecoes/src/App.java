public class App {
    public static void main(String[] args) throws Exception {
        try{
            Pessoa p = new Pessoa(18);
            System.out.println(p.getIdade());
        } catch (IllegalArgumentException erro){
            System.out.println(erro.getMessage());
        }       

        // System.out.println("Inicio do Main.");
        // funcao1();
        // System.out.println("Final do Main.");
    }
    static void funcao1() {
        System.out.println("Inicio da funcao1.");
        funcao2();
        System.out.println("Final da funcao1.");
    }
    static void funcao2(){
        System.out.println("Inicio da funcao2.");
        try{
            int nums[] = {1,2,3,4}; //indices de 0 a 3
            System.out.println(nums[4]); // arrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Mensagem de erro: " + e.getMessage());
            System.out.println("Causa: "+ e.getCause());
        }
        System.out.println("Final da funcao2.");
    }
}

