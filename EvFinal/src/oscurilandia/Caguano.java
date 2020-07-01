package oscurilandia;

public class Caguano extends Carro {
    
    private int EfectividadTiro;
    private String colorC;
    
    //Constructor
    
    public Caguano() {
        this.EfectividadTiro = (int) (Math.random()* 10);
        this.colorC = "azul "; 
    }

     // Devuelve el valor de la efectividad de tiro

    public int getEfectividadTiro() {
        return EfectividadTiro;
    }

    // Cambia el valor de la efectividad de tiro
    
    public void setEfectividadTiro(int EfectividadTiro) {
        this.EfectividadTiro = EfectividadTiro;
    }
    
    // Devuelve el valor del confeti
    	
    public String getColorC() {
        return colorC;
    }

    // Cambia el valor del color del confeti

    public void setColorC(String colorC) {
        this.colorC = colorC;
    }


    //  Muestra el contenido del objeto

    public String toString() {
        return "Caguano(ubicacion: " + this.getUbicaciones() +
                "', ocupantes: " + this.getOcupantes() + 
                ", Efectividad de Tiro: " + this.getEfectividadTiro() +
                ", color: " + this.getColorC() + ")";
    }

    // Devuelve el tipo de vehículo
    
    public String getTipo() {
        return "Caguano";
    }
}