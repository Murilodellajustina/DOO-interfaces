
package exercicio2_interface;

abstract class Cliente {
    
    protected String nome;
    protected int idade;
    protected String telefone;
    protected String sexo;
    protected String estadoC;

    public Cliente(String nome, int idade, String telefone, String sexo, String estadoC) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.estadoC = estadoC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }
    
    abstract void imprimir();
        
    
    
}
