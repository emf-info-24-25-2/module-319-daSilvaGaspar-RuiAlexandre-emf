public class devoir06 {
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static int[] genereTableau(int max, int min, int taille) {
        int[] tableau = new int[TAILLE_TABLEAU];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;
        }
        return tableau;
    }

    public static int rechercheMin(int[] tableau) {
        int valeurMin = VALEUR_MAX + 1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < valeurMin) {
                valeurMin = tableau[i];
            }
        }
        return valeurMin;
    }
    public static int rechercheMax(int[] tableau) {
        int valeurMax = VALEUR_MIN - 1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > valeurMax) {
                valeurMax = tableau[i];
            }
        }
        return valeurMax;
    
    }

    //les méthodes sont bonnes... faites celle-ci par analogie! et ajoutez le main
    public static int rechercheValeur(int[] tableau, int valeur) {
        
            return valeur;
    }
}
