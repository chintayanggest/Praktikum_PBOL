package Tugas1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Namamu\t: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nimmu\t: ");
        int nim = scanner.nextInt();

        System.out.print("Hi "+nama);
        System.out.print(" "+nim);
    }
}