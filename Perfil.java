// Perfil.java

import java.util.List;
import java.util.Random;

/**
 * Clase Perfil representa el perfil de un usuario en la aplicación.
 */
public class Perfil {

    // Atributos
    private String name;
    private String story;
    private List<String> hobbies;
    private List<String> foods;
    private List<String> funFacts;

    /**
     * Constructor de la clase Perfil
     *
     * @param name    Nombre del perfil.
     * @param story   Historia personal del perfil.
     * @param hobbies Lista de hobbies del perfil.
     * @param foods   Lista de comidas favoritas del perfil.
     * @param funFacts Lista de datos curiosos del perfil.
     */
    public Perfil(String name, String story, List<String> hobbies, List<String> foods, List<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    // Métodos de acceso
    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getFoods() {
        return foods;
    }

    public List<String> getFunFacts() {
        return funFacts;
    }

    // Métodos formateados

    /**
     * Devuelve la historia del perfil.
     */
    public String showStory() {
        return "My Story:\n" + story;
    }

    /**
     * Devuelve los hobbies y las comidas favoritas del perfil.
     */
    public String showFavorites() {
        return "Hobbies:\n" + String.join(", ", hobbies) +
                "\nFoods:\n" + String.join(", ", foods);
    }

    /**
     * Devuelve un dato curioso aleatorio del perfil.
     */
    public String showRandomFunFact() {
        Random random = new Random();
        return funFacts.get(random.nextInt(funFacts.size()));
    }
}
