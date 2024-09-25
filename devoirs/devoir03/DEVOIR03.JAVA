
public class DEVOIR03 {
    public static void main(String[] args) {
        int jour = 24;
        int mois = 9;
        int anne = 2024;
        int jourDELAN = 0;

        boolean estBissextile = (anne % 4 == 0 && anne % 100 != 0) || (anne % 400 == 0);
        int[] joursParMois = {31, (estBissextile ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mois < 1 || mois > 12) {
            System.out.println("Le mois n'est pas valide.");

            if (jour < 1 || jour > joursParMois[mois - 1]) {
                System.out.println("Le jour n'est pas valide.");

                for (int i = 0; i < mois - 1; i++) {
                    jourDELAN += joursParMois[i];
                }
                jourDELAN += jour;
    }
    System.out.println("Le " + jour + "/" + mois + "/" + anne + " est le jour " + jourDELAN + " de l'An.");
    }
}
}