
package exercicio1_interface;


public class Corrente extends Conta {

    public Corrente(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }

    @Override
    void Extrato() {
        System.out.println("O nome do titular eh " + titular + "o numero da conta eh "+ numero + "e o saldo da conta eh " + saldo);
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
    
        
    }
    

