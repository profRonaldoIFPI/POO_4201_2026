public class Smartphone { //a classe é só o plano
//atributos
    String marca;
    String modelo;
    double bateria;
//metodos
    void verStartus(){
        System.out.println(
            "Marca:\t"      + marca +
            "\nModelo:\t"   + modelo +
            "\nBateria:\t"  + bateria
        );
    }
    String statusBateria(){
        return "Nível de bateria: " + bateria + " %";
    }
    double usarApp(int tempo){ //minutos
        bateria = bateria - bateria * (tempo*0.01);
        return bateria; 
    } 
}
