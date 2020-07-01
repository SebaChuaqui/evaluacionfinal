package oscurilandia;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import oscurilandia.AleatorioFecha;

public class Kromi extends Carro {

    private Date fabricacion;
    private String marca;
	private Date fecha;

     // Constructor
     // Genera los valores de forma aleatoria
    
    public Kromi() {
        this.fabricacion = new AleatorioFecha().getFecha();
        this.marca = new String("Fiat");
    }

    public void AleatorioFecha() {
        GregorianCalendar calendario = new GregorianCalendar();
        
        int year = aleatorio(1980, 2010);
        int dia = aleatorio(1, calendario.getActualMaximum(Calendar.DAY_OF_YEAR));
        
        calendario.set(Calendar.YEAR, year);
        calendario.set(Calendar.DAY_OF_YEAR, dia);
        
        this.fecha = calendario.getTime();
    }
    
    // Devuelve la fecha de fabricación del vehículo

    private int aleatorio(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Date getFabricacion() {
        return fabricacion;
    }

    // Cambia la fecha de fabricación del vehículo

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    // Devuelve la marca del vehículo

    public String getMarca() {
        return marca;
    }

    // Cambia la marca del vehículo

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private int aleatorio1(int inicio, int fin) {
        return inicio + (int) Math.round(Math.random() * (fin - inicio));
    }
    
    // Devuelve la fecha generada aleatoriamente

    public Date getFecha() {
        return this.fecha;
    }
    
    // Muestra el contenido del objeto

    public String toString1() {
        return "AleatorioFecha(fecha: '" + this.getFecha().toString() + "')";
    }
    
    //  Muestra el contenido del objeto


    public String toString() {
        return "Kromi(ubicacion: " + this.getUbicaciones() + 
                "', ocupantes: " + this.getOcupantes() +
                ", fabricacion: '" + this.getFabricacion() +
                "', marca : '" + this.getMarca() + "')";
    }

    // Devuelve el tipo de vehículo

    public String getTipo() {
        return "Kromi";
    }

}