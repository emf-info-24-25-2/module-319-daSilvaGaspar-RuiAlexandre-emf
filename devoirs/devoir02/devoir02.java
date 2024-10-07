
public class devoir02 {
    public static void main(String[] args) {
        
        final int CAPACITE_RESERVOIR_A = 3;
        final int CAPACITE_RESERVOIR_B = 5;

        int reservoirA = 0;
        int reservoirB = 0;

       
        int maxCapacite = CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B;
        int remplissage = 0 + (int)(Math.random() * ((maxCapacite) + 1));
      
        System.out.println("il y a " + remplissage + " litres a remplir.");

        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {  
                reservoirA++;
                System.out.println("Remplissage du réservoir A...");
            } else if (reservoirB < CAPACITE_RESERVOIR_B) {  
                reservoirB++;
                System.out.println("Remplissage du réservoir B...");
            }

            System.out.println("le réservoir A: " + reservoirA + ", le réservoir B: " + reservoirB);
        }

        System.out.println("Remplissage terminé.");
    }
}
