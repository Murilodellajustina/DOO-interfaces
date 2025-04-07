
package exercicio3_interface;



public class Triangulo implements FiguraGeometrica {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
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
        double area = (base * altura) / 2;
        System.out.println("Área do Triângulo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do Triângulo: fórmula depende dos 3 lados");
    }

    @Override
    public void exibirNome() {
        System.out.println("Figura: Triângulo");
    }
}
