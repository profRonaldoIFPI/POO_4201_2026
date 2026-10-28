public class TestaIdade {
    public static void main(String[] args) {
        try{
            ValidadorIdade v = new ValidadorIdade(15);
            System.out.println(v.getIdade());
        } catch(IllegalArgumentException erro){
            System.err.println(erro.getMessage());
        }
    }
}
