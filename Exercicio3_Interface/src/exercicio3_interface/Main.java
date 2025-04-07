
package exercicio3_interface;



public class Main {

    public static void main(String[] args) {
        
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica quadrado = new Quadrado(4);
        FiguraGeometrica retangulo = new Retangulo(6, 3);
        FiguraGeometrica triangulo = new Triangulo(8, 5);

        circulo.exibirNome();
        circulo.calcularArea();
        circulo.calcularPerimetro();

        quadrado.exibirNome();
        quadrado.calcularArea();
        quadrado.calcularPerimetro();

        retangulo.exibirNome();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        triangulo.exibirNome();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}