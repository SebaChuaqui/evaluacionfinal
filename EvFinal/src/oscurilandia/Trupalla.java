package oscurilandia;

import oscurilandia.AleatorioNombre;

public class Trupalla extends Carro {

    private int armadura;
    private String manipula;

    
    // Constructor
    // Genera los valores de forma aleatoria
    
    public Trupalla() {
        this.armadura = (int) (Math.random()*5 +1);
        this.manipula = new AleatorioNombre().getNombre();
    }
    
    // Devuelve la armadura del vehículo

    public int getArmadura() {
        return armadura;
    }

    // Cambia el valor de la armadura del vehículo

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    // Devuelve el nombre del conductor del vehículo

    public String getManipula() {
        return manipula;
    }

    // Cambia el nombre del conductor del vehículo

    public void setManipula(String ocupante) {
        this.manipula = ocupante;
    }
    
    // Muestra el contenido del objeto
    
    public String toString() {
        return "Trupalla(ubicacion: " + this.getUbicaciones() +  
                "', ocupantes: " + this.getOcupantes() +
                ", armadura: " + this.getArmadura() +
                ", manipula: '" + this.getManipula() + "')";
    }
    
 // Devuelve el tipo de vehículo

    public String getTipo() {
        return "Trupalla";
    }

}