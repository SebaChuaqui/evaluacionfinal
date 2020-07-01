package oscurilandia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oscurilandia.AleatorioFecha;

//Clase Abstracta Carro

public abstract class Carro {

   //Atributos
    
    private Ubicacion ubicacion;
    private Date ingreso;
    private int ocupantes;
    
    private List<Ubicacion> ubicaciones;
    
    //Constructor
    
    // Genera los valores de los atributos de forma aleatoria a excepción de la ubicacion

    public Carro() {
        this.ingreso = new AleatorioFecha().getFecha();
        this.ocupantes = (int) (Math.random() * 20 + 1);
        this.ubicaciones = new ArrayList<>();
    }
    
    //Metodos
    
     // Agrega una ubicación al listado de ubicaciones

    public void addUbicacion(Ubicacion ubicacion) {
        this.ubicaciones.add(ubicacion);
    }
    
     // Devuelve el tipo de vehículo
    
    public abstract String getTipo();
    
     // Devuelve el listado de ubicaciones

    
    public List<Ubicacion> getUbicaciones() {
        return this.ubicaciones;
    }
    
     // Devuelve la ubicación del objeto

    public Ubicacion getUbicacion() {
        return this.ubicacion;
    }
    
     // Devuelve la fecha de ingreso del vehículo 

    public Date getIngreso() {
        return this.ingreso;
    }
    
     // Devuelve la cantidad de ocupantes del vehículo

    
    public int getOcupantes() {
        return this.ocupantes;
    }
    
     // Cambia la ubicación del vehículo

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
     // Cambia la fecha de ingreso del vehículo 
    
    public void setIngreso(Date fecha) {
        this.ingreso = fecha;
    }

     // Cambia la cantidad de ocupantes del vehículo
    
    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

     // Muestra el contenido del objeto

    public String toString() {
        return "Carro(ubicacion: " + this.getUbicaciones() + 
                ", ingreso: '" + this.getIngreso() + 
                "', ocupantes: " + this.getOcupantes() + ")";
    }
    
}