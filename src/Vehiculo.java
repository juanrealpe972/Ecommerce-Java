public class Vehiculo {
    // Metodos o propiedades
    private String marca;
    private String modelo;
    private int añoFabricacion;

    // Constructor
    public Vehiculo(String marca, String modelo, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    // Metodos o comportamientos
        public String darEspecificacionesDelVehiculo(){
            return "Este es tu vehículo: Marca " + getMarca() + " modelo: " + getModelo() + " fabricado el año: " + getAñoFabricacion();
        }
    // 

    // Encapsulamiento: getters - setters Forma manual o automatica
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    // Metodos 
    
}
