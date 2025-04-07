
package exercicio3_interface;



public class Main {

    public static void main(String[] args) {
        
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica quadrado = new Quadrado(4);
        FiguraGeometrica retangulo = new Retangulo(6, 3);
        FiguraGeometrica triangulo = new Triangulo(8, 5);

        //System.out.println("----- Círculo -----");
        circulo.exibirNome();
        circulo.calcularArea();
        circulo.calcularPerimetro();

        //System.out.println("\n----- Quadrado -----");
        quadrado.exibirNome();
        quadrado.calcularArea();
        quadrado.calcularPerimetro();

        //System.out.println("\n----- Retângulo -----");
        retangulo.exibirNome();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        //System.out.println("\n----- Triângulo -----");
        triangulo.exibirNome();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}