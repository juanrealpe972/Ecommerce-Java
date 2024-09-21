public abstract class CriaturasMarinas {
    // Atributos o propiedades
    String nombre;

    // Constructor
    public CriaturasMarinas(String nombre){
        this.nombre = nombre;
    }

    // Esto obliga a sobre escribir en las clases que hereden de las CriaturasMarinas
    // Metodo
    abstract void nadar();
}
