public class ContaBancaria {
    int numeroConta;
    int agencia;
    String titular; // depois isso será uma composição
    double saldo;

    public ContaBancaria(int numeroConta, int agencia, String titutar, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = titutar;
        this.saldo = saldo;  // seria importante validar;     
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar (double valor){
        if(valor >=0 && saldo>= valor) this.saldo -= valor;
    }
}
