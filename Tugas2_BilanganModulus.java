import java.util.Scanner;

public class Tugas2_BilanganModulus {
    public static void main(String[] args) {
        System.out.println("Program mengecek hasil bagi !");
        System.out.println("--------------------------------------------------");
        System.out.println("Masaukkan angka : ");
        Scanner inputAngka = new Scanner(System.in);
        int Angka = inputAngka.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("Bilangan " + Angka + " Habis dibagi oleh bilangan berikut : ");
        for (int i = 1; i <= Angka; i++) {
            if (Angka % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------------");
        inputAngka.close();
    }
}
