package oscurilandia;

public class Ubicacion {

    // Atributos
    
    private int fila;
    private int columna;
    
    //Constructor

     // fila --> valor de la fila
     // columna --> valor de la columna

    public Ubicacion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
     // Devuelve el valor almacenado en fila

    public int getFila() {
        return this.fila;
    }
    
     // Devuelve el valor almacenado en columna

    public int getColumna() {
        return this.columna;
    }
    
    // Cambia el valor de fila
    
    public void setFila(int fila) {
        this.fila = fila;
    }
    	
    // Cambia el valor de columna

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
     // Muestra el contenido del objeto

    public String toString() {
        return "Ubicacion(fila: " + this.getFila() + ", columna: " + this.getColumna() + ")";
    }
    

}