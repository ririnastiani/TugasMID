// RIRIN ASTIANI 13020210132

import java.util.Scanner;

public class Hitung0132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mil, meter;
        final double SATU_MIL = 1.609;

        System.out.print("Masukkan jumlah mil: ");
        mil = input.nextDouble();

        meter = mil * SATU_MIL * 1000;
        System.out.printf("Hasil %.0f mil = %.3f meter", mil, meter);
    }
}