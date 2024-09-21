package interfaces;

public interface Comunicable {
    // Las interfaces no pueden tener constructor

    // Variables -constantes
    // final || static || public  - private no se puede usar dentro de una interfas 
    // final String GRITO = "Ahhh";

    // DIFERENCIA ENTRE INTERFACES Y CLASES ABSTRACTAS
    // No se puede implementar mas de una clase abstracta, pero si se puede implementar mas de una interfas
    // Una interfas como no puede utilizar atributos privados, no es necesario utilizar getters y setteres

    // La clase que implemente esta interfas, estará obligada a usar este Método. 
    // Metodo
    void comunicarse();

}
