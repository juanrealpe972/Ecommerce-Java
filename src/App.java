public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World from App!");

        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Ceron";
        persona1.edad = 19;
        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ing informatico";
        carrera1.duracion = 5;
        carrera1.estaEnCurso = true;

        persona1.carrera = carrera1;

        Persona persona2 = new Persona();
        persona2.nombre = "Camilo";
        persona2.apellido = "Realpe";
        persona2.edad = 41;
        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Ing sistemas";
        carrera2.duracion = 6;
        carrera2.estaEnCurso = true;
        
        persona2.carrera = carrera2;

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y está estudiando "+ persona1.carrera.nombre);
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años y está estudiando "+ persona2.carrera.nombre);
        System.out.println(persona1.enviarSaludo("Camilo"));
        System.out.println(persona2.enviarSaludo("Felipe"));

    }
}

