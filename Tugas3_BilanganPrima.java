import java.util.Scanner;

public class Tugas3_BilanganPrima {
    public static void main(String[] args) {
        System.out.println("Program mengecek bilangan prima !");
        System.out.println("--------------------------------------------------");
        System.out.println("Masaukkan angka : ");
        Scanner inputAngka = new Scanner(System.in);
        int Angka = inputAngka.nextInt();
        int tampung = 0;
        System.out.println("--------------------------------------------------");
        // bilangan prima hanya bisa dibagi 1 dan dirinya sendiri
        for (int i = 2; i <= Angka;i++) {
            if (Angka % i == 0) {
                tampung += 1;
            }
        }
        if (tampung == 1){
            System.out.println("Merupakan bilangan prima");
        }
        else {
            System.out.println("Bukan merupakan bilangan prima");
        }
        System.out.println("--------------------------------------------------");
        inputAngka.close();
    }
}
