public class Animal {
    // Herencia
    
    // Atributos o propiedades
    String nombre;
    String color;
    int edad;
    static int contadorAnimal = 0;

    // Constructor
    public Animal(String nombre, String color, int edad){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        contadorAnimal++;
    }

    // Metodos o comportamientos
    public String hacerSonido(){
        return "Brrrrr";
    }

    public static int getCantidadAnimal(){
        return contadorAnimal;
    }

}
