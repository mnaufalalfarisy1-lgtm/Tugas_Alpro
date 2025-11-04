package Tugas_Alpro;
import java.util.Scanner;

public class hitunggaji {
    public static double hitungTunjangan(double gajiKotor, int jumlahAnak) {
        double tunjangan;
        if (jumlahAnak < 3) {
            tunjangan = 0.2 * gajiKotor;
        } else {
            tunjangan = 0.3 * gajiKotor;

        }
        return tunjangan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gajiKotor;
        int jumlahAnak;

        System.out.print("Masukkan gaji kotor: ");
        gajiKotor = sc.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();

        double tunjangan = hitungTunjangan(gajiKotor, jumlahAnak);
        System.out.println("Tunjangan yang diterima: " + tunjangan);

        sc.close();
    }
}
