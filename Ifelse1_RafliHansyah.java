import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Akdreditas Nilai");
        System.out.println("Masukkan nilai (0 - 100)");

        int nilai = input.nextInt();
        char nilaiAkademik;

        if (nilai >= 85) {
            nilaiAkademik = 'A';
        } else if (nilai >= 70) {
            nilaiAkademik = 'B';
        } else if (nilai >= 55) {
            nilaiAkademik = 'C';
        } else if (nilai >= 40) {
            nilaiAkademik = 'D';
        } else {
            nilaiAkademik = 'E';
        }

        System.out.println("NILAI AKADEMIK= " + nilaiAkademik);
        input.close();
    }
}

