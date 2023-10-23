package RandomNumber;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int numarGenerat;
        int numarCautat = 42;

        do{
            numarGenerat = random.nextInt(100);
            System.out.println("Numarul generat este:" + numarGenerat);
        }while(numarGenerat != numarCautat);
        System.out.println("Am gasit numarul 42");
    }
}
