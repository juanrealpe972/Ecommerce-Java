public abstract class Figura {
    // Este comportamiento sera obligatoria en las clases que hereden de figura
    abstract double calcularArea();

    // Metodo que debe ser utilizado en todas las clases que lo hereden
    void imprimirInformacion(){
        System.out.println("Esta información viene de la clase abstracta.");
    }
}
