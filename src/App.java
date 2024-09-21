public class App {
    public static void main(String[] args) throws Exception {
        // ------------------------------------------------------------------------------------------------------------
        // POO configurado con atributos publicos y además isntanciando una clase Carrera en la clase persona. 
        // Abstracción.
        System.out.println("Hello, World from App!");

        // Instanciar
        Persona persona1 = new Persona("Juan", "Ceron", 19, "Ing informatico", 10, false);

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y está estudiando "+ persona1.carrera.nombre + " que tiene una duración de " + persona1.carrera.duracion + " semestres.");
        System.out.println(persona1.enviarSaludo("Camilo") + "\n");

        // ------------------------------------------------------------------------------------------------------------
        // POO configurada con atributos privados, encapsulamiento getters y setters
        // Abstracción - Encapsulamiento.
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "TXL", 2024);

        vehiculo1.setMarca("TOYOTA");
        vehiculo1.setModelo("Prado TX");

        System.out.println("Bienvenido " + vehiculo1.darEspecificacionesDelVehiculo() + "\n");

        // ------------------------------------------------------------------------------------------------------------
        // POO configurado con herencia de la clase Animal y con polimorfismo de la misma.
        // Abstracción - Herencia - Polimorfismo.
        Animal animal1 = new Animal("Pepe", "Blanco", 12);
        Gato gato1 = new Gato("Max", "Café", 3);
        Perro perro1 = new Perro("Peluche", "Amarillo", 5);

        System.out.println("El animal llamado: " + animal1.nombre + " hace.");
        System.out.println(animal1.hacerSonido());
        System.out.println("El gato llamado: " + gato1.nombre + " hace.");
        System.out.println(gato1.hacerSonido());
        System.out.println("El perro llamado: " + perro1.nombre + " hace.");
        System.out.println(perro1.hacerSonido());
        
        System.out.println("El total de los animales creados es de: " + Animal.getCantidadAnimal());
        System.out.println("Yo atiendo a mis animalitos en la veterinaria: " + Veterinaria.nombre);
    }
}

