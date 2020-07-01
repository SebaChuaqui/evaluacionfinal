package oscurilandia;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

	// Genera una fecha aleatoria

	public class AleatorioFecha {

    // Atributos
    
    private Date fecha;
    
    // Constructor
    
    // Generador de la fecha aleatoria

    public AleatorioFecha() {
        GregorianCalendar calendario = new GregorianCalendar();
        
        int year = aleatorio(1980, 2010);
        int dia = aleatorio(1, calendario.getActualMaximum(Calendar.DAY_OF_YEAR));
        
        calendario.set(Calendar.YEAR, year);
        calendario.set(Calendar.DAY_OF_YEAR, dia);
        
        this.fecha = calendario.getTime();
    }
    
    // Metodos
    
    // Genera un valor aleatorio entre inicio y fin

    private int aleatorio(int inicio, int fin) {
        return inicio + (int) Math.round(Math.random() * (fin - inicio));
    }
    
    // Devuelve la fecha generada aleatoriamente

    public Date getFecha() {
        return this.fecha;
    }
    
    // Muestra el contenido del objeto

    public String toString() {
        return "AleatorioFecha(fecha: '" + this.getFecha().toString() + "')";
    }

}