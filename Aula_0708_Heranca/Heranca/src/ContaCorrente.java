public class ContaCorrente extends ContaBancaria {
    double limiteCheque;
    double jurosCheque;

    public ContaCorrente(int numeroConta, int agencia, String titutar, double saldo, double limiteCheque, double jurosCheque){
        super(numeroConta, agencia, titutar, saldo); //construtor da superclasse   
        this.limiteCheque = limiteCheque;
        this.jurosCheque = jurosCheque;
    }
        public void exibirSaldo(){
        System.out.println(
            "Agencia:\t"+super.agencia+
            "\nConta:\t" + super.numeroConta+
            "\nTitular:\t" + super.titular+
            "\nSaldo:\t" + super.saldo+
            "\nValor disponível:\t" +this.limiteCheque+super.saldo
       );
    }
}
