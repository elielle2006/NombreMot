import java.io.File;
import java.util.Scanner;

public class CompteurMots {
    public static void main(String[] args) {

        String nomDuFichier = "donnees.txt";
        int compteurTotal = 0;

        try {

            File fichier = new File(nomDuFichier);
            Scanner monLecteur = new Scanner(fichier);


            while (monLecteur.hasNextLine()) {
                String uneLigne = monLecteur.nextLine();


                if (!uneLigne.trim().isEmpty()) {
                    String[] mots = uneLigne.split(" ");

                    compteurTotal += mots.length;
                }
            }


            System.out.println("Total de mots dans le fichier : " + compteurTotal);
            monLecteur.close();

        } catch (Exception e) {
            System.out.println("Erreur : Créer un fichier 'donnees.txt' à la racine.");
        }
    }
}