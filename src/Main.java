import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Création d'une liste d'animaux crieurs
        List<Animal> animaux = new ArrayList<>();


        //Instanciation des objets avec condition pour qu'il puisse entrer dans la liste ou non
        Chien chien = new Chien();
        if (chien.saitCrier()){
            animaux.add(chien);
        }
        Chat chat = new Chat();
        if (chat.saitCrier()){
            animaux.add(chat);
        }
        Lapin lapin = new Lapin();
        if (lapin.saitCrier()){
            animaux.add(lapin);
        }

        /* Boucle pour parcourir l'arraylist avec les méthodes:
         size(): Retourne le nombre d'éléments dans la liste
         get(): Retourne l'élément à sa position spécifique dans la liste
         */
        for (int i = 0; i < animaux.size(); i++){

            // Récupérer l'index
            Animal animal = animaux.get(i);

            /* Obtenir le nom de l'objet par la récupération de sa classe
               et appliquer méthode pour retourner le nom en string
               puis convertir en minuscule
             */
            String typeAnimal = animal.getClass().getSimpleName().toLowerCase();

            System.out.println("Le " + typeAnimal + " fait " + animal.crier());
        }

    }
}