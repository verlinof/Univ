import java.util.Scanner;

public class Nomer1 {
    public static void main(String[] args) {
        //nomer 1
        for (int nilai = 1; nilai<=20; nilai++){
            double akar = Math.sqrt(nilai);
            double error = nilai - akar*akar;
            System.out.println("akar dari "+ nilai + " adalah " + akar);
            System.out.println("error adalah " + error);
            System.out.println(" ");
        }
    }
}