import java.util.Scanner;

public class Tugas4_Palindrome {
    public static void main(String[] args) {
        System.out.println("Program mengecek palindrome !");
        System.out.println("--------------------------------------------------");
        Scanner inputString = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        String kalimat = inputString.nextLine();
        String dibalik = "";
        System.out.println("--------------------------------------------------");
        for (int i=kalimat.length()-1; i>=0;i--){ //karena index terakhir ny harus dikurang 1 biar kebaca
            char karakter = kalimat.charAt(i);
            dibalik += String.valueOf(karakter);
        }
        if (kalimat.equals(dibalik)){
            System.out.printf("%s merupakan palindrome",kalimat);
        }
        else{
            System.out.printf("%s bukan merupakan palindrome \n",kalimat);
        }
        inputString.close();

    }
}
