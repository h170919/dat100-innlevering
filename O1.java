import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn bruttoinntekt:");
        
        while (true) {
            String input = scanner.nextLine();
            input = input.replaceAll(" ", ""); // unngår at du får feilmelding hvis du skriver 190 000 istedenfor 190000
            
            try {
                int bruttoinntekt = Integer.parseInt(input);
                scanner.close();
                
                int trinn = 0;
                double trinnskatt = 0;
                
                if (bruttoinntekt >= 2000000) {
                    trinnskatt = 0.174;
                    trinn = 5;
                } else if (bruttoinntekt >= 969200) {
                    trinnskatt = 0.16;
                    trinn = 4;
                } else if (bruttoinntekt >= 643800) {
                    trinnskatt = 0.13;
                    trinn = 3;
                } else if (bruttoinntekt >= 267900) {
                    trinnskatt = 0.04;
                    trinn = 2;
                } else if (bruttoinntekt >= 190350) {
                    trinnskatt = 0.017;
                    trinn = 1;
                } 
                
                double lonnMedSkatt = bruttoinntekt - (trinnskatt * bruttoinntekt);
                
                System.out.println("Trinn: " + trinn + "\nSkatt: " + trinnskatt + "\nLønn med tilleggsskatt: " + lonnMedSkatt);
                break;
                
            } catch (NumberFormatException e) {
                System.out.println("Vennligst oppgi en gyldig bruttoinntekt. Prøv igjen.");
            }
        }
    }
}
