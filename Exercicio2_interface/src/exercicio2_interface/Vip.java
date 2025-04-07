
package exercicio2_interface;


public class Vip extends Cliente implements TratamentoVip{
    private double desconto;

    public Vip(double desconto, String nome, int idade, String telefone, String sexo, String estadoC) {
        super(nome, idade, telefone, sexo, estadoC);
        this.desconto = desconto;
    }

    @Override
    void imprimir() {
        System.out.println("O nome do cliente eh " + this.nome + " a idade do cliente eh "+ this.idade + " o telefone do cliente eh " + this.telefone + 
                " o sexo do cliente eh " + this.sexo + "e o estado do cliente eh "+ this.estadoC);
    }

    @Override
    public void enviarMsg() {
        System.out.println("Olá " + this.nome + " Venha conferir nossas promoções. Uma oferta especial te aguarda. Na compra de qualquer produto você terá " + this.desconto +
"% de desconto.");
    }
    
    
    
    
}
