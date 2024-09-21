public class Persona {
    // Atributos / propiedades
    public String nombre;
    public String apellido;
    public int edad;
    Carrera carrera;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean estaEnCurso){
        carrera = new Carrera(nombreCarrera, duracion, estaEnCurso);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Metodos / comportamientos
    public String darNombreCompleto(){
        return nombre + " " + apellido;
    }

    public String enviarSaludo(String saludado){
        if(edad > 40) return "Muy buenos dias, querido " + saludado;
        return "Hola, ¿como estás " + saludado + "?" ;
    }

}
