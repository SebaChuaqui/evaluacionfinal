package oscurilandia;

public class Huevo {

    // Atributos
    
    private int puntaje;
    private Ubicacion ubicacion;
    
    // Constructor
    
    // Puntaje obtenido al momento de lanzar el huevo
    // Ubicacion Celda donde cayo el huevo
    
    public Huevo(int puntaje, Ubicacion ubicacion) {
        this.puntaje = puntaje;
        this.ubicacion = ubicacion;
    }
    
    // Devuelve el puntaje obtenido

    public int getPuntaje() {
        return this.puntaje;
    }
    
    // Devuelve la ubicación del huevo

    public Ubicacion getUbicacion() {
        return this.ubicacion;
    }
    
    // Cambia el valor del puntaje

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    // Cambia la ubicación del huevo en el tablero

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    // Muestra el contenido del objeto

    public String toString() {
        return "Huevo(puntaje: " + this.getPuntaje() + ", ubicacion: " + this.getUbicacion() + ")";
    }
    
}