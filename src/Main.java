import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("Résultat: " + result);
        } catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, "Erreur détectée : ", e);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Itération " + i);
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro interdite !");
        }
        return a / b;
    }

    public void goodFunctionName() {
        System.out.println("Nom de méthode corrigé !");
    }
}
