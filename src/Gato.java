// Con esto se especifica que gato hereda de animal.

public class Gato extends Animal{

    public Gato(String nombre, String color, int edad){
        // Con la palabra 'super' estamos asignando la información heredada.
        super(nombre, color, edad);
    }
    
    // Polimorfismo
    // Con el operador 'Override' podemos sobreescribir un método
    @Override
    public String hacerSonido(){
        return "Miau";
    }

}
