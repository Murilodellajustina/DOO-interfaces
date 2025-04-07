
package exercicio3_interface;


public class Quadrado implements FiguraGeometrica {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    

    @Override
    public void calcularArea() {
        float area = lado * lado;
        System.out.println("Área do Quadrado: " + area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro = 4 * lado;
        System.out.println("Perímetro do Quadrado: " + perimetro);
    }

    @Override
    public void exibirNome() {
        System.out.println("Figura: Quadrado");
    }
}