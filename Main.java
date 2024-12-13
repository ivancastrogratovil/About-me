// Main.java

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase Main para interactuar con el perfil del usuario.
 */
public class Main {

    public static void main(String[] args) {
        // Creación del perfil
        Perfil perfil = new Perfil(
                "Ivan Castro",
                "Soy un apasionado de la tecnología y la música. Me encanta aprender cosas nuevas.",
                Arrays.asList("🎸 Tocar guitarra", "📚 Leer libros", "🏃 Correr"),
                Arrays.asList("🍕 Pizza", "🍣 Sushi", "🍫 Chocolate"),
                Arrays.asList("Sé hablar tres idiomas.", "He viajado a 10 países.", "Puedo resolver un cubo de Rubik en menos de un minuto.")
        );

        Scanner scanner = new Scanner(System.in);
        int option;

        // Menú interactivo
        do {
            System.out.println("\nMenu AboutMe [" + perfil.getName() + "]");
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Fact");
            System.out.println("[4] Salir");
            System.out.print("Elige una opción: ");

            // Validar la entrada del usuario
            while (!scanner.hasNextInt()) {
                System.out.print("Opción inválida. Intenta de nuevo: ");
                scanner.next();
            }
            option = scanner.nextInt();

            // Procesar la opción
            switch (option) {
                case 1:
                    System.out.println(perfil.showStory());
                    break;
                case 2:
                    System.out.println(perfil.showFavorites());
                    break;
                case 3:
                    System.out.println("Fun Fact: " + perfil.showRandomFunFact());
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no existe. Intenta de nuevo.");
            }
        } while (option != 4);

        scanner.close();
    }
}
