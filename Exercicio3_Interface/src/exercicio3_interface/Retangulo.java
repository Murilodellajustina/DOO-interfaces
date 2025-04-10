
package exercicio3_interface;



public class Retangulo extends Forma_geometrica {
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    

    @Override
    public void calcularArea() {
        float area = base * altura;
        System.out.println("Área do Retângulo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro = 2 * (base + altura);
        System.out.println("Perímetro do Retângulo: " + perimetro);
    }

    @Override
    public void exibirNome() {
        System.out.println("Figura: Retângulo");
    }
}