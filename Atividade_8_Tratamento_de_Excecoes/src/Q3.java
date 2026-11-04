public class Q3 {
    public static void main(String[] args){
        System.out.println(converte("34"));
        System.out.println(converte("abc"));
        System.out.println(converte("100"));
    }
    public static int converte(String numStr){
        try{
            int numInt = Integer.parseInt(numStr);
            return numInt;
        }catch(NumberFormatException erro){
            System.out.println("A conversão falhou: \""+numStr+"\"");
            return 0;
        }
    }
}
