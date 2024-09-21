import interfaces.Alimentable;
import interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable{
    // Atributos o propiedades
    int cantidadDeTentaculos;

    // Constructor con 'super' heredando nombre de CriaturasMarinas
    public Pulpo(String nombre, int cantidadDeTentaculos){
        super(nombre);
        this.cantidadDeTentaculos = cantidadDeTentaculos;
    }

    // Metodos heredados
    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando con sus " + cantidadDeTentaculos + " tentaculos.");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " saluda con sus " + cantidadDeTentaculos + " tentaculos.");
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de moluscos, crustáceos y en ocasiones de peces.");
    }
}
