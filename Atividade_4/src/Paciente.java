/*
Crie uma classe Paciente.
 - Atributos: nome, peso, altura.
 - Método calcularIMC(): Deve retornar o resultado da fórmula: Peso/Altura².
*/
public class Paciente { 
    String nome;
    double peso;
    double altura;


    double calcularIMC(){
        double imc = peso/(altura*altura);
        return imc;
    }
    void classificarIMC(){
        double imc = calcularIMC();

        System.out.printf("IMC: %.1f%", imc);
        /*
            classifique o IMC do paciente.
        */
    }
}
