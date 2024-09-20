public class Persona {

    // Atributos / propiedades
    public String nombre;
    public String apellido;
    public int edad;
    Carrera carrera;

    // Metodos / comportamientos
    public String darNombreCompleto(){
        return nombre + " " + apellido;
    }

    public String enviarSaludo(String saludado){
        if(edad > 40) return "Muy buenos dias, querido " + saludado;
        return "Hola, ¿como estás " + saludado + "?" ;
    }

}
