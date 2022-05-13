import java.util.Scanner;

public class Tugas3_DeretanBilanganPrima {
    public static void main(String[] args) {
        Scanner inputAngka = new Scanner(System.in);
        System.out.println("Program memunculkan deret bilangan prima !");
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan angka awal: ");
        int angkaAwal = inputAngka.nextInt();
        System.out.print("Masukkan angka akhir : ");
        int angkaAkhir = inputAngka.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("Bilangan prima dari " + angkaAwal + " sampai " + angkaAkhir +" :");
        for(int i=angkaAwal;i<=angkaAkhir;i++){
            int tampung = 0;
            for(int j=1;j<=i;j++){
                if (i%j==0){
                    tampung+=1;
                }
            }
            if (tampung==2){
                System.out.print(i+ " ");
            }
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        inputAngka.close();
    }
}

//import java.util.Scanner;
//public class Tugas3_DeretanBilanganPrima {
//    public static void main(String args[])
//    {
//        Scanner input = new Scanner(System.in);
//        int bil, awal, akhir;
//
//        System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
//        System.out.print("Mulai dari : ");
//        awal=input.nextInt();
//        System.out.print("Sampai : ");
//        akhir=input.nextInt();
//        System.out.println("----------------------------------------------");
//        for (int i=awal; i<=akhir; i++){
//            bil=0;
//            for (int j=1;j<=i;j++){
//                if (i%j==0){
//                    bil=bil+1;
//                }
//            }
//            if (bil==2){
//                System.out.print(i+" ");
//            }
//        }
//    }
//}