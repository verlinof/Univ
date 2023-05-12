import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDiinginkan = scanner.nextInt();
        int [] array1 = new int[jumlahDiinginkan];
        for(int i = 0; i < jumlahDiinginkan; i++){
            int angka = scanner.nextInt();
            array1[i]=angka;
        }
        int nilaiMin = array1[0];
        int nilaiMax = array1[0];
        for(int i = 1; i < jumlahDiinginkan; i++){
            if (nilaiMin > array1[i]){
                nilaiMin = array1[i];
            }
            if (nilaiMax < array1[i]){
                nilaiMax = array1[i];
            }
        }
        System.out.println(nilaiMax);
        System.out.println(nilaiMin);
    }
}