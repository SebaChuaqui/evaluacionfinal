package oscurilandia;

import java.util.Scanner;

import oscurilandia.Tablero;
import oscurilandia.Funciones;

public class Principal {
	

    private static void imprimirMenu() {
        System.out.println(" 1 - Lanzar huevo");
        System.out.println(" 2 - Lanzamiento aleatorio");
        System.out.println(" 3 - Terminar juego");
        System.out.print("Ingrese el número correspondiente a la acción: ");
    }
    
    private static void lanzarHuevo(Tablero tablero, Scanner scanner) {
        int filas = Tablero.FILAS - 1;
        int columnas = Tablero.COLUMNAS - 1;
        
        System.out.print("Ingrese la fila (0 - " + filas + "): ");
        int fila = Funciones.pedirNumero(scanner, 0, filas);
        
        System.out.print("Ingrese la columna (0 - " + columnas + "): ");
        int columna = Funciones.pedirNumero(scanner, 0, columnas);
        
        juego(tablero, fila, columna);
    }
    
    private static void lanzamientoAleatorio(Tablero tablero) {
        int fila = (int) (Math.random() * Tablero.FILAS);
        int columna = (int) (Math.random() * Tablero.COLUMNAS);
        
        juego(tablero, fila, columna);
    }
    
    private static void juego(Tablero tablero, int fila, int columna) {
        String celdaAfectada = tablero.arrojarHuevo(fila, columna);
        System.out.printf("Atacando celda(): ", fila, columna);
        
        if(celdaAfectada != null) {
            if(celdaAfectada.equals("H"))
                System.out.println("Ya habias atacado esa celda");
            else if(celdaAfectada.equals("K"))
                System.out.println("Le diste a una Kromi!");
            else if(celdaAfectada.equals("C"))
                System.out.println("Le diste a un Caguano!");
            else if(celdaAfectada.equals("T"))
                System.out.println("Le diste a una Trupalla!");
        } else
            System.out.println("No le diste a nada!");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tablero tablero = new Tablero(false);
        int opcion;
         
        do {
            System.out.println(tablero);
            imprimirMenu();
            opcion = Funciones.pedirNumero(scanner, 1, 3);
            
            if(opcion == 1)
                lanzarHuevo(tablero, scanner);
            else if(opcion == 2)
                lanzamientoAleatorio(tablero);
        } while(opcion != 3);
        
        tablero.setjuego(true);
        System.out.println(tablero);
        
        System.out.println("Listado de Carros: ");
        tablero.getCarros().forEach(carro -> System.out.println("  " + carro));
        
        System.out.println("Listado de Huevos: ");
        tablero.getHuevos().forEach(huevo -> System.out.println("  " + huevo));
        
        scanner.close();
    }

}