import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable {
    // Constructor con 'super'
    public Delfin(String nombre){
        super(nombre);
    }

    // Metodos heredados
    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando en velocidad con su cola y saltando sobre el agua.");
    }

    @Override
    public void comunicarse() {
       System.out.println(nombre + " emite sonidos y chasquidos para comunicarse");
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de peces, calamares y crustáceos");
    }
}
