import java.util.Scanner;

public class Tugas1_VerbalKonsonan {
    public static void main(String[] args) {
        System.out.println("Programming pengecekan huruf vokal dan konsonan !");
        System.out.println("--------------------------------------------------");
        System.out.println("Masukakan kalimat :");
        Scanner MasukPak = new Scanner(System.in);
        String kalimat = MasukPak.nextLine();

        char[] vokal = new char[kalimat.length()];
        char[] konsonan = new char[kalimat.length()];
        char[] huruf = new char[kalimat.length()];
        int angkaVokal = 0;
        int angkaKonsonan = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            huruf[i] = kalimat.charAt(i);
            if (Character.isLetter(huruf[i])){
                if (
                        huruf[i] == 'a' || huruf[i] == 'A'
                                || huruf[i] == 'i' || huruf[i] == 'I'
                                || huruf[i] == 'u' || huruf[i] == 'U'
                                || huruf[i] == 'e' || huruf[i] == 'E'
                                || huruf[i] == 'o' || huruf[i] == 'O'
                )
                {
                    vokal[i] = huruf[i];
                    angkaVokal += 1;
                }
                else {
                    konsonan[i] = huruf[i];
                    angkaKonsonan += 1;
                }
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Kalimat yang di input : " + kalimat);
        System.out.print("Huruf vokal : ");
        System.out.println(vokal);
        System.out.print("Huruf konsonan : ");
        System.out.println(konsonan);
        System.out.println("Huruf dalam kalimat berjumlah: " + (angkaVokal + angkaKonsonan));
        System.out.println("Huruf konsonan berjumlah : " + angkaKonsonan);
        System.out.println("Huruf vokal berjumlah : " + angkaVokal);
        System.out.println("--------------------------------------------------");
        MasukPak.close();
    }
}
