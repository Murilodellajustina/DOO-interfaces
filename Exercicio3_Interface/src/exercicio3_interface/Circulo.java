
package exercicio3_interface;


public class Circulo implements FiguraGeometrica {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    
    
    @Override
    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("Área do Círculo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("Perímetro do Círculo: " + perimetro);
    }

    @Override
    public void exibirNome() {
        System.out.println("Figura: Círculo");
    }
}
