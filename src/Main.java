import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char pilihan;

        do {
            System.out.print("Masukkan Angka 1: ");
            int a = scanner.nextInt();

            System.out.print("Masukkan Angka 2: ");
            int b = scanner.nextInt();

            System.out.println("Angka 1 : " + a + " dan " + "Angka 2 : " + b);

            System.out.println("Penjumlahan: " + Calculator.tambah(a, b));
            System.out.println("Pengurangan: " + Calculator.kurang(a, b));
            System.out.println("Perkalian: " + Calculator.kali(a, b));

            try {
                double hasilBagi = Calculator.bagi(a, b);
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Pembagian: " + df.format(hasilBagi));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            pilihan = scanner.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        // Tutup Scanner setelah digunakan
        scanner.close();
    }
}
