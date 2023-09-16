import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poengSum;

        for (int i = 1; i < 11; i++) {
            while (true)  {
                System.out.println("\nSkriv poengsum til student #" + i + ":");
                String input = scanner.nextLine();
        
                try {
                    poengSum = Integer.parseInt(input);
                    
                    if (poengSum > 100) {
                        System.out.println("Poengsummen er for høy. Prøv igjen.");
                    } else if (poengSum < 0) {
                        System.out.println("Poengsummen er for lav. Prøv igjen.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vennligst oppgi en gyldig poengsum. Prøv igjen.");
                }
            }
        
            char karakter = 'F';
            
            if (poengSum >= 90) {
                karakter = 'A';
    
            } else if (poengSum >= 80) {
                karakter = 'B';
    
            } else if (poengSum >= 60) {
                karakter = 'C';
                
            } else if (poengSum >= 50) {
                karakter = 'D';
    
            } else if (poengSum >= 40) {
                karakter = 'E';
            }
    
            System.out.println("Student #" + i + " har karakter: " + karakter);
            
        }

        scanner.close();
    }
}
