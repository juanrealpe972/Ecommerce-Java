public class Circulo extends Figura {
    // Atributos o propiedades
    double radio;

    // Contructor o intancia
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Metodo heredado
    @Override
    double calcularArea(){
        return Math.PI * radio * radio;
    }
}
