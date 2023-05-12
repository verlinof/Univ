import java.util.Scanner;
import java.lang.Math;
public class nomer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ukuranTabel = scanner.nextInt();
        int [][] array1 = new int[ukuranTabel][ukuranTabel];
        for(int i = 0; i < ukuranTabel; i++){
            for(int j = 0; j < ukuranTabel; j++){
                array1[i][j] = i*ukuranTabel+(j+1);
                if(i == j){
                    System.out.print((int)Math.random()+" ");
                }
                else {
                    System.out.print(array1[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}