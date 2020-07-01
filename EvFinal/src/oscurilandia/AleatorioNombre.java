package oscurilandia;

// Genera un nombre completo (Nombre + Apellido) aleatorio

public class AleatorioNombre {

    // Constantes
    
    // Listado de Nombres 
    private final String[] NOMBRES = {"Luis", "Arturo", "Bayron", "Martin", "Jose",
    		"Santiago", "Tomas", "Benjamin", "Lucas", " Maximiliano", "Joaquin", "Matias", 
    		 "Luciano", "Gonzalo", "Julian", "Gabriel", "Manuel", "Juan"};
            
         
    
    // Listado de Apellidos
    private final String[] APELLIDOS = {"Contreras", "Silva", "Martinez", "Sepulveda", "Morales", "Rodriguez", 
    		"Gutierrez", "Castro", "Vargas", "Alvarez", "Tapia", "Fernandez", "Sanchez", "Carrasco", "Gomez",
            "Lopez", "Jara", "Vergara", "Rivera", "Figueroa"};
         
    // Atributos
    
    private String nombre;
    
    // Constructor
    
     // Genera el nombre completo de forma aleatoria

    public AleatorioNombre() {
        this.nombre = NOMBRES[(int) (Math.random() * NOMBRES.length)] + " " +
                APELLIDOS[(int) (Math.random() * APELLIDOS.length)];
    }
    
    // Devuelve el nombre completo generado

    public String getNombre() {
        return this.nombre;
    }
    
    // Muestra el contenido del objeto

    public String toString() {
        return "AleatorioNombre(nombre: '" + this.getNombre() + "')";
    }

}