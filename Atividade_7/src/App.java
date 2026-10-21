public class App { //TesteFronta
    public static void main(String[] args) throws Exception {
        System.out.println(Veiculo.getTotalVeiculosCadastrados());
        
        CarroDePasseio c = new CarroDePasseio(
            "LVS-0622", 
            "Peugeot 206",
            20000.00,
            79
        );
                      
        System.out.println(Veiculo.getTotalVeiculosCadastrados());
    }
}
