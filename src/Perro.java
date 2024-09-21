public class Perro extends Animal {

    // Contructores
    public Perro(String nombre, String color, int edad){
        super(nombre, color, edad);
    }

    // Polimorfismo
    @Override
    public String hacerSonido(){
        return "Guau";
    }
}
