
package exercicio2_interface;


public class Normal extends Cliente{

    public Normal(String nome, int idade, String telefone, String sexo, String estadoC) {
        super(nome, idade, telefone, sexo, estadoC);
    }

    @Override
    void imprimir() {
        System.out.println("O nome do cliente eh " + this.nome + " a idade do cliente eh "+ this.idade + " o telefone do cliente eh " + this.telefone + 
                " o sexo do cliente eh " + this.sexo + "e o estado do cliente eh "+ this.estadoC);
    }
    
    
    
    
    
}
