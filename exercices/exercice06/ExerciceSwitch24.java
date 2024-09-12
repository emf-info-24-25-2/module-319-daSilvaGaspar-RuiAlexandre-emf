package exercice06;

public class ExerciceSwitch24 {
    public static void main(String[] args) {
        int age = 9;
        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Poussin");
                break;

            case 8:
            case 9:
                System.out.println("Pupille");
                break;

            case 10:
            case 11:
                System.out.println("Minime");
                break;

            default:
            System.out.println("Inconnu");
                break;
        }
    }
    
}
