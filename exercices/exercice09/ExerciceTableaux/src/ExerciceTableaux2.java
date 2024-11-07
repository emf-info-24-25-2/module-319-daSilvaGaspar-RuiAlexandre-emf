import java.util.Random;
public class ExerciceTableaux2 {
    final int[] montableau = new int [10];
    }
public static void main(String[] args) {
    int taille = 10;

    int[] montableau = new int [10];

    Random random = new Random();

    for (int i = 0; i < taille; i++) {
        montableau[i] = random.nextInt(6);

        for (int j = 0; j < montableau.length; j++) {
            System.out.println("cellules 1 : " + montableau[j]);
        }
    }
}
    
    
