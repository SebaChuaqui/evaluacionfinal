package oscurilandia;

import java.util.Scanner;

public class Funciones {

	// Verifica que el número ingresado por el usuario sea un número válido

    public static int pedirNumero(Scanner scanner) {
        int entero;
        
        while(!scanner.hasNextInt()) {
            System.err.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        
        entero = scanner.nextInt();
        
        if(scanner.hasNextLine())
            scanner.nextLine();

        return entero;
    }
    
    // Verifica que el número ingresado por el usuario sea un número válido y que sea mayor o igual al límite inferior

    public static int pedirNumero(Scanner scanner, int limiteInferior) {
        int entero;
        
        do {
            entero = pedirNumero(scanner);
            
            if(entero < limiteInferior)
                System.err.print("Por favor, ingrese un número mayor o igual a " + 
                        limiteInferior + ": ");
        } while(entero < limiteInferior);
        
        return entero;
    }
    
    // Verifica que el número ingresado por el usuario sea un número válido y se encuentre entre
    // los valores limiteInferior y limiteSuperior (incluidos)

    public static int pedirNumero(Scanner scanner, int limiteInferior, int limiteSuperior) {
        int entero;
        
        do {
            entero = pedirNumero(scanner);
            
            if(entero < limiteInferior || entero > limiteSuperior)
                System.err.print("Por favor, ingrese un número entre " + limiteInferior + 
                        " y " + limiteSuperior + ": ");
        } while(entero < limiteInferior || entero > limiteSuperior);
        
        return entero;
    }
    
}