public class Rectangulo extends Figura {
    // Atributos o propiedades 
    double lado1;
    double lado2;

    // Constructor o intancia
    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodo heredado
    @Override
    double calcularArea() {
        return lado1 * lado2;
    }
}
