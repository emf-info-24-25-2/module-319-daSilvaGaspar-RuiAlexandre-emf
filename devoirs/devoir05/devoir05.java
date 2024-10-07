import java.util.Scanner;

public class devoir05 {
/*tout dabord faudra crer un scanner pour scanner le nombre qu'on vas entrer et ensuite faudra aussi creer in chifre aleatoir qui est le chifre choisi par la machine
et faudra faire une boucle while car tent que le chifre qu'on a entrer n'est pas egale au chifre choisie par la machine faudra continuer a jouer et quand on a trouver
on sort de la boucle et on a gagner .*/
    public static void main(String[] args) {
        int nbre = (int) (Math.random() * (100 - 1 + 1)) + 1;//ici on a crer un nombre aleatoire entre 1 et 100
        System.out.println("nous allons jouer a devine le nombre.");

        Scanner scanner = new Scanner(System.in);//ici on a créer un scanneur pour scanner le nombre qu'on vas renter
        System.out.print("Entrez une valeur svp : ");
        int valeur = scanner.nextInt();
        scanner.nextLine();


        while (nbre != valeur) {//ici on a mit une boucle pour refaire a chaque fois qu'on se trompe
            if (nbre < valeur) {

                System.out.println("trop grand");
                System.out.print("Entrez une valeur svp : ");//on a remit le scanneur pour une nouvel tentative
                valeur = scanner.nextInt();
                scanner.nextLine();

            } else {
                System.out.println("trop petit");
                System.out.print("Entrez une valeur svp : ");
                valeur = scanner.nextInt();
                scanner.nextLine();
            }
        }

        System.out.println("Bravo, trouvé ! ");//ici on a mit apres la boucle comme sa sa ecrit bravo
        scanner.close();//ici on a fermer le scanneur
    }
}