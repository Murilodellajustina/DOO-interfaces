
package exercicio1_interface;


public class Main {


    public static void main(String[] args) {
        
        Corrente co = new Corrente ("Marcelo", "1700", 1800.00);
        Poupanca p1 = new Poupanca ("Murilo", "4500", 1700.00);
        
        co.Extrato();
        
        p1.Extrato();
        p1.calculaRendimento(0);
        p1.Extrato();
    }
    
}
