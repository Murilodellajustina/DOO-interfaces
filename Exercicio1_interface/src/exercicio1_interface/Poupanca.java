
package exercicio1_interface;


public class Poupanca extends Conta {
    private double rendimento = 0;

    public Poupanca(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
        this.rendimento = 0;
    }


    @Override
    public double depositar(double valor) {
        this.saldo = this.saldo + valor;
        return this.saldo;
    }

    @Override
    public double sacar(double valor) {
       this.saldo = this.saldo - valor;
       return this.saldo;
    }
    
    public void calculaRendimento(double valor){
        this.rendimento = this.saldo * 0.05;
        this.saldo = this.saldo + this.rendimento;
    }
    
    @Override
    void Extrato() {
        System.out.println("O nome do titular eh " + titular + "o numero da conta eh "+ numero + "e o saldo da conta eh " + saldo + "e o rendimento foi de R$" + rendimento );
    }
    
}
