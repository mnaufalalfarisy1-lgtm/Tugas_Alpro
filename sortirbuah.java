import java.util.Scanner;

public class sortirbuah{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int besar = 0, sedang = 0, kecil = 0;
        String lagi;

        do {
            System.out.print("Masukan berat jeruk: ");
            double berat = input.nextDouble();
            if (berat > 150) {
                besar++;
            } else if(berat >= 100){
                sedang++;
            } else if (berat < 100) {
                kecil++;
            }

            System.out.print("input jeruk lagi? (y/n): ");
            lagi = input.next().toLowerCase();
        } while (lagi.equalsIgnoreCase("y"));

        int totalbuah =  besar + sedang + kecil;
        System.out.println("Total jeruk yang di entry = " + totalbuah);
        
        if (besar >= sedang && besar >= kecil) {
            System.out.printf("Jeruk terbanyak berukuran BESAR sejumlah %d", besar);
        } else if (sedang >= besar && sedang >= kecil) {
            System.out.printf("Jeruk terbanyak berukuran SEDANG sejumlah %d", sedang);
        } else if (kecil >= sedang && kecil >= besar) {
            System.out.printf("Jeruk terbanyak berukuran KECIL sejumlah %d", kecil);
        }
        input.close();
    }
}