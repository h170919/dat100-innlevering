import java.math.BigInteger;
import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn et heltall:");
        int n = scanner.nextInt();

        BigInteger resultat = BigInteger.ONE; 
        for (int i = 1; i <= n; i++) {
            resultat = resultat.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + resultat);
        scanner.close();
    }
}
