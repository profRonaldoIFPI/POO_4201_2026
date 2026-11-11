package q7;

public class ContaBancaria{
    private double saldo;
    ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    public void sacar(double valor){
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso!\nSaldo atualizado: "+this.saldo);
    }
}