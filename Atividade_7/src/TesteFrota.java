import java.util.ArrayList;

public class TesteFrota {
    /*
    o Instancie dois objetos do tipo CarroPasseio e dois do tipo Caminhao.
    o Exiba os dados de cada veículo, o valor do licenciamento e a taxa ambiental.
    o Ao final, imprima o total de veículos cadastrados invocando o método
    estático Veiculo.getTotalVeiculosCadastrados().
    */
    public static void main(String arg[]){
        CarroDePasseio c1 = new CarroDePasseio(
            "LVS-0622", 
            "Peugeot 206",
            20000.00,
            79
        );
        CarroDePasseio c2 = new CarroDePasseio(
            "PIL5050", 
            "VW Voyage",
            30000.00,
            80
        );
        Caminhao ca1 = new Caminhao(
            "RSL2022", 
            "Mercedes 1050", 
            300000,
            3
        );
        Caminhao ca2 = new Caminhao(
            "FLO2026", 
            "Scania 2026", 
            1000000,
            9
        );
        ArrayList<Veiculo> frota = new ArrayList<>();
        frota.add(c1);
        frota.add(c2);
        frota.add(ca1);
        frota.add(ca2);
        System.out.println("Frota: \n");
        double totalLicenciamento=0;
        double totalTaxaAmbiental=0;
        for (Veiculo veiculo : frota) {
            System.out.println(
                "Modelo: "+veiculo.getModelo()+
                "\tPlaca :"+veiculo.getPlaca()+
                "\tLicenciamento: "+veiculo.calcularLicenciamento()+
                "\tTaxa ambietal: "+veiculo.calcularTaxaAmbiental()
            );
            totalLicenciamento += veiculo.calcularLicenciamento();
            totalTaxaAmbiental += veiculo.calcularTaxaAmbiental();
        }
        System.out.println("\nTotal de veículos:"+Veiculo.getTotalVeiculosCadastrados());
        System.out.println("Total de licenciamento: "+totalLicenciamento);
        System.out.println("Total de Taxa ambietal: "+totalTaxaAmbiental);
    }
}
